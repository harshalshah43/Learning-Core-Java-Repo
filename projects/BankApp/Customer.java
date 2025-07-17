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

            //Add Transaction to Tranaction table
            addTxn(conn,id,"DEPOSIT",amount);

            conn.close();
            System.out.println("Deposit Successful");

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
            PreparedStatement ps_check = conn.prepareStatement(check);
            
            ps_check.setInt(1,id);

            ResultSet rs = ps_check.executeQuery();
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

                //Add Transaction to Table
                addTxn(conn,id,"WITHDRAWAL",amount);
                System.out.println("Withdrawal Successful");

            }

            conn.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public void displayBalance(int id)
    {
        try{
            DBUtil db = new DBUtil();
            Connection conn = db.connect();

            String check = "select balance from customers where id = ?";
            PreparedStatement ps = conn.prepareStatement(check);
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                System.out.println("Balance: ₹" + rs.getDouble("balance"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void last5transactions(int id)
    {
        try{
            DBUtil db = new DBUtil();
            Connection conn = db.connect();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM transactions WHERE customer_id = ? ORDER BY date DESC LIMIT 5");
            ps.setInt(1,id);                                                                                                                                                            
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                String type = rs.getString("type");
                double amount = rs.getDouble("amount");
                // DateTime date = rs.getTimeStamp("date");

                System.out.println(type + "\t" + " -₹" + amount + " on " + rs.getTimestamp("date"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    private void addTxn(Connection conn, int customer_id, String type, double amount)
    {
        try{
            String query = "insert into transactions (customer_id,type,amount,date) values (?,?,?,now())";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,customer_id);
            ps.setString(2,type);
            ps.setDouble(3,amount);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}

//javac BankApp/*.java to compile full BankApp package

// id,customer_id,type,amount,date
// 3,1,DEPOSIT,2,"2025-05-19 22:35:20"
// 2,1,WITHDRAW,500,"2025-05-19 22:35:07"
// 1,1,DEPOSIT,2000,"2025-05-19 22:34:20"