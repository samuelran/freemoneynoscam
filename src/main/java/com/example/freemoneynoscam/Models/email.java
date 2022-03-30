package com.example.freemoneynoscam.Models;

public class email {
    private String emailString;

    private int id;

    public email(String emailString, int id) {
        this.emailString = emailString;
        this.id = id;
    }


    public email() {
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    @Override
    public String toString() {
        return "email{" +
                "emailString='" + emailString + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
