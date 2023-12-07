package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio4Test {
    @Test
    void shouldReturnEvenElementsOfArray() {
        //Arrange
        int[] array = {1,-2,3,4,5,6,7,8,9};
        int[] expected = {-2,4,6,8};
        //Act
        int[] result = Exercicio4.evenElementsOfArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnEvenElementsOfArrayWithZero() {
        //Arrange
        int[] array = {0};
        int[] expected = {0};
        //Act
        int[] result = Exercicio4.evenElementsOfArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }
    //Assumes empty array is returned when there are no even elements
    @Test
    void shouldReturnEvenElementsOfArrayWithNoEvenElements() {
        //Arrange
        int[] array = {1,3,5,7,9};
        int[] expected = {};
        //Act
        int[] result = Exercicio4.evenElementsOfArray(array);
        //Assert
        assertArrayEquals(expected, result);
    }

}