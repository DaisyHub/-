/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Book;
import java.util.List;

/**
 *
 * @author huangzhen
 */
public interface BookDao {

        void addBook(Book book);
        
        void deleteBook(Book book);
        
        void updateBook(Book book);
        
        Book findBook(String name);
        
        List<Book> getAllBook();
    
}
