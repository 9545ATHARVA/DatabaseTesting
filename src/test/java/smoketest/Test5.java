package smoketest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test5 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practdb", "root", "root");

        Statement st = con.createStatement();
        try {
            int r = st.executeUpdate("DELETE FROM PERSONS WHERE firstname='sunanda';");
            if (r >= 0) {
                System.out.println("Deletion Test Pass");
            } else {
                System.out.println("Deletion Test Failed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }//close connection
        con.close();
    }
}
