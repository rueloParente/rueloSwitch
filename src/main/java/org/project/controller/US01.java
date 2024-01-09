package org.project.controller;

import org.project.domain.house.House;

public class US01 {
    //US01 - As an Administrator, I want to configure the location of the house.

    public House createHouseWithLocation(String address, String zipCode) {
        House house = null;
        try {
            house = new House(address, zipCode);
        } catch (IllegalArgumentException e) {
            String errorMessage = e.getMessage();
            System.err.println("House not instantiated. " + errorMessage);
        }
        return house;
    }
    public boolean setLocation(House house, String address, String zipCode)  {
        try {
            house.getLocation().setAddress(address);
            house.getLocation().setZipCode(zipCode);
        } catch (IllegalArgumentException e) {
            String errorMessage = e.getMessage();
            System.err.println("Location not set. " + errorMessage);
            return false;
        }
        return true;
    }
}
