package com.baby.tt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";

    }

    @RequestMapping("/footer")
    public String footer() {
        return "footer";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/header")
    public String header() {
        return "header";
    }

    @RequestMapping("/route_list")
    public String route_list() {
        return "route_list";
    }

}
