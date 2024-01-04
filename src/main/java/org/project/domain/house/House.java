package org.project.domain.house;

import org.project.domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class House {
    private HouseLocation location;
    private List<User> usersList;
    private List<Room> roomsList;

    public House(HouseLocation location) {
        if (location == null) {
            throw new IllegalArgumentException("Please enter a valid location for the house.");
        }
        this.location = location;
        this.usersList = new ArrayList<>();
        this.roomsList = new ArrayList<>();
    }

    public void addRoom(Room room) throws IllegalArgumentException {
        if (this.roomsList.contains(room)) {
            throw new IllegalArgumentException("Room already exists.");
        }
        else this.roomsList.add(room);
    }
    public List<Room> listRooms() {
        return List.copyOf(this.roomsList);
    }
}
