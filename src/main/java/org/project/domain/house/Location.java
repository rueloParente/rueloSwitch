package org.project.domain.house;

public class Location {
    private String address;
    private String zipCode;
    Location(String address, String zipCode)throws IllegalArgumentException {
        setAddress(address);
        setZipCode(zipCode);
    }
    public void setAddress(String address) throws IllegalArgumentException{
        if (address == null || address.trim().isEmpty()){
            throw new IllegalArgumentException("Please enter a valid address for the house.");
        }
        this.address = address;
    }
    public void setZipCode(String zipCode) throws IllegalArgumentException {
        if (zipCode == null || zipCode.trim().isEmpty()){
            throw new IllegalArgumentException("Please enter a valid zip code for the house.");
        }
        this.zipCode = zipCode;
    }
    public void setLocation(String address, String zipCode) throws IllegalArgumentException {
        setAddress(address);
        setZipCode(zipCode);
    }
}
