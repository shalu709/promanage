package com.promnage.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/promanage";

    private static final String USER = "postgres";
    private static final String PASSWORD = "shalu2606"; 

    public static Connection getConnection() {

        try {
            System.out.println("Connecting to database...");
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
            return null;
        }
    }
}
