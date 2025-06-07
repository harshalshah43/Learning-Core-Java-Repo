import java.sql.*;

public class app {
    public static void main(String[] args) {
        DisplayRecords d = new DisplayRecords("Hi How are you"); // default constructor
        Connection conn = d.getConnection();
        d.get_data(conn);
    }
}
