package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio2Test {
    @Test
    void shouldReturnDigitsOfLongNumber() {
        //Arrange
        long num = 123456789;
        int[] expected = {1,2,3,4,5,6,7,8,9};
        //Act
        int[] result = Exercicio2.digitsOfLongNumber(num);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnDigitsOfLongNumberWithZero() {
        //Arrange
        long num = 0;
        int[] expected = {0};
        //Act
        int[] result = Exercicio2.digitsOfLongNumber(num);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnDigitsOfLongNumberWithNegativeNumber() {
        //Arrange
        long num = -123456789;
        int[] expected = {1,2,3,4,5,6,7,8,9};
        //Act
        int[] result = Exercicio2.digitsOfLongNumber(num);
        //Assert
        assertArrayEquals(expected, result);
    }

}