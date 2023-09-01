package com.example.demojavers1.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String address;
    private Integer zipcode;

    public Address() {
    }

    public Address(String address, Integer zipcode) {
        this.address = address;
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

}
