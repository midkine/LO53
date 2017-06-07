package fr.utbm;



import fr.utbm.entity.AccessPoint;
import fr.utbm.service.AccessPointService;
import fr.utbm.util.HibernateUtil;
import java.sql.SQLException;


/**
 */
public class App0 {


	public static void main(String[] args) throws SQLException{
            AccessPoint ap = new AccessPoint();
            AccessPointService aps = new AccessPointService();
            
            aps.addAP();

	}
}
