package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController {

    @RequestMapping(value="/hello")
    public String hello(){
        System.out.println("hello,this is a demo");
        //return "hello,This is a springboot demo";
        return "default";
    }
    @RequestMapping(value="/boot")
    @ResponseBody
    public ModelAndView goHome(){
        System.out.println("go to the home page!");
        ModelAndView mode = new ModelAndView();
        mode.addObject("name", "李阳");
        mode.setViewName("default");
        return mode;
    }

}
