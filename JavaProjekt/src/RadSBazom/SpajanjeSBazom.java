
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadSBazom;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;

/**
 *
 * @author Bruno-PC
 */
public class SpajanjeSBazom {


    public static Connection noviConn() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=SQLServerJava;user=sa;password=SQL;";
            Connection con = DriverManager.getConnection(connectionUrl);

            return con;

        } catch (SQLException ex) {
            Logger.getLogger(SpajanjeSBazom.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Povezivanje s bazom nije uspjelo");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SpajanjeSBazom.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Povezivanje s bazom nije uspjelo");

        }

    }

    public static void zatvoriConn(Connection c) {
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(SpajanjeSBazom.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
