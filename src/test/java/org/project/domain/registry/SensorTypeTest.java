package org.project.domain.registry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorTypeTest {
    @Test
    void createSensorType_ValidArguments() {
        //Arrange
        String name = "temperature";
        String description = "measures the temperature";
        String units = "Celsius";
        // Act
        SensorType sensorType = new SensorType(name, description, units);
        //Assert
        assertNotNull(sensorType);
    }
    @Test
    void nullNameShouldThrowException() {
        //Arrange
        String name = null;
        String description = "measures the temperature";
        String units = "Celsius";
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new SensorType(name, description, units);
        });
        //Assert Message
        assertEquals("Please enter a valid name for the sensor type.", thrown.getMessage());
    }
    @Test
    void emptyNameShouldThrowException() {
        //Arrange
        String name = "  ";
        String description = "measures the temperature";
        String units = "Celsius";
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new SensorType(name, description, units);
        });
        //Assert Message
        assertEquals("Please enter a valid name for the sensor type.", thrown.getMessage());
    }
    @Test
    void nullDescriptionShouldThrowException() {
        //Arrange
        String name = "temperature";
        String description = null;
        String units = "Celsius";
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new SensorType(name, description, units);
        });
        //Assert Message
        assertEquals("Please enter a valid description for the sensor type.", thrown.getMessage());
    }
    @Test
    void emptyDescriptionShouldThrowException() {
        //Arrange
        String name = "temperature";
        String description = "  ";
        String units = "Celsius";
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new SensorType(name, description, units);
        });
        //Assert Message
        assertEquals("Please enter a valid description for the sensor type.", thrown.getMessage());
    }
    @Test
    void nullUnitsShouldThrowException() {
        //Arrange
        String name = "temperature";
        String description = "measures the temperature";
        String units = null;
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new SensorType(name, description, units);
        });
        //Assert Message
        assertEquals("Please enter a valid unit for the sensor type.", thrown.getMessage());
    }
    @Test
    void emptyUnitsShouldThrowException() {
        //Arrange
        String name = "temperature";
        String description = "measures the temperature";
        String units = "  ";
        //Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new SensorType(name, description, units);
        });
        //Assert Message
        assertEquals("Please enter a valid unit for the sensor type.", thrown.getMessage());
    }
}