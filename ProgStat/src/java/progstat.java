
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author ollas
 */
public class progstat {
    Connection conn;
    public Connection getConn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/progstat","root", "");
        } catch (SQLException ex) {
            Logger.getLogger(progstat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(progstat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
        
    }
    
}
