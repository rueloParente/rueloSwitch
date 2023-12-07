package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio11Test {
    //Construa uma solução em Java que determine os múltiplos comuns de vários números inteiros (N)
    //num dado intervalo.
    @Test
    void getCommonMultiples() {
        //Arrange
        int[] numbers = {2, 3};
        int start = 1;
        int end = 10;
        //Act
        int[] result = Exercicio11.getCommonMultiples(numbers, start, end);
        //Assert
        int[] expected = {6};
        assertArrayEquals(expected, result);
    }
    @Test
    void getCommonMultiplesWithMoreThanTwoNumbers() {
        //Arrange
        int[] numbers = {2, 3, 4};
        int start = 1;
        int end = 13;
        //Act
        int[] result = Exercicio11.getCommonMultiples(numbers, start, end);
        //Assert
        int[] expected = {12};
        assertArrayEquals(expected, result);
    }
    @Test
    void getCommonMultiplesWithMoreThanTwoNumbersRangeOfOne() {
        //Arrange
        int[] numbers = {2, 3, 4};
        int start = 12;
        int end = 12;
        //Act
        int[] result = Exercicio11.getCommonMultiples(numbers, start, end);
        //Assert
        int[] expected = {12};
        assertArrayEquals(expected, result);
    }
    @Test
    void getCommonMultiplesWithMoreThanTwoNumbersAndMoreThanOneCommonMultiple() {
        //Arrange
        int[] numbers = {2, 3, 4};
        int start = 1;
        int end = 24;
        //Act
        int[] result = Exercicio11.getCommonMultiples(numbers, start, end);
        //Assert
        int[] expected = {12, 24};
        assertArrayEquals(expected, result);
    }
    @Test
    void getCommonMultiplesFromZeros() {
        //Arrange
        int[] numbers = {0, 0, 0};
        int start = 1;
        int end = 5;
        //Act
        int[] result = Exercicio11.getCommonMultiples(numbers, start, end);
        //Assert
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }


}