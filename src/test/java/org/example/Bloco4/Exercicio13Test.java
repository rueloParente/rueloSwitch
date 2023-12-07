package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio13Test {
    //a) o elemento de menor valor;
    @Test
    void returnSmallestElementInArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        int expected = 1;
        //Act
        int actual = Exercicio13.returnSmallestElementInArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnSmallestElementInArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {-1, -2, -3, -4, -5};
        int expected = -5;
        //Act
        int actual = Exercicio13.returnSmallestElementInArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnSmallestElementInArrayWithRepeatedNumbers() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int expected = 1;
        //Act
        int actual = Exercicio13.returnSmallestElementInArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnSmallestElementInArrayWithZeros() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        //Act
        int actual = Exercicio13.returnSmallestElementInArray(array);
        //Assert
        assertEquals(expected, actual);
    }
//b) o elemento de maior valor;
    @Test
    void returnBiggestElementInArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        int expected = 5;
        //Act
        int actual = Exercicio13.returnBiggestElementInArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnBiggestElementInArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {-1, -2, -3, -4, -5};
        int expected = -1;
        //Act
        int actual = Exercicio13.returnBiggestElementInArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnBiggestElementInArrayWithRepeatedNumbers() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int expected = 5;
        //Act
        int actual = Exercicio13.returnBiggestElementInArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnBiggestElementInArrayWithZeros() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        //Act
        int actual = Exercicio13.returnBiggestElementInArray(array);
        //Assert
        assertEquals(expected, actual);
    }
//c) o valor médio dos elementos;
    @Test
    void returnAverageOfArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        double expected = 3;
        //Act
        double actual = Exercicio13.returnAverageOfArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnAverageOfArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {-1, -2, -3, -4, -5};
        double expected = -3;
        //Act
        double actual = Exercicio13.returnAverageOfArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnAverageOfArrayWithRepeatedNumbers() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        double expected = 3;
        //Act
        double actual = Exercicio13.returnAverageOfArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnAverageOfArrayWithZeros() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        double expected = 0;
        //Act
        double actual = Exercicio13.returnAverageOfArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnAverageOfArrayWithEmptyArray() {
        //Arrange
        int[] array = {};
        double expected = Double.NaN;
        //Act
        double actual = Exercicio13.returnAverageOfArray(array);
        //Assert
        assertEquals(expected, actual);
    }
//d) o produto dos seus elementos;
    @Test
    void returnProductOfArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        int expected = 120;
        //Act
        int actual = Exercicio13.returnProductOfArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnProductOfArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {-1, -2, -3, -4, -5};
        int expected = -120;
        //Act
        int actual = Exercicio13.returnProductOfArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnProductOfArrayWithRepeatedNumbers() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int expected = 14400;
        //Act
        int actual = Exercicio13.returnProductOfArray(array);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void returnProductOfArrayWithZeros() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        //Act
        int actual = Exercicio13.returnProductOfArray(array);
        //Assert
        assertEquals(expected, actual);
    }
//e) o conjunto de elementos não repetidos;
    @Test
    void removesDuplicatedEntryNoDuplicated() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        //Act
        int[] actual = Exercicio13.removesDuplicatedEntry(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void removesDuplicatedEntryWithDuplicated() {
        //Arrange
        int[] array = {1, 4, 2, 3, 4, -5, -5};
        int[] expected = {1, 2, 3, 4, -5};
        //Act
        int[] actual = Exercicio13.removesDuplicatedEntry(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void removesDuplicatedEntryWithRepeatedNumbers() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        //Act
        int[] actual = Exercicio13.removesDuplicatedEntry(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void removesDuplicatedEntryWithZeros() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        int[] expected = {0};
        //Act
        int[] actual = Exercicio13.removesDuplicatedEntry(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
//f) o vetor cujos elementos estão pela ordem inversa
    @Test
    void invertedArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        //Act
        int[] actual = Exercicio13.invertedArray(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void invertedArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {-1, -2, -3, -4, -5};
        int[] expected = {-5, -4, -3, -2, -1};
        //Act
        int[] actual = Exercicio13.invertedArray(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void invertedArrayWithRepeatedNumbers() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1};
        //Act
        int[] actual = Exercicio13.invertedArray(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void invertedArrayWithZeros() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        //Act
        int[] actual = Exercicio13.invertedArray(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
//g) os elementos primos desse vetor.
    @Test
    void returnPrimeElementsInArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {2, 3, 5, 7};
        //Act
        int[] actual = Exercicio13.returnPrimeElementsInArray(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void returnPrimeElementsInArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {-1, -2, -3, -4, -5};
        int[] expected = {};
        //Act
        int[] actual = Exercicio13.returnPrimeElementsInArray(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void returnPrimeElementsInArrayWithRepeatedNumbers() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] expected = {2, 3, 5};
        //Act
        int[] actual = Exercicio13.returnPrimeElementsInArray(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void returnPrimeElementsInArrayWithZeros() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        int[] expected = {};
        //Act
        int[] actual = Exercicio13.returnPrimeElementsInArray(array);
        //Assert
        assertArrayEquals(expected, actual);
    }
}