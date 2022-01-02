/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Table implements Serializable{
        private String id;
        private String type;
        private int pepple;
        private String description;

    public Table() {
    }

    public Table(String id, String type, int pepple, String description) {
        this.id = id;
        this.type = type;
        this.pepple = pepple;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPepple() {
        return pepple;
    }

    public void setPepple(int pepple) {
        this.pepple = pepple;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
        
}
