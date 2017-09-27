/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.UserDao;
import domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.JdbcUtil;

/**
 *
 * @author huangzhen
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(User user) {
        try {
                QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
                String sql = "insert into user(username,userpassword) values (?,?)";
                Object params[] = {user.getUsername() ,user.getUserpassword()};
                qr.update(sql, params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findUser(String username,String userpassword) {
        try {
            QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
            String sql = "select * from user where username=? and userpassword=?";
            Object[] params = {username, userpassword};
            return (User)qr.query(sql, params, new BeanHandler(User.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
