package Dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Admin
 */
public class Dao{
    
    public static Connection connToMySQL()   {

    
                String db_url = "jdbc:mysql://localhost:" + "3306"+"/" + "asm_duan1" +"?tinyInt1isBit=true";

        Connection conn = null;
        try {        
            conn = DriverManager.getConnection(db_url,"root","1234");
        } catch (SQLException ex) { 
            return null;
        }
        return conn;
    }
    

    
    
  
    
}

