/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;



import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class ClientDAO extends DAO {
     public ClientDAO()  throws ClassNotFoundException{
        super();
    }
    public boolean checkLogin(String username, String password)
    {
         boolean result = false;
        String sql = "SELECT * FROM tblClient WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {                
                result = true;
            }
        }catch(Exception e) {
            e.printStackTrace();
    }
         return result;
    }
}
