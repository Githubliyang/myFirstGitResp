package com.example.demo.controller;

import com.example.demo.dao.user;
import com.example.demo.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by li on 2018/10/16.
 */
@Controller
public class usercontroller {
    @Resource
    private userService userservice;
    @RequestMapping(value = "login.do")
    public void userLog(@RequestParam("username") String username,@RequestParam("psw") String password
    ,HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
    if(username.equals("root")&&password.equals("li6227688")){
        req.getSession().setAttribute("username",username);
        req.getRequestDispatcher("jsp/main.jsp").forward(req,resp);
    }else{
        System.out.println("登录失败");
    }
    }
    @RequestMapping(value = "/mysql.do")
    public String select(HttpServletRequest req, HttpServletResponse resp){
        List<user> list=userservice.listalluser();
        req.setAttribute("list",list);
       return "default";
    }
    @RequestMapping(value="/page.do")
    public String showbyPage(HttpServletRequest request, Model model){
        userservice.showUserByPage(request, model);
        return "index";
    }
    @RequestMapping(value = "/delete.do")
    public void deleteUser(@RequestParam("id") int id,HttpServletResponse resp) throws IOException {
        userservice.deleteUserById(id);
        System.out.println("删除成功。。。。。。");
        resp.sendRedirect("mysql.do");
    }
    @RequestMapping(value = "/mul.do")
    public ModelAndView findUserType(){
        ModelAndView model = new ModelAndView();
        model.addObject("list",userservice.findTypeUser());
        model.setViewName("1");
        return model;
    }
    @RequestMapping(value = "/free")
    public String freemarker(Map<String,String> map){
        map.put("name","李阳");
        return "hello";
    }
}
