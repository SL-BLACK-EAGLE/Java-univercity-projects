package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MySQL2 {
    private static Connection connection;
    public static void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db05", "root", "Chathuhansika@2017");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ResultSet executeSearch(String query){
        try {
            createConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            return resultSet;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static Integer executeIUD(String query){
        try {
            createConnection();
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            return result;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
