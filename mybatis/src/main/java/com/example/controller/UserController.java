package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by Administrator on 2017/2/23.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findOne")
    public User getUser(long id){
        return userService.findById(id);
    }

    @RequestMapping("/save")
    public User save(String name ){
        User user = new User();

        user.setUsername(name);
        user.setPassword("123456");
        userService.save(user);
        return  user;
    }

}
