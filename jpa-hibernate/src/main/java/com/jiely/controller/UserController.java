package com.jiely.controller;

import com.jiely.entity.User;
import com.jiely.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *
 * Created by Administrator on 2017/2/17.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public Iterable<User> save(){
        User customer = new User();
        customer.setPassword("111111");
        customer.setCreateDate(new Date());
        customer.setUserName("江海1");
        customer.setScreenName("少帅1");
        userService.add(customer);
        return userService.findAll();
    }

    @RequestMapping("/findOne")
    public User getUser(String id){
        return userService.findOne(id);
    }

}
