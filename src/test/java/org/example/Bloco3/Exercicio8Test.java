package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio8Test {
    //test with num < 1
    @Test
    public void returnsNumberOfWaysToGetNumber_WithZero_ReturnsOne() {
        // Arrange
        int num = 0;
        int expectedNumberOfWays = 1;

        // Act
        int actualNumberOfWays = Exercicio8.returnsNumberOfWaysToGetNumber(num);

        // Assert
        assertEquals(expectedNumberOfWays, actualNumberOfWays);
    }
    //test with num 0 1
    @Test
    public void returnsNumberOfWaysToGetNumber_WithNumLessThanZero_ReturnsMinusOne() {
        // Arrange
        int num = -1;
        int expectedNumberOfWays = -1;

        // Act
        int actualNumberOfWays = Exercicio8.returnsNumberOfWaysToGetNumber(num);

        // Assert
        assertEquals(expectedNumberOfWays, actualNumberOfWays);
    }
    //teste with num > 20
    @Test
    public void returnsNumberOfWaysToGetNumber_WithNumGreaterThanTwenty_ReturnsMinusOne() {
        // Arrange
        int num = 21;
        int expectedNumberOfWays = -1;

        // Act
        int actualNumberOfWays = Exercicio8.returnsNumberOfWaysToGetNumber(num);

        // Assert
        assertEquals(expectedNumberOfWays, actualNumberOfWays);
    }
    //test with num = 11
    @Test
    public void returnsNumberOfWaysToGetNumber_WithNumEqualsEleven_ReturnsTwentyOne() {
        // Arrange
        int num = 11;
        int expectedNumberOfWays = 6;

        // Act
        int actualNumberOfWays = Exercicio8.returnsNumberOfWaysToGetNumber(num);

        // Assert
        assertEquals(expectedNumberOfWays, actualNumberOfWays);
    }
    //test with num = 9
    @Test
    public void returnsNumberOfWaysToGetNumber_WithNumEqualsNine_ReturnsTwentyOne() {
        // Arrange
        int num = 5;
        int expectedNumberOfWays = 3;

        // Act
        int actualNumberOfWays = Exercicio8.returnsNumberOfWaysToGetNumber(num);

        // Assert
        assertEquals(expectedNumberOfWays, actualNumberOfWays);
    }

    //test with num = 20
    @Test
    public void returnsNumberOfWaysToGetNumber_WithNumEqualsTwenty_ReturnsTwentyOne() {
        // Arrange
        int num = 20;
        int expectedNumberOfWays = 11;

        // Act
        int actualNumberOfWays = Exercicio8.returnsNumberOfWaysToGetNumber(num);

        // Assert
        assertEquals(expectedNumberOfWays, actualNumberOfWays);
    }
}