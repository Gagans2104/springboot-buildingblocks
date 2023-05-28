package com.stacksimplify.restservices.Hello;

public class UserDetails {

    public UserDetails(String name, String lastname, String city) {
        this.name = name;
        this.lastname = lastname;
        this.city = city;
    }

    private String name;
    private String lastname;
    private String city;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
