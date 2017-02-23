package com.system.controller;

import com.system.entities.User;
import com.system.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by panxiang on 2017-01-03.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public User getUser(@RequestParam("id") long id){
        System.out.print(id);
        User user = userService.getUser(id);
        return user;
    }
}
