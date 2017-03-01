package com.jiely.controller;

import com.github.pagehelper.PageHelper;
import com.jiely.model.User;
import com.jiely.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 *
 * Created by Administrator on 2017/2/16.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(long id){
        System.out.println("id="+id);
        return userService.findById(id);
    }

    @RequestMapping("/getName")
    public String getName(long id){

        return userService.findNameById(id);
    }

    @RequestMapping("/getList")
    //http://localhost:8080/user/getList?name=hello
    public List<User> getName(String name){
        System.out.println("userName="+name);
        return userService.findLikeName(name);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello1111111";
    }

    @RequestMapping("/getAll")
    public List<User> getAll(){
        PageHelper.startPage(1,5);
        return userService.findAll();
    }

    @RequestMapping("/login1")
    public User login(String name, String password){
        User user = new User();
        user.setPassword(password);
        user.setUserName(name);
        user = userService.login(user);

        return user;
    }

    @RequestMapping("/save")
    public List<User> save(){

        for(int i=0; i<22; i++){
            User user = new User();
            user.setUserName("jiely"+i);
            user.setPassword("12345"+i);
            user.setCreateDate(new Date());
            userService.save(user);
        }

        return userService.findAll();
    }

}
