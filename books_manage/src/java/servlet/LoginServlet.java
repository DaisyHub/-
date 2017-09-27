/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.impl.UserDaoImpl;
import domain.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author huangzhen
 */
//@WebServlet(name="LoginServlet",urlPatterns={"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String userpassword = request.getParameter("userpassword");
        User user = new UserDaoImpl().findUser(username, userpassword);
        
        if (user == null) {
            request.setAttribute("message", "用户名或密码不正确");
            request.getRequestDispatcher("/message.jsp").forward(request, response);
            return;
        }
            request.getSession().setAttribute("user", user);
            request.getRequestDispatcher("/frame/main.jsp").forward(request, response);
            
        
    }

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                    doGet(request, response);
    }

}
