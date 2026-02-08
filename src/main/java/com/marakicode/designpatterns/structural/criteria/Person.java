package com.marakicode.designpatterns.structural.criteria;

public class Person {
    private String name;
    private Gender gender;
    private MartialStatus martialStatus;

    public Person(String name, Gender gender, MartialStatus martialStatus) {
        this.name = name;
        this.gender = gender;
        this.martialStatus = martialStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MartialStatus getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(MartialStatus martialStatus) {
        this.martialStatus = martialStatus;
    }
}
