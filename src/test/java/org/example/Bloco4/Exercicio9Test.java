package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio9Test {
    //Construa uma solução em Java que determine os múltiplos of num num dado intervalo.
    @Test
    void multiplesOfNumberInInterval() {
        // Arrange
        int num = 3;
        int start = 1;
        int end = 10;
        int[] expected = {3, 6, 9};
        // Act
        int[] result = Exercicio9.multiplesOfNumberInInterval(num, start, end);
        // Assert
        assertArrayEquals(expected, result);
    }
    //Test with no multiples
    @Test
    void shouldReturnEmptyArray() {
        // Arrange
        int num = 3;
        int start = 1;
        int end = 2;
        int[] expected = {};
        // Act
        int[] result = Exercicio9.multiplesOfNumberInInterval(num, start, end);
        // Assert
        assertArrayEquals(expected, result);
    }
    //Test with num = 0
    @Test
    void shouldReturnMultiplesOfOne() {
        // Arrange
        int num = 0;
        int start = 1;
        int end = 10;
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Act
        int[] result = Exercicio9.multiplesOfNumberInInterval(num, start, end);
        // Assert
        assertArrayEquals(expected, result);
    }
    //Will return java.lang.NegativeArraySizeException: -8 if start > end, sounds appropriate
}