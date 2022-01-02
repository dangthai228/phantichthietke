/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Administrator
 */
public class DAO {
    public static Connection con;
    public DAO()
    {
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/restman";
            String dbClass = "com.mysql.jdbc.Driver";
            try {
                Class.forName(dbClass);
                con = (com.mysql.jdbc.Connection) DriverManager.getConnection (dbUrl, "root", "");
                System.out.println("this connection is successful");
            }catch(Exception e) {
                e.printStackTrace();
            } 
    }
}
