package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio16Test {
    @Test
    void checkSizeOfSquareMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //Act
        boolean result = Exercicio16.checkIfMatrixIsSquare(matrix);
        //Assert
        boolean expected = true;
        assertEquals(expected, result);
    }
    @Test
    void checkSizeOfSquareMatrixWithDifferentNumberOfColumns() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
        //Act
        boolean result = Exercicio16.checkIfMatrixIsSquare(matrix);
        //Assert
        boolean expected = false;
        assertEquals(expected, result);
    }
    //matrix with zeros
    @Test
    void checkSizeOfSquareMatrixWithZeros() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        //Act
        boolean result = Exercicio16.checkIfMatrixIsSquare(matrix);
        //Assert
        boolean expected = true;
        assertEquals(expected, result);
    }
    @Test
    void checkSizeOfSquareMatrixWithEmptyMatrix() {
        //Arrange
        int[][] matrix = {};
        //Act
        boolean result = Exercicio16.checkIfMatrixIsSquare(matrix);
        //Assert
        boolean expected = false;
        assertEquals(expected, result);
    }

}