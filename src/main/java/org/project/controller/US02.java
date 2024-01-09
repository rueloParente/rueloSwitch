package org.project.controller;

import org.project.domain.house.Dimensions;
import org.project.domain.house.House;
import org.project.domain.house.Room;

import java.util.List;

public class US02 {
    //US02 - As an Administrator, I want to add a new room to the house, in order to configure it (name, house floor and dimensions).
    House house = new House("Rua do Ouro", "3030-123");
    public boolean addRoom(String name, int floor) {
        try {
            house.addRoom(name, floor);
        } catch (IllegalArgumentException e) {
            String errorMessage = e.getMessage();
            System.err.println("Room not added. " + errorMessage);
            return false;
        }
        return true;
    }
    public boolean setRoomDimensions(String name, double width, double length, double height) {
        List<Room> rooms = house.listRooms();

        for (Room room : rooms) {
            if (room.getName().equals(name)) {
                try {
                    room.setDimensions(width, length, height);
                } catch (IllegalArgumentException e) {
                    String errorMessage = e.getMessage();
                    System.err.println("Dimensions not set. " + errorMessage);
                    return false;
                }
                return true;
            }

        }
        System.err.println("Room not found.");
        return false;
    }

}
