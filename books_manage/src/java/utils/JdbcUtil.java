/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author huangzhen
 */
public class JdbcUtil {
    
    /*
    释放连接
    */
    private static void releaseConnection(Connection conn){
        try {
            if(conn != null){
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    private static DataSource ds = null;
    
    static{
        ds = new ComboPooledDataSource("mariadb");
    }
    
    /*
        获取连接
    */
    public static DataSource getDataSource(){
		return ds;
	}
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }
}
