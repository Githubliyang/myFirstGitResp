package com.example.demo.service;

import com.example.demo.dao.Page;
import com.example.demo.dao.user;
import com.example.demo.dataSource.DatabaseContextHolder;
import com.example.demo.dataSource.DatabaseType;
import com.example.demo.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by li on 2018/10/16.
 */

@Service
public class userService {
    @Autowired
    userMapper usermapper;
    @Transactional
    @Cacheable(value = "user")
    public List<user> listalluser(){
        return usermapper.listAlluser();
    }
    public void showUserByPage(HttpServletRequest request,Model model){
        DatabaseContextHolder.setDatabaseType(DatabaseType.test2);
        String pageNow = request.getParameter("pageNow");
        Page page = null;
        List<user> u = new ArrayList<user>();
        //查询用户总数
        int totalCount = (int) usermapper.getUserCount();
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            u = this.usermapper.selectUserByPage(page.getStartPos(), page.getPageSize());
        } else {
            page = new Page(totalCount, 1);
            u = this.usermapper.selectUserByPage(page.getStartPos(), page.getPageSize());
        }
        model.addAttribute("usermapper", u);
        model.addAttribute("page", page);
    }
    @Transactional
    @CacheEvict(value = "user",allEntries = true)
    public Integer deleteUserById(int id){
        return usermapper.deleteUserById(id);
    }
   public  List<user> findTypeUser(){
        return usermapper.findTypeUser();
    }

}
