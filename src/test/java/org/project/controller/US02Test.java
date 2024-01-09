package org.project.controller;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.project.domain.house.House;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class US02Test {
    US02 controller = new US02();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;
    House house = new House("Rua Dr. António Bernarino de Almeida", "400-072");
    @BeforeEach
    public void setUp() {
        // Redirect System.err to our ByteArrayOutputStream
        System.setErr(new PrintStream(errContent));
        // Initialize the House object before each test
        house = new House("Rua do Ouro", "3030-123");
    }

    @AfterEach
    public void restoreStreams() {
        // Restore the original System.err after tests
        System.setErr(originalErr);
    }
    @Test
    void seeIfAddRoomWorkdWithValidaParameters(){
        //Arrange
        String name = "Kitchen";
        int floor = 2;
        //Act
        boolean result = controller.addRoom(name, floor);
        //Assert
        assertTrue(result);
    }
    @Test
    void seeIfAddRoomFailsWithNullName(){
        //Arrange
        String name = null;
        int floor = 2;
        //Act
        boolean result = controller.addRoom(name, floor);
        System.setOut(System.out);
        String text = "Room not added. Please enter a valid name for the room.";

        //Assert
        assertFalse(result);
        assertEquals(text, errContent.toString().trim());
    }
    @Test
    void seeIfAddRoomFailsWithEmptyName(){
        //Arrange
        String name = "";
        int floor = 2;
        //Act
        boolean result = controller.addRoom(name, floor);
        System.setOut(System.out);
        String text = "Room not added. Please enter a valid name for the room.";

        //Assert
        assertFalse(result);
        assertEquals(text, errContent.toString().trim());
    }
    @Test
    void seeIfAddRoomFailsWithNegativeFloor(){
        //Arrange
        String name = "Kitchen";
        int floor = -2;
        //Act
        boolean result = controller.addRoom(name, floor);


        //Assert
        assertTrue(result);
    }

    // TESTE SET ROOM RIMENSIONS
    @Test
    void seeIfSetRoomDimensionsWorks(){
        //Arrange
        String name = "Kitchen";
        int floor = 2;
        double length = 2;
        double width = 2;
        double height = 2;
        //Act
        controller.addRoom(name, floor);
        boolean result = controller.setRoomDimensions(name, width, length, height);
        //Assert
        assertTrue(result);
    }

}