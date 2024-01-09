package org.project.domain.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    //Tests to Location constructor
    @Test
    void noThrowShouldHappenIfAddressIsValid() {
        //Arrange
        String address = "Rua Dr. António Bernardino de Almeida";
        String zipCode = "4200-072";
        //Act
        Location location = new Location(address, zipCode);
        //Assert
        assertNotNull(location);
    }
    @Test
    void shouldThrowExceptionIfAddressIsNull() {
        //Arrange
        String address = null;
        String zipCode = "4200-072";
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Location(address, zipCode));
        //Assert
        assertEquals("Please enter a valid address for the house.", exception.getMessage());
    }
    @Test
    void shouldThrowExceptionIfAddressIsEmpty() {
        //Arrange
        String address = " ";
        String zipCode = "4200-072";
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Location(address, zipCode));
        //Assert
        assertEquals("Please enter a valid address for the house.", exception.getMessage());
    }
    @Test
    void shouldThrowExceptionIfZipCodeIsNull() {
        //Arrange
        String address = "Rua Dr. António Bernardino de Almeida";
        String zipCode = null;
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Location(address, zipCode));
        //Assert
        assertEquals("Please enter a valid zip code for the house.", exception.getMessage());
    }
    @Test
    void shouldThrowExceptionIfZipCodeIsEmpty() {
        //Arrange
        String address = "Rua Dr. António Bernardino de Almeida";
        String zipCode = " ";
        //Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Location(address, zipCode));
        //Assert
        assertEquals("Please enter a valid zip code for the house.", exception.getMessage());
    }

}