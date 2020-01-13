package com.lzy.mycloud.order.dao;

import com.lzy.mycloud.order.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    @Insert({"insert into user(username,password,age,time) values(#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR},#{age,jdbcType=INTEGER},now())"})
    int addUser(User user);
}
