package org.project.domain.house;

import org.project.domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private int floor;
    private Dimensions dimensions;
    //private List<Device> devices;
    private List<User> owners;

    Room (String name, int floor) throws IllegalArgumentException {
        setName(name);
        this.floor = floor;
        //this.devices = new ArrayList<>();
       this.owners = new ArrayList<>();
    }
    void setName (String name) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid name for the room.");
        }
        this.name = name;
    }
    public Dimensions setDimensions (double width, double length, double height) throws IllegalArgumentException {
        this.dimensions = new Dimensions(width, length, height);
        return this.dimensions;
    }
    public String getName() {
        return this.name;
    }
}
