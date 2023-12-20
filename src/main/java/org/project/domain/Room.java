package org.project.domain;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private int floor;
    private double dimensions;
    private List<Device> devices;

    public Room() {
        this.devices = new ArrayList<>();
    }
//    public Room(String name, int floor, String dimensions) {
//        this.name = name;
//        this.floor = floor;
//        this.dimensions = dimensions;
//        this.devices = new ArrayList<>();
//    }
    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }
    public List<Device> getDevices() {
        return devices;
    }
    // Operations
    public void addDevice(Device device) {
        this.devices.add(device);
    }
}
