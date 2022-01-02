/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Table;

/**
 *
 * @author Administrator
 */
public class BookedTable {
    private String id;
    private String checkin;
    private String checkout;
    private String status;
    private Table table;
    private TableInfo tableInfo;

    public BookedTable() {
    }

    public BookedTable(String id, String checkin, String checkout, String status, Table table, TableInfo tableInfo) {
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
        this.status = status;
        this.table = table;
        this.tableInfo = tableInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public TableInfo getTableInfo() {
        return tableInfo;
    }

    public void setTableInfo(TableInfo tableInfo) {
        this.tableInfo = tableInfo;
    }
    
}
