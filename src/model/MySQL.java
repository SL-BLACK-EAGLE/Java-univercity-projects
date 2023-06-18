package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {

    static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db05", "root", "Chathuhansika@2017");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet execute(String query) {
        try {

            Statement statement = connection.createStatement();

            if (query.startsWith("SELECT")) {
                ResultSet resultSet = statement.executeQuery(query);
                return resultSet;
            } else {
                int result = statement.executeUpdate(query);
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
