package com.jiely.service;

import com.jiely.entity.User;
import com.jiely.repository.UserRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/2/17.
 */
@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private JdbcTemplate jdbcTemplate;


    @Transactional
    public void add(User customer){
        userRepository.save(customer);
    }

    @Transactional
    public void delete(User customer){
        userRepository.delete(customer);
    }


    public User findOne(String id){
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return jdbcTemplate.queryForObject("select * from user where user_id = ?", rowMapper,id);
    }

    public Iterable<User> findAll(){
        return userRepository.findAll();
    }
}
