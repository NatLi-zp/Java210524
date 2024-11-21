package de.telran.summary_151124;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;

public class JDBCexample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306/person_pet"; // стандартная url MySQL
        final String USER = "root";
        final String PASS = "220606";

        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "SELECT * FROM person";

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String petName = resultSet.getString("petName");

            System.out.println("id: " + id);
            System.out.println("name: " + name);
        }
    }
}

