/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Control;

import DAO.FoodDAO;
import Model.Food;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "FoodControl", urlPatterns = {"/FoodControl"})
public class FoodControl extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*response.setContentType("text/html;charset=UTF-8");
        try{
            FoodDAO pd = new FoodDAO();
            ArrayList <Food> list = pd.getListFood();
            request.setAttribute("food", list);
            //request.getRequestDispatcher("SearchFoodView.jsp").forward(request, response);
            RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("SearchFoodView.jsp");

		// Forward (Chuyển tiếp) yêu cầu, để hiển thị dữ liệu trên trang JSP.
		dispatcher.forward(request, response);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        try{
            FoodDAO pd = new FoodDAO();
            ArrayList <Food> list = pd.getListFood();
            
            request.setAttribute("food", list);
            request.getRequestDispatcher("client/SearchFoodView.jsp").forward(request, response);
		// Forward (Chuyển tiếp) yêu cầu, để hiển thị dữ liệu trên trang JSP.
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        //doGet(request,response);
        try{
            FoodDAO pd = new FoodDAO();
            String foodname=request.getParameter("foodname");
            ArrayList <Food> list = pd.searchFood(foodname);
            
            request.setAttribute("food", list);
            request.getRequestDispatcher("client/SearchFoodView.jsp").forward(request, response);
            

		// Forward (Chuyển tiếp) yêu cầu, để hiển thị dữ liệu trên trang JSP.
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
