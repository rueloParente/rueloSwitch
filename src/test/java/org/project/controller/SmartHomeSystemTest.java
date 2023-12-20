package org.project.controller;
import org.junit.jupiter.api.Test;
import org.project.domain.DeviceType;
import org.project.domain.House;
import org.project.domain.Room;
import org.project.domain.Sensor;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmartHomeSystemTest {
    // Configures the location of a specific house
    @Test
    void configureHouseLocation() {
    //Arrange
    House mickeyHouse = new House();
    String address = "Rua da Disney";
    String zip = "420-69";
    String location = "69.420, 420.69";
    //Act
    SmartHomeSystem.configureHouseLocation(mickeyHouse, address, zip, location);
    //Assert
    assertEquals(address, mickeyHouse.getAddress());
    }
    // Adds a new room to a specific house
    @Test
    void addRoomToHouse() {
    //Arrange
    House mickeyHouse = new House();
    String roomName = "Mini Room";
    int floor = 1;
    String dimensions = "5x5";
    Room room = new Room();

    //Act
    SmartHomeSystem.addRoomToHouse(mickeyHouse, room);
    //Assert
    assertEquals(room, mickeyHouse.getRooms().get(0));
    }
    // Lists all existing rooms in a specific house
    @Test
    void listRooms() {
    //Arrange Room 1
    House mickeyHouse = new House();
    String roomName = "Mini Room";
    int floor = 1;
    double dimensions = 5;
    Room room = new Room();
    SmartHomeSystem.configureRoom(room, roomName, floor, dimensions);
    //Arrange Room 2
    String roomName2 = "Pluto Room";
    int floor2 = 2;
    double dimensions2 = 10;
    Room room2 = new Room();
    SmartHomeSystem.configureRoom(room2, roomName2, floor2, dimensions2);
    List<Room> expected = List.of(room, room2);
    //Act
    SmartHomeSystem.addRoomToHouse(mickeyHouse, room);
    SmartHomeSystem.addRoomToHouse(mickeyHouse, room2);
    //Assert
    assertEquals(expected, mickeyHouse.getRooms());
    }
    // Method to define and add a new device type to the system
    @Test
    void addDeviceType() {
    //Arrange
    SmartHomeSystem smartHomeSystem = new SmartHomeSystem();
    String typeName = "Temperature Sensor";
    String description = "Measures the temperature";
    DeviceType temperature = new DeviceType();
    //Act
    smartHomeSystem.addDeviceType(temperature, typeName, description);
    //Assert
    assertEquals(typeName, temperature.getName());

    }
    // Method to add a new sensor to a specific room
    @Test
    void addSensorToRoom() {
    //Arrange
    SmartHomeSystem smartHomeSystem = new SmartHomeSystem();
    House mickeyHouse = new House();
    String roomName = "Mini Room";
    int floor = 1;
    double dimensions = 5;
    Room room = new Room();
    SmartHomeSystem.configureRoom(room, roomName, floor, dimensions);
    String typeName = "Temperature Sensor";
    String description = "Measures the temperature";
    DeviceType temperature = new DeviceType();
    smartHomeSystem.addDeviceType(temperature, typeName, description);
    //Act
    //add a new device of type temperature
    Sensor sensor = new Sensor(temperature);
    smartHomeSystem.addSensorToRoom(room, sensor);
    //Assert
    assertEquals(sensor, room.getDevices().get(0));
    }


}