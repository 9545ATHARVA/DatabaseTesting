package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practdb", "root", "root");

        Statement st = con.createStatement();
        try {
            int r = st.executeUpdate(" INSERT INTO PERSONS(ID,FIRSTNAME,LASTNAME , AGE ) VALUES (1,'kanchan','bhendarkar',28),(2,'heena','bhendarkar',28),(3,'prabhakar','bhendarkar',58),(4,'deepika','bhendarkar',28),(5,'kajal','bhendarkar',25);");
            if (r >= 0) {
                System.out.println("Insertion Test Pass");
            } else {
                System.out.println("Insertion Test Failed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }//close connection
        con.close();
    }
}
