package com.jiely.mapper;


import com.jiely.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 * Created by Administrator on 2017/2/15.
 */
public interface IUserMapper {
    //#{name}:参数占位符
    @Select("select *from user where userName=#{name}")
    public List<User> likeName(String name);

    @Select("select *from User where id = #{id}")
    public User getById(long id);

    @Select("select *from User where userName=#{userName} and password=#{password}")
    public List<User> login(User user);

    @Select("select userName from User where id = #{id}")
    public String getNameById(long id);


    @Select("select *from user")
    public List<User>  getAll();
    /**
     * 保存数据.
     */
    @Insert("insert into user(userName,password,createDate) values(#{userName},#{password},#{createDate})")
    @Options(useGeneratedKeys=true,keyProperty="userId",keyColumn = "id")
    public void save(User user);
}
