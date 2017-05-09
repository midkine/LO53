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
public class AccessPoint {
    
    private Integer id;
    private String mac_adr;
    private Integer location_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMac_adr() {
        return mac_adr;
    }

    public void setMac_adr(String mac_adr) {
        this.mac_adr = mac_adr;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }
    
    

    
}
