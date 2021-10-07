package br.com.meli.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

    private static Connection conn;

   public static Connection getConection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/meliw4", "postgres", "12345@12345");
        return conn;
    }
/* public static Connection getConection() throws SQLException {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3032/meliw3", "root", "12345@12345");
    return conn;
}*/
}