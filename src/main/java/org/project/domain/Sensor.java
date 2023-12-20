package org.project.domain;

public class Sensor implements Device {
    private String name;
    private DeviceType deviceType;
    private Room location;
    private boolean state;

    public Sensor(DeviceType deviceType) {
        this.deviceType = deviceType;
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
}
