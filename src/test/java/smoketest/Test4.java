package smoketest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test4 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practdb", "root", "root");

        Statement st = con.createStatement();
        try {
            int r = st.executeUpdate(" UPDATE PERSONS SET FIRSTNAME='VRUNDA' WHERE id=4;");
            if (r >= 0) {
                System.out.println("Updation Test Pass");
            } else {
                System.out.println("Updation Test Failed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }//close connection
        con.close();
    }
}
