package com.example.main;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
