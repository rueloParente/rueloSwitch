package org.project.domain.house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseLocationTest {
    //Limited testing as the class is very simple and client doesn't want getters at present
    @Test
    void validInputShouldInstanciateObjetct() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";

        // Act
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);

        // Assert
        assertNotNull(houseLocation);
    }
    @Test
    void nullAddressShouldThrowException() {
        // Arrange
        String address = null;
        String zipCode = "402-96";
        String gptLocation = "1416.72";

        // Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new HouseLocation(address, zipCode, gptLocation));
        //Expected message
        assertEquals("Please enter a valid address for the house.", thrown.getMessage());
    }
    @Test
    void emptyAddressShouldThrowException() {
        // Arrange
        String address = "  ";
        String zipCode = "402-96";
        String gptLocation = "1416.72";

        // Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new HouseLocation(address, zipCode, gptLocation));
        //Expected message
        assertEquals("Please enter a valid address for the house.", thrown.getMessage());
    }
    @Test
    void nullZipCodeShouldThrowException() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = null;
        String gptLocation = "1416.72";

        // Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new HouseLocation(address, zipCode, gptLocation));
        //Expected message
        assertEquals("Please enter a valid zip code for the house.", thrown.getMessage());
    }
    @Test
    void emptyZipCodeShouldThrowException() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "  ";
        String gptLocation = "1416.72";

        // Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new HouseLocation(address, zipCode, gptLocation));
        //Expected message
        assertEquals("Please enter a valid zip code for the house.", thrown.getMessage());
    }
    @Test
    void nullGptLocationShouldThrowException() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = null;

        // Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new HouseLocation(address, zipCode, gptLocation));
        //Expected message
        assertEquals("Please enter a valid location for the house.", thrown.getMessage());
    }
    @Test
    void emptyGptLocationShouldThrowException() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "  ";

        // Act and Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new HouseLocation(address, zipCode, gptLocation));
        //Expected message
        assertEquals("Please enter a valid location for the house.", thrown.getMessage());
    }
    @Test
    void setAddressShouldChangeAddressAndObject() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);
        String newAddress = "Rua da Mota2";

        // Act
        houseLocation.setAddress(newAddress);

        // Assert
        assertNotNull(houseLocation);
    }
    @Test
    void setAddressShouldThrowExceptionWhenNull() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);

        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> houseLocation.setAddress(null));
        //Expected message
        assertEquals("Please enter a valid address for the house.", exception.getMessage());
    }
    @Test
    void setAddressShouldThrowExceptionWhenEmpty() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);

        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> houseLocation.setAddress(""));
        //Expected message
        assertEquals("Please enter a valid address for the house.", exception.getMessage());
    }
    @Test
    void setZipCodeShouldChangeZipCodeAndObject() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);
        String newZipCode = "402-962";

        // Act
        houseLocation.setZipCode(newZipCode);

        // Assert
        assertNotNull(houseLocation);
    }
    @Test
    void setZipCodeShouldThrowExceptionWhenNull() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);

        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> houseLocation.setZipCode(null));
        //Expected message
        assertEquals("Please enter a valid zip code for the house.", exception.getMessage());
    }
    @Test
    void setZipCodeShouldThrowExceptionWhenEmpty() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);

        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> houseLocation.setZipCode(""));
        //Expected message
        assertEquals("Please enter a valid zip code for the house.", exception.getMessage());
    }
    @Test
    void setGptLocationShouldChangeGptLocationAndObject() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);
        String newGptLocation = "1416.722";

        // Act
        houseLocation.setGptLocation(newGptLocation);

        // Assert
        assertNotNull(houseLocation);
    }
    @Test
    void setGptLocationShouldThrowExceptionWhenNull() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);

        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> houseLocation.setGptLocation(null));
        //Expected message
        assertEquals("Please enter a valid location for the house.", exception.getMessage());
    }
    @Test
    void setGptLocationShouldThrowExceptionWhenEmpty() {
        // Arrange
        String address = "Rua da Mota";
        String zipCode = "402-96";
        String gptLocation = "1416.72";
        HouseLocation houseLocation = new HouseLocation(address, zipCode, gptLocation);

        // Act and Assert
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> houseLocation.setGptLocation(""));
        //Expected message
        assertEquals("Please enter a valid location for the house.", exception.getMessage());
    }

}