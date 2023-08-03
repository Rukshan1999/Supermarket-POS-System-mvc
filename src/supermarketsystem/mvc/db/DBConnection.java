/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketsystem.mvc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author thari
 */
public class DBConnection {
    private static DBConnection dBConnection;

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Connection connection;

    public DBConnection() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "1234");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     *
     * @return
     * @throws java.sql.SQLException
     */
    public static DBConnection getInstanc(){
        if(dBConnection == null){
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}
