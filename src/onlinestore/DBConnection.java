/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlinestore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Simanta
 */
public class DBConnection {
    public static Connection connect;
    
    Connection connection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ONLINESTORE;user=simanta;password=12";
            connect = DriverManager.getConnection(url);
            Statement statement=connect.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        return connect;
    }
}
