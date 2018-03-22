package com.obiero.bank.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {




    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
