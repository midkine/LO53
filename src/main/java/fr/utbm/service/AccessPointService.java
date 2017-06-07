/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.service;

import fr.utbm.repository.AccessPointDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author PanJin
 */
public class AccessPointService {
    
    AccessPointDAO AccessPointDAO;
   
    public AccessPointService() {
        AccessPointDAO = new AccessPointDAO();
    }
    public void addAP(){
        
       AccessPointDAO.addAPTest();
    }

}
