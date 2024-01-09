package org.project.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.project.domain.house.House;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class US01Test {
    US01 controller = new US01();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;
    House house = new House("Rua Dr. António Bernarino de Almeida", "400-072");
    @BeforeEach
    public void setUp() {
        // Redirect System.err to our ByteArrayOutputStream
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        // Restore the original System.err after tests
        System.setErr(originalErr);
    }
    // Assumes true as sucessful operation and false as failed operation
    @Test
    void seeIfSetLocationWorks() {
        // Arrange
        House house = new House("Rua Dr. António Bernarino de Almeida", "400-072");
        String newAddress = "Rua Dr. António Bernardino de Almeida";
        String newZipCode = "4200-072";
        // Act
        boolean trial = controller.setLocation(house, newAddress, newZipCode);
        // Assert
        assertTrue(trial);
    }
    @Test
    void setLocationFailsWithNullAddress() {
        // Arrange
        House house = new House("Rua Dr. António Bernarino de Almeida", "400-072");
        String newAddress = null;
        String newZipCode = "4200-072";
        // Act
        boolean trial = controller.setLocation(house, newAddress, newZipCode);
        String text = "Location not set. Please enter a valid address for the house.";
        // Assert
        assertFalse(trial);
        assertEquals(text, errContent.toString().trim());
    }
    @Test
    void setLocationFailsWithEmptyAddress() {
        // Arrange
        House house = new House("Rua Dr. António Bernarino de Almeida", "400-072");
        String newAddress = "";
        String newZipCode = "4200-072";
        // Act
        boolean trial = controller.setLocation(house, newAddress, newZipCode);
        String text = "Location not set. Please enter a valid address for the house.";
        // Assert
        assertFalse(trial);
        assertEquals(text, errContent.toString().trim());
    }
    @Test
    void setLocationFailsWithNullZipCode() {
        // Arrange
        House house = new House("Rua Dr. António Bernarino de Almeida", "400-072");
        String newAddress = "Rua Dr. António Bernardino de Almeida";
        String newZipCode = null;
        // Act
        boolean trial = controller.setLocation(house, newAddress, newZipCode);
        String text = "Location not set. Please enter a valid zip code for the house.";
        // Assert
        assertFalse(trial);
        assertEquals(text, errContent.toString().trim());
    }
    //TESTS TO CREATE HOUSE WITH LOCATION
    @Test
    void createHouseWithLocationShouldCreateHouseIfValidLocation() {
        //Arrange
        String address = "Rua Dr. António Bernardino de Almeida";
        String zipCode = "4200-072";
        //Act
        House house = controller.createHouseWithLocation(address, zipCode);
        //Assert
        assertNotNull(house);
    }
    @Test
    void createHouseWithLocationShouldThrowExceptionIfInvalidLocation() {
        //Arrange
        String address = "";
        String zipCode = "4200-072";
        //Act
        House house = controller.createHouseWithLocation(address, zipCode);
        String text = "House not instantiated. Please enter a valid address for the house.";
        //Assert
        assertNull (house);
        assertEquals(text, errContent.toString().trim());
    }
}