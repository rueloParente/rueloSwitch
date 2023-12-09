package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio19Test {
    @Test
    void shouldReturnDeterminantOf2by2Matrix() {
        //Arrange
        int[][] matrix = {{1, 2}, {3, 4}};
        int expected = -2;
        //Act
        int result = Exercicio19.laplanceTheorema(matrix);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnDeterminantOf3by3Matrix() {
        //Arrange
        int[][] matrix = {{6, 1, 1}, {4, -2, 5}, {2, 8, 7}};
        int expected = -306;
        //Act
        int result = Exercicio19.laplanceTheorema(matrix);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnDeterminantOf4by4Matrix() {
        //Arrange
        int[][] matrix = {{4, 3, 2, 2}, {0, 1, -3, 3}, {0, -1, 3, 3}, {0, 3, 1, 1}};
        int expected = -240;
        //Act
        int result = Exercicio19.laplanceTheorema(matrix);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnMatrixWithoutFirstColumn() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, -9}};
        int[][] expected = {{2, 3}, {5, 6}, {8, -9}};
        //Act
        int[][] result = Exercicio19.removesColumnFromSquareMatrix(matrix, 0);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnMatrixWithoutLastColumn() {
        //Arrange
        int[][] matrix = {{1, 2, -3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 2}, {4, 5}, {7, 8}};
        //Act
        int[][] result = Exercicio19.removesColumnFromSquareMatrix(matrix, 2);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnMatrixWithoutMiddleColumn() {
        //Arrange
        int[][] matrix = {{1, 0, 0}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 0}, {4, 6}, {7, 9}};
        //Act
        int[][] result = Exercicio19.removesColumnFromSquareMatrix(matrix, 1);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnMatrixWithoutFirstRow() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, -9}};
        int[][] expected = {{4, 5, 6}, {7, 8, -9}};
        //Act
        int[][] result = Exercicio19.removesRowFromSquareMatrix(matrix, 0);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnMatrixWithoutLastRow() {
        //Arrange
        int[][] matrix = {{1, 2, -3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 2, -3}, {4, 5, 6}};
        //Act
        int[][] result = Exercicio19.removesRowFromSquareMatrix(matrix, 2);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnMatrixWithoutMiddleRow() {
        //Arrange
        int[][] matrix = {{1, 0, 0}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 0, 0}, {7, 8, 9}};
        //Act
        int[][] result = Exercicio19.removesRowFromSquareMatrix(matrix, 1);
        //Assert
        assertArrayEquals(expected, result);
    }

}