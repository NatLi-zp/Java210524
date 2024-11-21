package de.telran.summary_151124.hm_171124;

import java.sql.*;

public class MainJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306/person_pet"; // стандартная url MySQL
        final String USER = "root";
        final String PASS = "220606";

        Class.forName("com.mysql.cj.jdbc.Driver");
        //String query = "SELECT * FROM person";
        String query1 = "UPDATE person SET petId=3 where personId=1";
        String query2 = "select t1.*, t2.petName from person t1 left join pet t2 on t1.petId = t2.petId";
        String query3 = "INSERT INTO person  (personName, petId) VALUES ('Катя',1)";
        String query4 = "select  t2.petName, count(t2.petId) as pet_count\n" +
                "from person t1\n" +
                "left join pet t2 \n" +
                "on t1.petId = t2.petId\n" +
                "group by t2.petId;";

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(query1); // update
        row = statement.executeUpdate(query3); //insert
        ResultSet resultSet = statement.executeQuery(query2);

        while (resultSet.next()) {
            int id = resultSet.getInt("personId");
            String personName = resultSet.getString("personName");
            String petName = resultSet.getString("petName");

            System.out.println("personId: " + id);
            System.out.println("personName: " + personName);
            System.out.println("petName: " + petName);
        }

        System.out.println();
        System.out.println("=====GROUP BY======");
        resultSet = statement.executeQuery(query4);
        while (resultSet.next()) {
            int pet_count = resultSet.getInt("pet_count");
            String petName = resultSet.getString("petName");
            System.out.println("petName: " + petName + ", pet_count: " + pet_count);

        }
    }
}

