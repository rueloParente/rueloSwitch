package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio3Test {
    @Test
    void shouldReturnSumOfArrayElements() {
        //Arrange
        int[] array = {1,2,3,4,5,6,7,8,9};
        int expected = 45;
        //Act
        int result = Exercicio3.sumOfArrayElements(array);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnSumOfArrayElementsWithZero() {
        //Arrange
        int[] array = {0};
        int expected = 0;
        //Act
        int result = Exercicio3.sumOfArrayElements(array);
        //Assert
        assertEquals(expected, result);
    }
    //Assumes sum is zero when array is empty
    @Test
    void shouldReturnSumOfArrayElementsWithEmptyArray() {
        //Arrange
        int[] array = {};
        int expected = 0;
        //Act
        int result = Exercicio3.sumOfArrayElements(array);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnSumOfArrayElementsWithNegativeNumber() {
        //Arrange
        int[] array = {-1,-2,-3,-4,-5,-6,-7,-8,-9};
        int expected = -45;
        //Act
        int result = Exercicio3.sumOfArrayElements(array);
        //Assert
        assertEquals(expected, result);
    }

}