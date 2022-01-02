/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Food;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FoodDAO extends DAO{

    public FoodDAO() throws ClassNotFoundException {
        super();
    }
    public ArrayList<Food> getListFood()
    {
        ArrayList<Food> list = new ArrayList<>();
        String sql = "select * from tblfood";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Food p = new Food();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setPrice(rs.getString("price"));
                p.setDescription(rs.getString("description"));
                p.setUrlimage(rs.getString("url"));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    public ArrayList<Food> searchFood(String name)
    {
        ArrayList<Food> fd = new ArrayList<>();
        String sql = "select * from tblfood where name like '%"+name+"%'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Food p = new Food();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setPrice(rs.getString("price"));
                p.setDescription(rs.getString("description"));
                p.setUrlimage(rs.getString("url"));
                fd.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(fd.get(0).getName());
        return fd;
    }
    public Food getFoodDetail(String idfood)
    {
        Food detail = new Food();
        String sql = "select * from tblfood where id = '"+idfood+"'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Food p = new Food();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setType(rs.getString("type"));
                p.setPrice(rs.getString("price"));
                p.setDescription(rs.getString("description"));
                p.setUrlimage(rs.getString("url"));
                detail = p;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return detail;
    }
}
