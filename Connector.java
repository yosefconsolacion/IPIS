/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Jeffrey
 */
public class Connector {
    
    private String username = "";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/maindb";	// please insert db name here, and modify port if needed
    private String driver = "com.mysql.jdbc.Driver";
    
	// init code
	public Connector() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("auth.txt"));
			username = sc.nextLine();
			password = sc.nextLine();
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			// inform user that auth.txt might not exist
		}
	}
	
    public Connection getConnection() {
        try {
            Class.forName(driver);
            Connection c = DriverManager.getConnection(url, username, password);
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
