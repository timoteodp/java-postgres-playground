package com.example.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class connectionManager {

    public static final String PASSWORD = "";
    public static final String USERNAME = "gitpod";
    public static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionManager.JDBC_URL, connectionManager.USERNAME, connectionManager.PASSWORD);
    }
    
}
