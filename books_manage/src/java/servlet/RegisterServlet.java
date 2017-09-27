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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author huangzhen
 */
public class RegisterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String userpassword = request.getParameter("userpassword");
        String userpassword1 = request.getParameter("userpassword1");
       /**test
        * 
        
        Object params[] = {username, userpassword, userpassword1};
        request.setAttribute("message", userpassword1);
        request.getRequestDispatcher("/message.jsp").forward(request, response);
        */ 
       
       /**
        * 若新注册的用户名已存在，也可以注册，此处要修改
        */
                if (userpassword.equals(userpassword1)) {
            try {
                User user = new User();
                user.setUsername(username);
                user.setUserpassword(userpassword);

                UserDaoImpl service = new UserDaoImpl();
                service.addUser(user);

                request.setAttribute("message", "注册成功");
                request.getRequestDispatcher("/message.jsp").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
                request.setAttribute("message", "注册失败");
                request.getRequestDispatcher("/message.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("message", "两次密码不同，请重新回主页面注册");
            request.getRequestDispatcher("/message.jsp").forward(request, response);

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
