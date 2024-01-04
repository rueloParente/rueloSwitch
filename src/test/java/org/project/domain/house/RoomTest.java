package org.project.domain.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
@Test
void getNameShouldReturnRoomName() {
//Arrange
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    Room room = new Room("Kitchen", 1,smallRoom);
    String expectedResult = "Kitchen";
//Act
    String result = room.checkName();
//Assert
    assertEquals(expectedResult, result);
}
@Test
void setNameShouldChangeRoomName() {
//Arrange
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    Room room = new Room("Kitchen", 1,smallRoom);
    String expectedResult = "Outside Kitchen";
//Act
    room.setName("Outside Kitchen");
    String result = room.checkName();
//Assert
    assertEquals(expectedResult, result);
}
@Test
void setNameShouldThrowExceptionWhenNull() {
//Act
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    Room room = new Room("Kitchen", 1,smallRoom);
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> room.setName(null));
//Assert
    assertEquals("Please enter a valid name for the room.", exception.getMessage());
}
@Test
void setNameShouldThrowExceptionWhenEmpty() {
//Act
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    Room room = new Room("Kitchen", 1,smallRoom);
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> room.setName(""));
//Assert
    assertEquals("Please enter a valid name for the room.", exception.getMessage());
}
@Test
void getFloorShouldReturnRoomFloor() {
//Arrange
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    Room room = new Room("Kitchen", 0,smallRoom);
    int expectedResult = 0;
//Act
    int result = room.checkFloor();
//Assert
    assertEquals(expectedResult, result);
}
@Test
void setFloorShouldChangeRoomFloor() {
//Arrange
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    Room room = new Room("Kitchen", 0,smallRoom);
    int expectedResult = 1;
//Act
    room.setFloor(1);
    int result = room.checkFloor();
//Assert
    assertEquals(expectedResult, result);
}
@Test
void getRoomDimensionsShouldReturnCopyOfRoomDimensions() {
//Arrange
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    Room room = new Room("Kitchen", 0,smallRoom);
    RoomDimensions expectedResult = smallRoom;
//Act
    RoomDimensions result = room.checkDimensions();
//Assert
    //Returns a copy of the object
    assertNotEquals(expectedResult, result);
    //Copy attributes are the same as the original
    assertEquals(result.checkLength(), smallRoom.checkLength());
    assertEquals(result.checkWidth(), smallRoom.checkWidth());
    assertEquals(result.checkHeight(), smallRoom.checkHeight());
}
@Test
void setRoomDimensionsShouldChangeRoomDimensions() {
//Arrange
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    RoomDimensions bigRoom = new RoomDimensions(2, 4, 5);
    Room room = new Room("Kitchen", 0,smallRoom);
//Act
    room.setDimensions(bigRoom);
    RoomDimensions result = room.checkDimensions();
//Assert
    //Returns a copy of the object
    assertEquals(5, result.checkHeight());
    assertEquals(4, result.checkLength());
    assertEquals(2, result.checkWidth());
}
@Test
void setRoomDimensionsShouldThrowExceptionWhenNull() {
//Arrange
    RoomDimensions smallRoom = new RoomDimensions(1, 2, 0);
    Room room = new Room("Kitchen", 0,smallRoom);
//Act
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> room.setDimensions(null));
//Assert
    assertEquals("Please enter valid dimensions for the room.", exception.getMessage());
}

}