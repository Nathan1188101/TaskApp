package com.example.taskapp;

import java.sql.SQLException;

public class Testing {

    public static void main(String[] args) {
        Person person = new Person("Jesus", "Jesus@godalmighty.gov");
        try {
            System.out.println(DBUtility.saveUserToDB(person));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
