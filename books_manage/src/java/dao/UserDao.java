/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.User;

/**
 *
 * @author huangzhen
 */
public interface UserDao {
    
    void addUser(User user);
    
    void deleteUser(User user);
    
    void updateUser(User user);
    
    User findUser(String username, String userpassword);
}
