/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.Food;
import Model.OrderedFood;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class OrderedFoodDAO extends DAO{

    public OrderedFoodDAO() {
        super();
    }
    public boolean UpdateOrderedFood(String idBookedTable, ArrayList<Food> listOrderedFood )
    {
        boolean kq =false;
        try
        {
           String SQl="INSERT INTO tblOrderedFood(quantity,idFood,idBookedTable) value(?,?,?)"; 
        }catch(Exception e)
        {
            kq= false;
            e.printStackTrace();
        }
        return kq;
    }
    public ArrayList<OrderedFood> getOrderTimes(String idFood)
    {
        ArrayList<OrderedFood> orderfood =null;
        return orderfood;
    }
}
