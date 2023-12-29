package org.project.domain.house;

public class HouseLocation {
    private String address;
    private String zipCode;
    private String gptLocation;

    public HouseLocation(String address, String zipCode, String gptLocation) {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid address for the house.");
        }
        if (zipCode == null || zipCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid zip code for the house.");
        }
        if (gptLocation == null || gptLocation.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid location for the house.");
        }
        this.address = address;
        this.zipCode = zipCode;
        this.gptLocation = gptLocation;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid address for the house.");
        }
        this.address = address;
    }
    public void setZipCode(String zipCode) {
        if (zipCode == null || zipCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid zip code for the house.");
        }
        this.zipCode = zipCode;
    }
    public void setGptLocation(String gptLocation) {
        if (gptLocation == null || gptLocation.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid location for the house.");
        }
        this.gptLocation = gptLocation;
    }
}
