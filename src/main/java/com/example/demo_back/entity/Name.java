package com.example.demo_back.entity;



public class Name {
    private String givenName;
    private String middleName;
    private String familyName;

    public Name(String givenName, String middleName, String familyName) {
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }
}

