package org.project.domain.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DimensionsTest {
    @Test
    void seeIfSetWidthInstantiatesObject() {
        //Arrange
        double width = 2.0;
        double length = 2.0;
        double height = 1.0;
        //Act
        Dimensions dimensions = new Dimensions(width, length, height);
        //Assert
        assertNotNull(dimensions);
    }
    @Test
    void setWidthWithNegativeShouldThrowException() {
        //Arrange
        double width = -2.0;
        double length = 2.0;
        double height = 1.0;
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Dimensions(width, length, height));
        //Assert
        assertEquals("Please enter a valid width for the room.", exception.getMessage());
    }
    @Test
    void setWidthZeroShouldThrowException() {
        //Arrange
        double width = 0.0;
        double length = 2.0;
        double height = 1.0;
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Dimensions(width, length, height));
        //Assert
        assertEquals("Please enter a valid width for the room.", exception.getMessage());
    }
    @Test
    void ssetLengthWithNegativeShouldThrowException() {
        //Arrange
        double width = 2.0;
        double length = -2.0;
        double height = 1.0;
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Dimensions(width, length, height));
        //Assert
        assertEquals("Please enter a valid length for the room.", exception.getMessage());
    }
    @Test
    void setLengthWithZeroShouldThrowException() {
        //Arrange
        double width = 2.0;
        double length = 0.0;
        double height = 1.0;
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Dimensions(width, length, height));
        //Assert
        assertEquals("Please enter a valid length for the room.", exception.getMessage());
    }
    @Test
    void setHeightWithNegativeShouldThrowException() {
        //Arrange
        double width = 2.0;
        double length = 2.0;
        double height = -1.0;
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Dimensions(width, length, height));
        //Assert
        assertEquals("Please enter a valid height for the room.", exception.getMessage());
    }
    @Test
    void setHeightWithZeroShouldThrowException() {
        //Arrange
        double width = 2.0;
        double length = 2.0;
        double height = 0.0;
        //Act
        Dimensions dimensions = new Dimensions(width, length, height);
        //Assert
        assertNotNull(dimensions);
    }

}