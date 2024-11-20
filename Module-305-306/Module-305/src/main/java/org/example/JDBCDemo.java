package org.example;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "root";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);

           /* //Regular statement
            String SelectSQL = "Select * FROM employees";
            Statement stmt = connection.createStatement();
            ResultSet result =  stmt.executeQuery(SelectSQL);
            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstname");
                String lname  = result.getString("lastname");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname );
            }*/

            //using prepared stament is the best practice to from security point of view SQL Injection Attack
            String selectSQL  = "select * from employees where id = ?";
            PreparedStatement pstmt = connection.prepareStatement(selectSQL);
            pstmt.setInt(1, 1056 );
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                String EmployeeID  = rs.getString("id");
                String fname = rs.getString("firstname");
                String lname  = rs.getString("lastname");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname );
            }

            rs.close();
            pstmt.close();
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
