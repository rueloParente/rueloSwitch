package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio20Test {
    //multiplyMatrixByConstant
    @Test
    void shouldReturnMatrixMultipliedByConstant() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int constant = 2;
        int[][] expected = {{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};
        //Act
        int[][] result = Exercicio20.multiplyMatrixByConstant(matrix, constant);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnMatrixMultipliedByZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int constant = 0;
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        //Act
        int[][] result = Exercicio20.multiplyMatrixByConstant(matrix, constant);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnMatrixMultipliedByNegativeOne() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int constant = -1;
        int[][] expected = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        //Act
        int[][] result = Exercicio20.multiplyMatrixByConstant(matrix, constant);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnEmptyMatrixMultipliedByConstant() {
        //Arrange
        int[][] matrix = {{}};
        int constant = 2;
        int[][] expected = {{}};
        //Act
        int[][] result = Exercicio20.multiplyMatrixByConstant(matrix, constant);
        //Assert
        assertArrayEquals(expected, result);
    }
//b) calcule a soma de duas matrizes de números inteiros;
    @Test
    void shouldReturnSumOfTwoMatrix() {
        //Arrange
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{2, 4, 6}, {8, 10, 12}};
        //Act
        int[][] result = Exercicio20.returnSumTwoMatrix(matrix1, matrix2);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnSumOfTwoMatrixWithDifferentSizes3() {
        //Arrange
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{2, 4, 6}, {8, 10, 12}};
        //Act
        int[][] result = Exercicio20.returnSumTwoMatrix(matrix1, matrix2);
        //Assert
        assertArrayEquals(expected, result);
    }
    //c) calcule o produto de duas matrizes de números inteiros;
    @Test
    void shouldReturnProductOfTwoMatrix() {
        //Arrange
        int[][] matrix1 = {{1, 2, 3},
                            {4, 5, 6}};
        int[][] matrix2 = {{7, 8}, {9, 10}, {11, 12}};
        int[][] expected = {{58, 64}, {139, 154}};
        //Act
        int[][] result = Exercicio20.returnProductTwoMatrix(matrix1, matrix2);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnProductOfTwoMatrixDifferentOrderWillAffectResult() {
        //Arrange
        int[][] matrix2= {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix1 = {{7, 8}, {9, 10},{11, 12}};
        int[][] expected = {{39, 54, 69}, {49, 68, 87}, {59, 82, 105}};
        //Act
        int[][] result = Exercicio20.returnProductTwoMatrix(matrix1, matrix2);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnProductOfTwoMatrixWhenMatrixWithNegativesAndZeros() {
        //Arrange
        int[][] matrix1 = {{3, 0, 2}};
        int[][] matrix2 = {{13, 9, 7, 15}, {-1, 7, 4, 6}, {6, 4, 0, -9}};
        int[][] expected = {{51, 35, 21, 27}};
        //Act
        int[][] result = Exercicio20.returnProductTwoMatrix(matrix1, matrix2);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnProductOfTwoMatrixWhenMatrixWithZeros() {
        //Arrange
        int[][] matrix1 = {{0, 0, 0}};
        int[][] matrix2 = {{13, 9, 7, 15}, {-1, 7, 4, 6}, {6, 4, 0, -9}};
        int[][] expected = {{0, 0, 0, 0}};
        //Act
        int[][] result = Exercicio20.returnProductTwoMatrix(matrix1, matrix2);
        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    void shouldReturnEmptyMatrixWhenMatrixIncompatible() {
        //Arrange
        int[][] matrix2 = {{3, 0, 2}};
        int[][] matrix1 = {{13, 9, 7, 15}, {-1, 7, 4, 6}, {6, 4, 0, -9}};
        int[][] expected = {{}};
        //Act
        int[][] result = Exercicio20.returnProductTwoMatrix(matrix1, matrix2);
        //Assert
        assertArrayEquals(expected, result);
    }
}