import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DisplayRecords {
    public DisplayRecords(String message)
    {
        System.out.println("Message: " + message);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculator c = new Calculator(a,b);
        Calculator c2 = new Calculator(0,0); 

    }

    // Connect to DB
    public Connection getConnection()
    {
        String hostname = "localhost";
        String port = "3306";
        String dbname = "hr";
        String username = "root";
        String password = "test_run_101";

        // String url = "jdbc:mysql://localhost:3306/hr";
        String url = "jdbc:mysql://" + hostname + ":" + port + "/" + dbname;
        try
        {
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
        }

        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    // Fetch Data From DB
    public void get_data(Connection conn)
    {
        //Create SQL Query
        String query = "Select * from employee";

        try{
            // Create Statement
            Statement stmt = conn.createStatement();

            // Execute Statement
            ResultSet rs = stmt.executeQuery(query);
            
            display_data(rs);

            rs.close();
            conn.close();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }


    // Display Data
    public void display_data(ResultSet rs)
    {
        try
        {   
            System.out.println("ID\tName\tDepartment\tSalary\tAge\tDOJ");
            while(rs.next())
            {
                int eid = rs.getInt("eid");
                String ename = rs.getString("ename");
                int age = rs.getInt("age");
                String dept = rs.getString("dept");
                double salary = rs.getDouble("salary");
                String doj = rs.getString("DOJ");

                System.out.println(eid + "\t" + ename + "\t" + dept + "\t" + salary + "\t" + age + "\t" + doj);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
