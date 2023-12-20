package org.project.controller;

import org.project.domain.DeviceType;
import org.project.domain.House;
import org.project.domain.Room;
import org.project.domain.Sensor;

import java.util.ArrayList;
import java.util.List;

// System's core logic and functionalities.
// This class typically encapsulates the operations that the system can perform, acting as a sort of "controller" or "service" layer in the application architecture.
// Reasons we went with this design:
//-Centralized Logic: It provides a centralized place to manage the operations related to the smart home system, such as adding rooms, configuring devices, and managing users.
//-Separation of Concerns: By encapsulating system operations within a dedicated class, you separate the system's business logic from the data model
//-Maintainability: A dedicated system class makes the codebase more maintainable by having a clear entry point for operations. This makes it easier to understand, modify, and extend the system's functionalities.
//-Facilitates User Stories Implementation: The SmartHomeSystem class directly corresponds to the actions described in the user stories.
public class SmartHomeSystem {
    //private List<House> houses;
    private List<DeviceType> deviceTypes; // List to store different device types

    public SmartHomeSystem() {
        //this.houses = new ArrayList<>();
        this.deviceTypes = new ArrayList<>();
    }

    // As an Administrator, I want to configure the location of the house.
    public static void configureHouseLocation(House house, String address, String zip, String location) {
        house.setAddress(address);
        house.setZipCode(zip);
        house.setGpsLocation(location);
    }
    // As an Administrator, I want to add a new room to the house
    public static void addRoomToHouse(House house, Room room) {
        house.addRoom(room);
    }
    //in order to configure it (name, house floor and dimensions).
    public static void configureRoom(Room room, String name, int floor, Double dimensions) {
        room.setName(name);
        room.setFloor(floor);
        room.setDimensions(dimensions);
    }
    // As an Administrator, I want to have a list of existing rooms, so that I can choose one to edit it.
    public List<Room> listRooms(House house) {
        return house.getRooms();
    }

    // As an Administrator, I want to define a sensor type.
    public void addDeviceType(DeviceType type, String typeName, String description) {
        type.setName(typeName);
        type.setDescription(description);
        deviceTypes.add(type);
    }

    // Adds a new sensor to a specific room
    public void addSensorToRoom(Room room, Sensor sensor) {
        room.addDevice(sensor);
    }

}

