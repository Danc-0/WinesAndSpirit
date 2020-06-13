package com.example.databindingdrinks.models;

public class User {
    private String Name;
    private String Password;
    private String PhoneNumber;

    public User(){

    }

    public User(String name, String password, String phoneNumber) {
        Name = name;
        Password = password;
        PhoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name)
    {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password){
        Password = password;
    }
}
