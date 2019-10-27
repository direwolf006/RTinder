/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_rtinder;

import dbms_rtinder.Authentication.LoginPage;
import dbms_rtinder.Authentication.RegisterPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author ritte
 */
public class Dbms_rtinder {

    public static dbms_rtinder.Dbms_rtinder instance;
    public static Statement statement;
    public static Connection connection;
    
    public static dbms_rtinder.Dbms_rtinder getInstance(){
        if(instance==null){
            instance=new dbms_rtinder.Dbms_rtinder();
        }
        return instance;
    }
    
    public static Connection getConnection() throws Exception{
        if( connection==null||connection.isClosed()){
        try{
        String URL="jdbc:mysql://localhost:3306/rtinder?useSSL=true";
        String userName="ritteshdbms";
        String password="27Dwl@mas27";
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        connection=DriverManager.getConnection(URL,userName,password);
        System.out.println("Driver load successful"); 
        }
        catch(SQLException exception){
            
        }
      }
        return connection;
    }
    
    public static void main(String[] args) throws Exception{
        
     LoginPage loginPage=new LoginPage();
        loginPage.setVisible(true);   
                
        
    }
    
}
