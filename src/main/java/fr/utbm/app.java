/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm;

import fr.utbm.util.HibernateUtil;
import java.sql.SQLException;
import org.hibernate.Session;

/**
 *
 * @author PanJin
 */
public class app {
    
    
	public static void main(String[] args) throws SQLException{             
           
            Session session = HibernateUtil.getSessionFactory().openSession();

         
	}
}
