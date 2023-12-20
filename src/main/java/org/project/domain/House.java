package org.project.domain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class House {
    private String address;
    private String zipCode;
    private String gpsLocation;
    private List<Room> rooms;
    private List<User> users; // Advantage of being fast to add data, disadvantage of being slow to search data. Minimal impact in application design

    public House (){

        this.rooms = new ArrayList<>();
        this.users = new ArrayList<>();
    }
//    public House (String address, String zipCode, String gpsLocation) {
//        this.address = address;
//        this.zipCode = zipCode;
//        this.gpsLocation = gpsLocation;
//    }

    // Getters and Setters
    public void setAddress(String address) {this.address = address;}
    public String getAddress() {return address;}
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getZipCode() {return zipCode;}
    public void setGpsLocation(String gpsLocation) {
        this.gpsLocation = gpsLocation;
    }
    public String getGpsLocation() {return gpsLocation;}

    // Operations
    public void addRoom(Room room) {
        this.rooms.add(room);
    }
    public List<Room> getRooms() {
        return List.copyOf(rooms);
    }
}
