package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, SonarQube!");

        // Example of a SQL injection vulnerability
        String username = "admin";
        String password = "' OR '1'='1";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", username, password)) {
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Example of hardcoded credentials
        String hardcodedPassword = "12345";

        // Resource leak example
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
