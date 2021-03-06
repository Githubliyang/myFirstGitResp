package com.example.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by li on 2018/10/20.
 */
@WebFilter(filterName = "sessionFilter",urlPatterns = "/jsp/*")
public class loginFilter implements Filter{

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }
    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        HttpServletRequest request = (HttpServletRequest)arg0;
        HttpServletResponse response = (HttpServletResponse)arg1;
        HttpSession session = request.getSession();

        if(session.getAttribute("username")==null
                && request.getRequestURI().indexOf("/jsp/login.jsp") == -1){

            request.getRequestDispatcher("/jsp/safe.jsp").forward(request, response);
        }else{
            // 已经登录，继续请求下一级资源（继续访问）
            arg2.doFilter(arg0, arg1);
        }

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }
}
