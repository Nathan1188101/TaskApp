package com.example.taskapp;

public class Person {

    private String fullName, email;

    public Person(String fullName, String email) {
        setFullName(fullName);
        setEmail(email);
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        fullName = fullName.trim();
        if(fullName.matches("[A-z\\-]*"))
            this.fullName = fullName;
        else
            throw new IllegalArgumentException("Name can only contain letters, space or -");

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email.trim();

        if (email.matches("^(.+)@(\\S+)$"))
            this.email = email;
        else
            throw new IllegalArgumentException("Enter a valid email.");
    }
    
    @Override
    public String toString(){
        return fullName;
    }





}
