package com.pssc.hph.flights.models;

public enum Role {
    CUSTOMER, ADMIN;


    public String roleName() {
        return "ROLE_" + this.roleName();
    }
}