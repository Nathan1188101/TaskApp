package com.example.taskapp;

import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args){
        ArrayList<Person> users = DBUtility.getUsers();
        //System.out.println("\n", users);
    }
}
