package com.edward.springbootmybaties.controller;

import com.edward.springbootmybaties.bean.User;
import com.edward.springbootmybaties.mapper.UserMapper;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @ResponseBody
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userMapper.getUserById(id);
        return user;
    }

    @ResponseBody
    @GetMapping("/user")
    public User insertUser(User user){
        int i = userMapper.insertUser(user);
        return user;
    }



}
