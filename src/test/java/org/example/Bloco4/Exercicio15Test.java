package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio15Test {
    @Test
    void checkSizeOfSquareMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //Act
        int result = Exercicio15.checkSizeOfSquareMatrix(matrix);
        //Assert
        int expected = 3;
        assertEquals(expected, result);
    }
    @Test
    void checkSizeOfSquareMatrixWithDifferentNumberOfColumns() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
        //Act
        int result = Exercicio15.checkSizeOfSquareMatrix(matrix);
        //Assert
        int expected = -1;
        assertEquals(expected, result);
    }
    //matrix with zeros
    @Test
    void checkSizeOfSquareMatrixWithZeros() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        //Act
        int result = Exercicio15.checkSizeOfSquareMatrix(matrix);
        //Assert
        int expected = 3;
        assertEquals(expected, result);
    }
    //test with empty matrix
    @Test
    void checkSizeOfSquareMatrixWithEmptyMatrix() {
        //Arrange
        int[][] matrix = {};
        //Act
        int result = Exercicio15.checkSizeOfSquareMatrix(matrix);
        //Assert
        int expected = 0;
        assertEquals(expected, result);
    }


}