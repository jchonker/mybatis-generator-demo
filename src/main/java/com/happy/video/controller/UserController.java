package com.happy.video.controller;

import com.happy.video.pojo.User;
import com.happy.video.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUserById")
    private User selectUserById(Integer uid){
        User user = userService.selectByPrimaryKey(uid);
        return user;
    }
}
