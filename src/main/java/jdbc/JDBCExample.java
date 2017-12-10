package jdbc;

import java.sql.*;
import java.util.Enumeration;

public class JDBCExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            System.out.println(driver);
        }

        try (Connection conn = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/hibernatedb", "root", "tiger");
             Statement statement = conn.createStatement()) {

            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " +
                        resultSet.getString(2));
            }
        }

    }
}
