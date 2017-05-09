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
public class RSSIRecord {
    
    private Integer id_loc;
    private Integer id_ap;
    private double value;
    private Integer occurence;

    public Integer getId_loc() {
        return id_loc;
    }

    public void setId_loc(Integer id_loc) {
        this.id_loc = id_loc;
    }

    public Integer getId_ap() {
        return id_ap;
    }

    public void setId_ap(Integer id_ap) {
        this.id_ap = id_ap;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Integer getOccurence() {
        return occurence;
    }

    public void setOccurence(Integer occurence) {
        this.occurence = occurence;
    }
    
    

}
