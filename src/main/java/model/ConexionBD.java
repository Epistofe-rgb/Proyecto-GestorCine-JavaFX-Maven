package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//BD creada con AWS, y usando al cuenta de github, con max 10MB

public class ConexionBD {
    private static final String URL = "jdbc:mysql://bdcine.cpw80mi08hfn.us-east-2.rds.amazonaws.com:3306/cine?useSSL=true&requireSSL=true&verifyServerCertificate=false";
    private static final String USER = "admin";
    private static final String PASSWORD = "VOOkVYce9HcIBHcxgL44";

    public static Connection getConexion() throws SQLException {
        //System.setProperty(java)
        String trustStorePath = ConexionBD.class.getResource("/certificados/truststore.jks").getPath();
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", "Redalert2001.");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

