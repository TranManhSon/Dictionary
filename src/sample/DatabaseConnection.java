package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private Connection databaseLink;

    public Connection getBDConnection() {
        String databaseName = "test";
        String databaseUser = "root";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, "0963556091");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return databaseLink;
    }

}
    

