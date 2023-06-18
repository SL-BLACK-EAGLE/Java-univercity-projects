package model;

import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {

    static Connection connection;
    private static final String propertyFile = "DB.properties";

    static {
        try {

            Properties properties = new Properties();
            properties.load(MySQL.class.getResourceAsStream(propertyFile));
            String database = properties.getProperty("database");
            String password = properties.getProperty("password");
            String username = properties.getProperty("username");

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet execute(String query) throws Exception {
        Statement statement = connection.createStatement();

        if (query.startsWith("SELECT")) {
            return statement.executeQuery(query);
        } else {
            statement.executeUpdate(query);
            return null;
        }
    }

}
