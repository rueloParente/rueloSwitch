package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio17Test {
    @Test
    void shouldReturnTrueIfMatrixIsRectangularH() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        //Act
        boolean result = Exercicio17.checkIfMatrixIsRectanguar(matrix);
        //Assert
        assertTrue(result);
    }
    @Test
    void shouldReturnTrueIfMatrixIsRectangularV() {
        //Arrange
        int[][] matrix = {{1, 2}, {4, 5}, {7, 8}};
        //Act
        boolean result = Exercicio17.checkIfMatrixIsRectanguar(matrix);
        //Assert
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseIfMatrixIsNotRectangular() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6, 7}};
        //Act
        boolean result = Exercicio17.checkIfMatrixIsRectanguar(matrix);
        //Assert
        assertFalse(result);
    }
    @Test
    void shouldReturnFalseIfMatrixIsSquare() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //Act
        boolean result = Exercicio17.checkIfMatrixIsRectanguar(matrix);
        //Assert
        assertFalse(result);
    }
}