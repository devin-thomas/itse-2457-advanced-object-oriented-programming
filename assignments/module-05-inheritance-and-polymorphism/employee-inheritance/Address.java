package com.cosc.module3;

public class Address {
    // private members

    private String street;
    private String city;
    private String state;
    private String zip;

    // public constructors

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //copy constructor
    public Address(Address copy) {
        this.street = copy.street;
        this.city = copy.city;
        this.state = copy.state;
        this.zip = copy.zip;
    }

    //public getters and setters. no validation as they are all Strings
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // print function

    public void PrintAddressInformation() {
        System.out.println("Address Information:");
        System.out.println("Street: " + getStreet());
        System.out.println("City: " + getCity());
        System.out.println("State: " + getState());
        System.out.println("ZIP: " + getZip());
    }


}
