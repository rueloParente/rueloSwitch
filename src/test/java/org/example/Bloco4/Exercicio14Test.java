package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.*;

class Exercicio14Test {
    //Construa uma solução em Java que calcule o produto escalar de 2 vetores de números.
    @Test
    void productOfTwoArrays() {
        //Arrange
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        double expected = 55;
        //Act
        double actual = Exercicio14.productOfTwoArrays(array1, array2);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void differentSizeArrayShouldReturnNaN() {
        //Arrange
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4, 5};
        double expected = NaN;
        //Act
        double actual = Exercicio14.productOfTwoArrays(array1, array2);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void productOfTwoArraysWithNegativeNumbers() {
        //Arrange
        int[] array1 = {-1, -2, -3, -4, -5};
        int[] array2 = {-1, -2, -3, -4, -5};
        double expected = 55;
        //Act
        double actual = Exercicio14.productOfTwoArrays(array1, array2);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void productOfTwoArraysWithRepeatedNumbers() {
        //Arrange
        int[] array1 = {1, 2, 0, 4, 5, 1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 0, 1, 2, 3, 4, 5};
        double expected = 76;
        //Act
        double actual = Exercicio14.productOfTwoArrays(array1, array2);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void productOfTwoArraysWithZeros() {
        //Arrange
        int[] array1 = {0, 0, 0, 0, 0};
        int[] array2 = {0, 0, 0, 0, 0};
        double expected = 0;
        //Act
        double actual = Exercicio14.productOfTwoArrays(array1, array2);
        //Assert
        assertEquals(expected, actual);
    }
    //

}