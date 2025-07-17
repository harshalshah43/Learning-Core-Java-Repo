package BankApp;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBUtil
{
    public Connection connect()
    {
        //Credentials
        String hostname = "localhost";
        String port = "3306";
        String dbname = "bank";
        String url = "jdbc:mysql://" + hostname + ":" + port + "/" + dbname;

        //url: jdbc:mysql://localhost:3306/bank

        String username = "root";
        String password  = "test_run_101";

        try{
            //Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, username, password);

            return conn;

        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

