/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketsystem.mvc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import supermarketsystem.mvc.db.DBConnection;
import supermarketsystem.mvc.model.CustomerModel;

/**
 *
 * @author thari
 */
public class CustomerController {
    
    public String saveCoustomer(CustomerModel customer) throws SQLException{
        Connection connection = DBConnection.getInstanc().getConnection();
        
        String query = "INSERT INTO CUstomer VALUES(?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, customer.getCustId());
        preparedStatement.setString(2, customer.getTitle());
        preparedStatement.setString(3, customer.getName());
        preparedStatement.setString(4, customer.getDob());
        preparedStatement.setDouble(5, customer.getSalary());
        preparedStatement.setString(6, customer.getAddress());
        preparedStatement.setString(7, customer.getCity());
        preparedStatement.setString(8, customer.getProvince());
        preparedStatement.setString(9, customer.getZip());
        
        if(preparedStatement.executeUpdate() > 0){
            return "Sucess";
        }else{
            return "Fail";
        }
    }
    
    public ArrayList<CustomerModel> getAllCustomers() throws SQLException{
        Connection connection = DBConnection.getInstanc().getConnection();
        String query = "SELECT * FROM Customer";
        
        PreparedStatement statement = connection.prepareStatement(query);
        
       ResultSet rst = statement.executeQuery();
       
       ArrayList<CustomerModel> customerModel = new ArrayList<>();
       
        while (rst.next()) {
            CustomerModel cm = new CustomerModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3), 
                    rst.getString(4), 
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
            customerModel.add(cm);
            
        }
        return customerModel;
    }
    
}
