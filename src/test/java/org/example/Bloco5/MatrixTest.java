package org.example.Bloco5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    //e) Retorne True caso a matriz esteja vazia e False em caso contrário.
    @Test
    void isMatrixEmpty() {
        int[][] matrix = new int[][]{};
        Matrix matrixTest = new Matrix(matrix);
        assertTrue(matrixTest.isMatrixEmpty());
    }
    //f) Retorne o maior elemento do array.
    @Test
    void returnBiggestElement() {
        //Arrange
        int[][] matrix = new int[][]{{1,2,10},{4,5,6},{7,8,9}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnBiggestElement();
        //Assert
        assertEquals(10, result);
    }
    @Test
    void returnBiggestElementWhenOnSecondRow() {
        //Arrange
        int[][] matrix = new int[][]{{1,2,3},{4,5,9},{7,8,7}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnBiggestElement();
        //Assert
        assertEquals(9, result);
    }
    @Test
    void returnBiggestElementWhenOnSecondRowWithZero() {
        //Arrange
        int[][] matrix = new int[][]{{-1,-2,-3},{-4,-5,0},{-7,-8,-7}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnBiggestElement();
        //Assert
        assertEquals(0, result);
    }
    @Test
    void returnBiggestElementWhenMatrixIsEmpty() {
        //Arrange
        int[][] matrix = new int[][]{};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        //Assert
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> matrixTest.returnBiggestElement());
    }
    //g) Retorne o menor elemento do array.
    @Test
    void returnSmallestElement() {
        //Arrange
        int[][] matrix = new int[][]{{1,2,10},{4,5,6},{7,8,9}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnSmallestElement();
        //Assert
        assertEquals(1, result);
    }
    @Test
    void returnSmallestElementWhenOnSecondRow() {
        //Arrange
        int[][] matrix = new int[][]{{1,2,3},{4,-1,9},{7,8,7}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnSmallestElement();
        //Assert
        assertEquals(-1, result);
    }
    @Test
    void returnSmallestElementWhenOnSecondRowWithZero() {
        //Arrange
        int[][] matrix = new int[][]{{-1,-2,-3},{-4,-5,0},{-7,-8,-7}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnSmallestElement();
        //Assert
        assertEquals(-8, result);
    }
    //h) Retorne a média dos elementos do array.
    @Test
    void returnAverage() {
        //Arrange
        int[][] matrix = new int[][]{{1,2,10},{4,5,6},{7,8,9}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        double result = matrixTest.returnAverage();
        //Assert
        assertEquals(5.77, result, 0.1);
    }
    @Test
    void returnAverageWhenOnSecondRow() {
        //Arrange
        int[][] matrix = new int[][]{{1,2,3},{4,-1,9},{7,8,7}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        double result = matrixTest.returnAverage();
        //Assert
        assertEquals(4.44, result, 0.1);
    }
    @Test
    void returnAverageWhenOnSecondRowWithZero() {
        //Arrange
        int[][] matrix = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        double result = matrixTest.returnAverage();
        //Assert
        assertEquals(0, result, 0.1);
    }
    @Test
    void returnAverageWhenMatrixIsEmpty() {
        //Arrange
        int[][] matrix = new int[][]{};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        double result = matrixTest.returnAverage();
        //Assert
        assertEquals(Double.NaN, result);
    }
    //i) Retorne um vetor em que cada posição corresponde à soma dos elementos da linha homóloga
    //do array encapsulado.
    @Test
    void returnSumOfLines() {
        //Arrange
        int[][] matrix = new int[][]{{1,2,10},{4,5,6},{7,8,9}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int[] result = matrixTest.returnSumOfLines();
        //Assert
        assertArrayEquals(new int[]{13,15,24}, result);
    }
    @Test
    void returnSumOfLinesWhenOnSecondRow() {
        //Arrange
        int[][] matrix = new int[][]{{1,2,3},{4,-1,9},{7,8,7}};
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int[] result = matrixTest.returnSumOfLines();
        //Assert
        assertArrayEquals(new int[]{6,12,22}, result);
    }

}