package com.jiely.service;


import com.jiely.mapper.IUserMapper;
import com.jiely.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Administrator on 2017/2/15.
 */
@Service
public class UserService {

    @Autowired
    private IUserMapper userMappper;

    public User findById(long id){
        return userMappper.getById(id);
    }

    public List<User> findLikeName(String name){
        return userMappper.likeName(name);
    }

    public String findNameById(long id){
        return userMappper.getNameById(id);
    }

    public List<User>  findAll(){
        return userMappper.getAll();
    }

    public void save(User user){
        userMappper.save(user);
    }

    public User login(User user){
        return userMappper.login(user).get(0);
    }
}
