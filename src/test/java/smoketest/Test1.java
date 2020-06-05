package smoketest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");

        Statement st = con.createStatement();
        try {
            int r = st.executeUpdate("create database practDb;");
            if (r != 0) {
                System.out.println("Creation of table Test Pass");
            } else {
                System.out.println("Creation of table Test Failed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }//close connection
        con.close();
    }
}
