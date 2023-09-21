package com.example.taskapp;

import java.sql.*;

public class DBUtility {


    /**
     * These should reflect whatever the username and password is for your instance of MySQL Server
     */
    private static String user = "Nathanlaknjsecord";
    private static String password = "c8JQv7M8tz";
    private static String connectUrl = "jdbc:mysql://172.31.22.43/Nathanlaknjsecord";

    /**
     * This method will save a Person into the users table
     */
    public static String saveUserToDB(Person person) throws SQLException {
        String responseMsg;

        String sql = "INSERT INTO users (email, fullname) VALUES (?,?)";

        //this is called a try...with resource block
        try(
                Connection conn = DriverManager.getConnection(connectUrl, user, password);
                PreparedStatement ps = conn.prepareStatement(sql);
                )
        {
            //configure the preparedStatement
            ps.setString(1, person.getEmail());
            ps.setString(2, person.getFullName());

            ps.executeUpdate();

            responseMsg = "User Added";
        }
        catch(SQLIntegrityConstraintViolationException e)
        {
            return "Account with email " + person.getEmail() + " already exists.";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            responseMsg = e.getMessage();
        }

        return responseMsg;
    }

}
