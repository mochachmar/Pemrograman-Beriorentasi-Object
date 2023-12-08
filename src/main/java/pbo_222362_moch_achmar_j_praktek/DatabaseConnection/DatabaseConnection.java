package pbo_222362_moch_achmar_j_praktek.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/user_registration";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Terkoneksi ke database MySQL");
        } catch (SQLException e) {
            System.err.println("Gagal terkoneksi ke database MySQL! Aktifkan MySQL terlebih dahulu !");
            System.err.println("Kode Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }
}
