package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio9Test {
    //Teste with zero
    @Test
    void returnNumberCorrespondingToDescription_WithZero_ReturnsF() {
        // Arrange
        int code = 0;
        char expectedDescription = 'f';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with one
    @Test
    void returnNumberCorrespondingToDescription_WithOne_ReturnsA() {
        // Arrange
        int code = 1;
        char expectedDescription = 'a';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with two
    @Test
    void returnNumberCorrespondingToDescription_WithTwo_ReturnsB() {
        // Arrange
        int code = 2;
        char expectedDescription = 'b';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with three
    @Test
    void returnNumberCorrespondingToDescription_WithThree_ReturnsB() {
        // Arrange
        int code = 3;
        char expectedDescription = 'b';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with four
    @Test
    void returnNumberCorrespondingToDescription_WithFour_ReturnsB() {
        // Arrange
        int code = 4;
        char expectedDescription = 'b';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with five
    @Test
    void returnNumberCorrespondingToDescription_WithFive_ReturnsC() {
        // Arrange
        int code = 5;
        char expectedDescription = 'c';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with six
    @Test
    void returnNumberCorrespondingToDescription_WithSix_ReturnsC() {
        // Arrange
        int code = 6;
        char expectedDescription = 'c';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with seven
    @Test
    void returnNumberCorrespondingToDescription_WithSeven_ReturnsD() {
        // Arrange
        int code = 7;
        char expectedDescription = 'd';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with eight
    @Test
    void returnNumberCorrespondingToDescription_WithEight_ReturnsE() {
        // Arrange
        int code = 8;
        char expectedDescription = 'e';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with nine
    @Test
    void returnNumberCorrespondingToDescription_WithNine_ReturnsE() {
        // Arrange
        int code = 9;
        char expectedDescription = 'e';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with fifteen
    @Test
    void returnNumberCorrespondingToDescription_WithFifteen_ReturnsE() {
        // Arrange
        int code = 15;
        char expectedDescription = 'e';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }
    //Teste with twenty
    @Test
    void returnNumberCorrespondingToDescription_WithTwenty_ReturnsF() {
        // Arrange
        int code = 20;
        char expectedDescription = 'f';

        // Act
        char actualDescription = Exercicio9.returnNumberCorrespondingToDescription(code);

        // Assert
        assertEquals(expectedDescription, actualDescription);
    }

}