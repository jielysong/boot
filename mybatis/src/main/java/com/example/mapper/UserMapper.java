package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 * Created by Administrator on 2017/2/23.
 */
public interface UserMapper {

    @Select("select *from tbluser where username = #{name}")
    public List<User> likeName(String name);

    @Select("select *from tbluser where id = #{id}")
    public User getById(long id);

    @Select("select username from tbluser where id = #{id}")
    public String getNameById(long id);

    @Insert("insert into tbluser (username,password) values(#{username},#{password})")
    @Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
    public void save(User user);

}
