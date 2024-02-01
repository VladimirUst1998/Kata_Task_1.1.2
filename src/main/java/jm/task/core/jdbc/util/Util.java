package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // Реализация настройки соединения с БД
    private static final String USERNAME = "Ust_11";
    private static final String PASSWORD = "Root_1124";
    private static final String URL = "jdbc:mysql://localhost:3306/task_1.1.2";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
