/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.BookedTable;
import Model.Client;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class BookedTableDAO extends DAO
{

    public BookedTableDAO() {
        super();
    }
    public ArrayList<BookedTable> getBookedTable(String idclient )
    {
        ArrayList<BookedTable> bk= null;
        return bk; 
    }
    public ArrayList<BookedTable> searchBookedTable(Date bookingtime )
    {
        ArrayList<BookedTable> sbk= null;
        return sbk; 
    }
    public BookedTable getTableDetail(String idBookedTable)
    {
        BookedTable detail =new BookedTable();
        return detail;
    }
}
