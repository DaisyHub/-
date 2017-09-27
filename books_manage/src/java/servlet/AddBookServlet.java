/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.impl.BookDaoImpl;
import domain.Book;
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
public class AddBookServlet extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String bookname = request.getParameter("bookname");
        String writer = request.getParameter("writer");
        String type = request.getParameter("type");
        String price = request.getParameter("price");
        int page = Integer.parseInt(request.getParameter("page"));
        String annotation  = request.getParameter("annotation");
        
        Book book = new Book();
        book.setBookname(bookname);
        book.setWriter(writer);
        book.setType(type);
        book.setPrice(price);
        book.setPage(page);
        book.setAnnotation(annotation);
        
        BookDaoImpl service = new BookDaoImpl();
        service.addBook(book);
        
        request.setAttribute("message", "书本添加成功");
        request.getRequestDispatcher("/message.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }


}
