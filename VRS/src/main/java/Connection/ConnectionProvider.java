/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * 
 */
public class ConnectionProvider {
       //enter database information here
   static final String DB_URL = "jdbc:mysql://localhost:3306/vrs?zeroDateTimeBehavior=convertToNull";
   static final String USER = "USER";
   static final String PASS = "2675";
    public static Connection getCon()
            
    {
        try {
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection(DB_URL,USER,PASS);
                return con;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
