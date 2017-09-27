/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.BookDao;
import domain.Book;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.JdbcUtil;

/**
 *
 * @author huangzhen
 */
public class BookDaoImpl implements BookDao{

    @Override
    public void addBook(Book book) {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "insert into book_information(bookname,"
                + "writer, type, price, page, annotation) values(?,?,?,?,?,?)";
        Object[] params = {book.getBookname(),book.getWriter(),book.getType(),book.getPrice(),book.getPage(),book.getAnnotation()};
        try {
            qr.update(sql, params);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book findBook(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Book> getAllBook() {
        List<Book> list = null;
        try {
            
            QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
            String sql = "select * from book_information";
            list = (List<Book>) qr.query(sql, new BeanHandler(Book.class));      
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return list;
    }

   
}
