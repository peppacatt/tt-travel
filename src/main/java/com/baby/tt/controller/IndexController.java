package com.baby.tt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/{getUI}")
    public String getUI(@PathVariable String getUI){
        return getUI;
    }

}
