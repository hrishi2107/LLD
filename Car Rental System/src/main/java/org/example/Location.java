package org.example;

public class Location {
    String address;
    String city;
    String state;
    String country;
    Integer pincode;

    public Location(String address, String city, String state, String country, Integer pincode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
