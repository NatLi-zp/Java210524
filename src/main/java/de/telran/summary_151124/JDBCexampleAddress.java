package de.telran.summary_151124;

import java.sql.*;

public class JDBCexampleAddress {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306/libliblib"; // стандартная url MySQL
        final String USER = "root";
        final String PASS = "220606";

        Class.forName("com.mysql.cj.jdbc.Driver");
        //String query = "SELECT * FROM addresses";
        //String query =  "INSERT INTO addresses  () VALUES (?,?,?,?)";

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        //ResultSet resultSet = statement.executeQuery(query);

        //int rows = statement.executeUpdate("INSERT INTO addresses(ind,city,street,num) VALUES (21495, 'Hamburg', 'Berliner strasse', '3a')");
        int rows = statement.executeUpdate("INSERT INTO addresses(ind,city,street,num) VALUES " +
                "(21495, 'Hamburg', 'Berliner strasse', '3a')," +
                "(21455, 'Berlin', 'Du strasse', '77'), " +
                "(21000, 'Bremen', 'Ber', '55a')");

        System.out.printf("Added %d rows", rows);

    }
}

