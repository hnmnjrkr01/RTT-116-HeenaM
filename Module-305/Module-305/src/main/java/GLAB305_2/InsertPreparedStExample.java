package GLAB305_2;

import java.sql.*;
public class InsertPreparedStExample {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user= "root";
        String password = "root";
        try {
            con = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connection established successfully!");
            /* ------ Lets insert one record using a prepared statement ------*/
           /* String sqlQuery = "INSERT INTO EMPLOYEES (office_id,lastName,firstName,extension,email," +
                    "reports_to,job_title,vacation_hours) VALUES (?,?,?,?,?,?,?,?)";
            prepStmt = con.prepareStatement(sqlQuery);
            prepStmt.setInt(1, 6);
            prepStmt.setString(2, "fink");
            prepStmt.setString(3, "Jamil ");
            prepStmt.setString(4, "2759 ");
            prepStmt.setString(5, "JJ10@gmail.com");
            prepStmt.setInt(6, 1143);
            prepStmt.setString(7, "Manager");
            prepStmt.setInt(8, 9);
            int affectedRows = prepStmt.executeUpdate();
            System.out.println(affectedRows + " row(s) affected !!");*/

            /* ------ Lets pull data from the database for an inserted record ------*/
            // Query which needs parameters

            prepStmt = con.prepareStatement ("select * from employees where id = ? ");
            prepStmt.setInt(1, 1717);
            // execute select query
            rs = prepStmt.executeQuery();
            // Display function to show the Resultset
            while (rs.next()) {
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("office_id"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        try {
            prepStmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

