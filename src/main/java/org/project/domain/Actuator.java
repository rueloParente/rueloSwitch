package org.project.domain;

public class Actuator implements Device {
    private String name;
    private DeviceType deviceType;
    private Room location;
    private boolean state;

    public Actuator() {
        this.name = "";
        this.deviceType = new DeviceType();
        this.location = new Room();
        this.state = false;
    }
    public String getName() {
        return name;
    }
    public String getDeviceType() {
        return this.deviceType.getName();
    }
    public Room getLocation() {
        return this.location;
    }
//    public Actuator(String name, DeviceType deviceType, Room location, boolean state) {
//        this.name = name;
//        this.deviceType = deviceType;
//        this.location = location;
//        this.state = state;
//    }

    // Implement Device interface methods
    // Actuator-specific methods
}
