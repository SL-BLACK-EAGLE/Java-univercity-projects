package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL2 {

    private static Connection connection;

    public static void createConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db05", "root", "Chathuhansika@2017");
    }

    public static ResultSet executeSearch(String query) throws Exception {

        createConnection();
        return connection.createStatement().executeQuery(query);
    }

    public static Integer executeIUD(String query) throws Exception {

        createConnection();
        return connection.createStatement().executeUpdate(query);
    }
}
