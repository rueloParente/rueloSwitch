package org.project.domain.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void seeIfRoomConstructorInstantiatesRoom() {
        //Arrange
        String name = "Bedroom";
        int floor = 1;
        //Act
        Room room = new Room(name, floor);
        //Assert
        assertNotNull(room);
    }
    @Test
    void roomConstructorThrowsExceptionWhenNameIsNull() {
        //Arrange
        String name = null;
        int floor = 1;
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Room(name, floor));
        //Assert
        assertEquals("Please enter a valid name for the room.", exception.getMessage());
    }
    @Test
    void roomConstructorThrowsExceptionWhenNameIsEmpty() {
        //Arrange
        String name = " ";
        int floor = 1;
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Room(name, floor));
        //Assert
        assertEquals("Please enter a valid name for the room.", exception.getMessage());
    }
    @Test
    void setDimensionsUpdatesRoomDimentions() {
        //Arrange
        String name = "Bedroom";
        int floor = 1;
        Room room = new Room(name, floor);
        double width = 2.0;
        double length = 3.0;
        double height = 4.0;
        //Act
        Dimensions dimensions = room.setDimensions(width, length, height);
        //Assert
        assertNotNull(dimensions);
    }


}