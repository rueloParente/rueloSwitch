package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio1Test {
    @Test
    void shouldReturnNumberOfDigitsOfLongNumber() {
        //Arrange
        long num = 123456789;
        int expected = 9;
        //Act
        int result = Exercicio1.numberOfDigitsOfLongNumber(num);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnNumberOfDigitsOfLongNumberWithZero() {
        //Arrange
        long num = 0;
        int expected = 1;
        //Act
        int result = Exercicio1.numberOfDigitsOfLongNumber(num);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnNumberOfDigitsOfLongNumberWithNegativeNumber() {
        //Arrange
        long num = -123456789;
        int expected = 9;
        //Act
        int result = Exercicio1.numberOfDigitsOfLongNumber(num);
        //Assert
        assertEquals(expected, result);
    }
}