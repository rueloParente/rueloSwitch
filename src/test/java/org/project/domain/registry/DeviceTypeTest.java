package org.project.domain.registry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTypeTest {
    @Test
    void createDeviceType_ValidArguments() {
        //Arrange
        String name = "Device1";
        String description = "Device Description";
        // Act
        DeviceType deviceType = new DeviceType(name, description);
        //Assert
        assertNotNull(deviceType);
    }
    @Test
    void nullNameShouldThrowException() {
        //Arrange
        String name = null;
        String description = "Device Description";
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new DeviceType(name, description);
        });
        //Assert Message
        assertEquals("Please enter a valid name for the device type.", thrown.getMessage());
    }
    @Test
    void emptyNameShouldThrowException() {
        //Arrange
        String name = "  ";
        String description = "Device Description";
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new DeviceType(name, description);
        });
        //Assert Message
        assertEquals("Please enter a valid name for the device type.", thrown.getMessage());
    }
    @Test
    void nullDescriptionShouldThrowException() {
        //Arrange
        String name = "Device1";
        String description = null;
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new DeviceType(name, description);
        });
        //Assert Message
        assertEquals("Please enter a valid description for the device type.", thrown.getMessage());
    }
    @Test
    void emptyDescriptionShouldThrowException() {
        //Arrange
        String name = "Device1";
        String description = "";
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new DeviceType(name, description);
        });
        //Assert Message
        assertEquals("Please enter a valid description for the device type.", thrown.getMessage());
    }

}