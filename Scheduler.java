package com.promanage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {

        String url = "jdbc:postgresql://localhost:5432/promanage";
        String user = "postgres";
        String password = "shalu2606";

        return DriverManager.getConnection(url, user, password);
    }
}
