/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hostelsystem;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 640
 */
public class MysqlConnections {

    public static Connection dbConnection(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldb", "root", "IN16/00054/19");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
}
