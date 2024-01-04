package org.project.domain.house;

import org.project.domain.device.Device;

import java.util.List;

public class Room {
    private String name;
    private int floor;
    private RoomDimensions roomDimensions;
    private List<Device> devices;

    public Room(String name, int floor, RoomDimensions roomDimensions) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid name for the room.");
        }
        if (roomDimensions == null) {
            throw new IllegalArgumentException("Please enter valid dimensions for the room.");
        }
        this.floor = floor;
        this.name = name;
        this.roomDimensions = roomDimensions;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid name for the room.");
        }
        this.name = name;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    public void setDimensions(RoomDimensions roomDimensions) {
        if (roomDimensions == null) {
            throw new IllegalArgumentException("Please enter valid dimensions for the room.");
        }
        this.roomDimensions = roomDimensions;
    }

    public void addDevice(Device device) {
        if (device == null) {
            throw new IllegalArgumentException("Please enter a valid device.");
        }
        devices.add(device);
    }
    // Package-private method to facilitate unit testing
    RoomDimensions checkDimensions() {
        double length = roomDimensions.checkLength();
        double width = roomDimensions.checkWidth();
        double height = roomDimensions.checkHeight();
        RoomDimensions roomDimensions = new RoomDimensions(width, length, height);

        return roomDimensions;
    }
    int checkFloor() {
        return floor;
    }
    String checkName() {
        return name;
    }
}
