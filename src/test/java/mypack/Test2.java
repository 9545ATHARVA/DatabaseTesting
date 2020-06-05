package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practdb", "root", "root");

        Statement st = con.createStatement();
        try {
            int r = st.executeUpdate("  CREATE TABLE PERSONS(ID INT,FIRSTNAME VARCHAR(255) NOT NULL, LASTNAME VARCHAR(255) , AGE INT, CONSTRAINT pk1 PRIMARY KEY(ID));");
            if (r >= 0) {
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
