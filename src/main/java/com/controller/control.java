package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class control {
    @RequestMapping(value="/")
    public String home()
    {
        return "test";
    }

}
