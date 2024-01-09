package org.project.domain.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {
    //TESTS TO HOUSE CONSTRUCTOR
    @Test
    void houseConstructorShouldCreateHouseIfValidLocation() {
        //Arrange
        String adress = "Rua Dr. António Bernardino de Almeida";
        String zipCode = "4200-072";
        //Act
        House house = new House(adress, zipCode);
        //Assert
        assertNotNull(house);
    }
    @Test
    void houseConstructorShouldThrowExceptionIfInvalidLocation() {
        //Arrange
        String adress = "";
        String zipCode = "4200-072";
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new House(adress, zipCode));
        //Assert
        assertEquals("Please enter a valid address for the house.", exception.getMessage());
    }
    @Test
    void houseConstructorShouldThrowExceptionIfInvalidZipCode() {
        //Arrange
        String adress = "Rua Dr. António Bernardino de Almeida";
        String zipCode = "";
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new House(adress, zipCode));
        //Assert
        assertEquals("Please enter a valid zip code for the house.", exception.getMessage());
    }
    //TESTS TO GET LOCATION
    @Test
    void setLocationShouldThrowExeptionIfInvalidAdress(){
        //Arrange
        String adress = "Rua Dr. António Bernardino de Almeida";
        String zipCode = "4200-072";
        House house = new House(adress, zipCode);
        String newAdress = "";
        String newZipCode = "4200-072";
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> house.getLocation().setLocation(newAdress, newZipCode));
        //Assert
        assertEquals("Please enter a valid address for the house.", exception.getMessage());
    }
    @Test
    void setLocationShouldThrowExeptionIfInvalidZipCode(){
        //Arrange
        String adress = "Rua Dr. António Bernardino de Almeida";
        String zipCode = "4200-072";
        House house = new House(adress, zipCode);
        String newAdress = "Rua Dr. António Bernardino de Almeida";
        String newZipCode = "";
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> house.getLocation().setLocation(newAdress, newZipCode));
        //Assert
        assertEquals("Please enter a valid zip code for the house.", exception.getMessage());
    }
    @Test
    void addRoomShouldReturnRoomIfAddedWithSuccess(){
        //Arrange
        String adress = "Rua Dr. António Bernardino de Almeida";
        String zipCode = "4200-072";
        House house = new House(adress, zipCode);
        String name = "Kitchen";
        int floor = 2;
        //Act
        Room result = house.addRoom(name, floor);
        //Assert
        assertEquals(result, house.listRooms().get(0));
    }
    @Test
    void addRoomShouldReturnNullIfNotAddedDueToNameRepetition(){
        //Arrange
        String adress = "Rua Dr. António Bernardino de Almeida";
        String zipCode = "4200-072";
        House house = new House(adress, zipCode);
        String name = "Kitchen";
        int floor = 2;
        //Act
        house.addRoom(name, floor);
        Room result = house.addRoom(name, floor);
        //Assert
        assertNull(result);
    }


}