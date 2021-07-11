package nirzhorknitwearmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectDatabase {

    public Connection connection;

    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=NirzhorKnitwearManagement;selectMethod=cursor", "sa", "123456");
/*
            
            connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=Knitwear2;selectMethod=cursor", "sa", "123456");

            */
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
