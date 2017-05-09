/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.entity;

/**
 *
 * @author PanJin
 */
public class Location {
    
    private Integer Id;
    private double x;
    private double y;
    private Integer map_id;

    public Location() {
    }
    
    

    public Location(Integer Id, double x, double y, Integer map_id) {
        this.Id = Id;
        this.x = x;
        this.y = y;
        this.map_id = map_id;
    }
   

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Integer getMap_id() {
        return map_id;
    }

    public void setMap_id(Integer map_id) {
        this.map_id = map_id;
    }
    
    
    
}
