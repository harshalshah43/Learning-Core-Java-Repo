package BankApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankManager {
    public void viewCustomerDetails(int customerId) {
        try {
            DBUtil db = new DBUtil();
            Connection conn = db.connect();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM customers WHERE id = ?");
            ps.setInt(1, customerId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Balance: " + rs.getDouble("balance"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewTransactionHistory(int customerId) {
        try {
            DBUtil db = new DBUtil();
            Connection conn = db.connect();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM transactions WHERE customer_id = ? ORDER BY date DESC");
            ps.setInt(1, customerId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Type: " + rs.getString("type") + " | Amount: " + rs.getDouble("amount") + " | Date: " + rs.getTimestamp("date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
