package BankApp;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer
{   
    public void deposit(int id, double amount)
    {
        try{
            DBUtil db = new DBUtil();
            Connection conn = db.connect();

            String query = "update customers set balance = balance + ? where id = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setDouble(1,amount);
            ps.setInt(2,id);
            ps.executeUpdate();

            conn.close();
            System.out.println("Deposit Successful");

            //Add Transaction to Tranaction table
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void withdraw(int id, double amount)
    {
        try{
            DBUtil db = new DBUtil();
            Connection conn = db.connect();
            
            //Check for min balance
            String check = "select balance from customers where id = ?";
            PreparedStatement ps = conn.prepareStatement(check);
            
            check.setInt(1,id);

            ResultSet rs = check.executeQuery();
            if(rs.next() && rs.getDouble("balance") < 2000)
            {
                System.out.println("Insufficient balance");
            }
            else{
                String query = "update customers set balance = balance - ? where id = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setDouble(1,amount);
                ps.setInt(2,id);
                ps.executeUpdate();

                System.out.println("Withdrawal Successful");

                //Add Transaction to Table
            }

            conn.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public void displayBalance(int id)
    {}

    public void last5transactions(int id)
    {}

}

//javac BankApp/*.java to compile full BankApp package