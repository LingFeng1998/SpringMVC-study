package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lingfeng
 * @date 2021-12-16
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model){
        model.addAttribute("msg","hello!!!");
        return "hello";
    }

    @RequestMapping("/t1")
    public String test1(String name,Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "/hello";
    }
}
