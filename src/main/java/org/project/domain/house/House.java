package org.project.domain.house;

import org.project.domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class House {
    private Location location;
    private GPS gpsLocation;
    private List<User> usersList;
    private List<Room> roomsList;

    //Constructor chaining to create a house with a location
    public House (String address, String zipCode){
        this.location = new Location(address, zipCode);
        this.usersList = new ArrayList<>();
        this.roomsList = new ArrayList<>();
    }
    public Location getLocation() {
        return this.location;
    }
    public List<Room> listRooms() {
        return List.copyOf(this.roomsList);
    }
    public Room addRoom(String name, int floor){
        Room newRoom = new Room(name, floor);
        for (Room room : this.roomsList) {
            if (room.getName().equals(newRoom.getName())) {
                return null;
            }
        }
        this.roomsList.add(newRoom);
        return newRoom;
    }


}
