/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.repository;

import fr.utbm.entity.AccessPoint;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PanJin
 */
public class AccessPointDAO {
        
    private Integer id;
    private String mac_adr;
    private Integer location_id;

    
    public void addAP (AccessPoint ap) throws SQLException{
        
        Connection con=null;
        try {
        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "lo53");
        id = ap.getId();
        mac_adr = ap.getMac_adr();
        location_id = ap.getLocation_id();
    // to modifie    
    //    PreparedStatement stmt =con.prepareStatement("insert into access_points (TITLE,COPIES,MOVIE_TYPE,MAIN_ACTOR_ID) values ( ?, ?, ?, ?)");
    //    stmt.setString(1, title);
    //    stmt.setInt(2, copies);
    //    stmt.setString(3, movieType);
    //    stmt.setInt(4, mainActorId);
    } 
        catch (Throwable e) {
        e.printStackTrace();
    } 
        finally{
        try {
            if (con!=null) con.close();
        } 
        catch (SQLException ex) {}
    }
     
    }
    
    public void addAPTest(){

    Connection con=null;
    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "lo53");
        System.out.println("CONNEXION OK");
        Statement stmt=con.createStatement();
        int rs = stmt.executeUpdate("insert into access_points(access_point_id,mac_adr,location) values (1, 'f', 'loc')");
                //int rs = stmt.executeUpdate("alter table access_points alter mac_adr type varchar(18)");

    } catch (Throwable e) {
        System.out.println("CONNEXION KO");
        e.printStackTrace();
    } finally{
        try {
            if (con!=null) con.close();
        } 
        catch (SQLException ex) {}
    }      
    }

    
    
}

