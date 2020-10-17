package com.baby.tt.controller;


import com.baby.tt.common.po.User;
import com.baby.tt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/logincheck")
    public String logincheck(String username, String password) {
        User login = userService.logincheck(username, password);
        if (login != null) {
            return "index";
        } else {
            return "shibai";
        }
    }

    //注册：
    @GetMapping("/end")
    public String end(HttpServletRequest req, HttpServletResponse resp) {
        User user = new User();
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        user.setName(req.getParameter("name"));
        user.setBirthday(req.getParameter("birthday"));
        user.setSex(req.getParameter("sex"));
        user.setTelephone(req.getParameter("telephone"));
        user.setEmail(req.getParameter("email"));
        boolean flag = userService.register(user);
        if (flag == true) {
            return "register_ok";
        } else {
            return "注册失败";
        }
    }
}
