package com.example.demo.controller;

import com.example.demo.service.cityService.cityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by li on 2018/11/27.
 */
@Controller
public class CityController {
    @Resource
    private cityService cityservice;
    @RequestMapping(value = "/data2")
    public ModelAndView listAllcity(){
       ModelAndView model = new ModelAndView();
       model.addObject("cityList",cityservice.listAllcity());
       model.setViewName("hello");
       return model;
    }
}
