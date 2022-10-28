package com.sport.net.model;

public class Contact {

    private int id;
    private String name;
    private String lastname;
    private String country;
    private String value;

    public Contact(String name, String lastname, String country, String value) {
        this.name = name;
        this.lastname = lastname;
        this.country = country;
        this.value = value;
    }

    public Contact(int id, String name, String lastname, String country, String value) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.country = country;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
