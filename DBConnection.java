package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://<HOST>:<PORT>/cdz_eliseos_RM";
    private static final String USER = "<USUARIO>";
    private static final String PASSWORD = "<SENHA>";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
