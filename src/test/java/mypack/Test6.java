package mypack;

import java.sql.*;

public class Test6 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practdb", "root", "root");

        Statement st = con.createStatement();
        try {
            ResultSet rs = st.executeQuery("select * from persons;");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getInt(4));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }//close connection
        con.close();
    }
}
