/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class mainsql {
    public static void main(String[] args) {
        try {
        //Class.forName("C:\\Program Files\\Java\\jdk1.8.0_73\\lib\\mysql-connector-java-5.1.39-bin.jar").newInstance();
        String url = "jdbc:mysql://localhost:3306/project_1?zeroDateTimeBehavior=convertToNull";
        String username = "root";
        String password = "12345678";
        
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement();
          
        JOptionPane.showMessageDialog(null, "Employee added to database");
              
        
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            
            
        }
    }
    }
    

