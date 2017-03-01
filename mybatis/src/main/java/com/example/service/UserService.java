package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * Created by Administrator on 2017/2/23.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public  List<User> getLikeName(String name){
         return userMapper.likeName(name);
    }

    @Transactional
    public void add(User user){
        userMapper.save(user);
    }

    public User findById(long id){
        return userMapper.getById(id);
    }

    public String getNameById(long id){
        return userMapper.getNameById(id);
    }

    public void save(User user){
        userMapper.save(user);
    }

}
