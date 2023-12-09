package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio18Test {
    //a) o elemento de menor valor;
    @Test
    void returnSmallestElementInMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int expected = 1;
        //Act
        int actual = Exercicio18.returnSmallestElementInMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnSmallestElementWhenOnThirdRow() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {-1, 0, 1}};
        int expected = -1;
        //Act
        int actual = Exercicio18.returnSmallestElementInMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnSmallestElementInMatrixWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {4, 2, 1}};
        int expected = 0;
        //Act
        int actual = Exercicio18.returnSmallestElementInMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnSmallestElementInMatrixWhenAllZero() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expected = 0;
        //Act
        int actual = Exercicio18.returnSmallestElementInMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    //b) o elemento de maior valor;
    @Test
    void returnBiggestElementInMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 6}, {4, 5, 3}};
        int expected = 6;
        //Act
        int actual = Exercicio18.returnBigegstElementInMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnBiggestElementWhenOnSecondRow() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {-1, 0, 1}};
        int expected = 6;
        //Act
        int actual = Exercicio18.returnBigegstElementInMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnBiggestElementInMatrixWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {4, 2, 12}};
        int expected = 12;
        //Act
        int actual = Exercicio18.returnBigegstElementInMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnBiggestElementInMatrixWhenAllZero() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expected = 0;
        //Act
        int actual = Exercicio18.returnBigegstElementInMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    //c) o valor médio dos elementos;
    @Test
    void returnAverageOfMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        double expected = 3.5;
        //Act
        double actual = Exercicio18.returnAverageOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnAverageOfMatrixWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3},
                            {4, 0, 6},
                                {4, 2, 12}};
        double expected = 3.777;
        //Act
        double actual = Exercicio18.returnAverageOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual, 0.1);
    }

    @Test
    void returnAverageOfMatrixWhenAllZero() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        double expected = 0;
        //Act
        double actual = Exercicio18.returnAverageOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnAverageOfMatrixWhenNegative() {
        //Arrange
        int[][] matrix = {{-1, -2, -3}, {-4, -5, -6}};
        double expected = -3.5;
        //Act
        double actual = Exercicio18.returnAverageOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnAverageOfMatrixWhenEmpty() {
        //Arrange
        int[][] matrix = {{}};
        double expected = Double.NaN;
        //Act
        double actual = Exercicio18.returnAverageOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    //d) o produto dos seus elementos;
    @Test
    void returnProductOfMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int expected = 720;
        //Act
        int actual = Exercicio18.returnProductOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnProductOfMatrixWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {4, 2, 12}};
        int expected = 0;
        //Act
        int actual = Exercicio18.returnProductOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnProductOfMatrixWhenAllZero() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expected = 0;
        //Act
        int actual = Exercicio18.returnProductOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnProductOfMatrixWhenNegative() {
        //Arrange
        int[][] matrix = {{-1, -2, -3}, {-4, -5, -6}};
        int expected = 720;
        //Act
        int actual = Exercicio18.returnProductOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void returnProductOfMatrixWhenEmpty() {
        //Arrange
        int[][] matrix = {{}};
        int expected = 1;
        //Act
        int actual = Exercicio18.returnProductOfMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    //e) o conjunto de elementos não repetidos;
    @Test
    void removesDuplicatedEntryMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[] expected = {1, 2, 3, 4, 5, 6};
        //Act
        int[] actual = Exercicio18.removesDuplicatedEntryMatrix(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void removesDuplicatedEntryMatrixWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {4, 2, 12}};
        int[] expected = {1, 3, 0, 6, 4, 2, 12};
        //Act
        int[] actual = Exercicio18.removesDuplicatedEntryMatrix(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void removesDuplicatedEntryMatrixWhenAllZero() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[] expected = {0};
        //Act
        int[] actual = Exercicio18.removesDuplicatedEntryMatrix(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    //f) os elementos primos dessa matriz;
    @Test
    void returnPrimeNumbersInMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {2, 5, 6}};
        int[] expected = {3, 2, 5};
        //Act
        int[] actual = Exercicio18.returnPrimeNumbersInMatrix(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnPrimeNumbersInMatrixWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {4, 2, 12}};
        int[] expected = {3, 2};
        //Act
        int[] actual = Exercicio18.returnPrimeNumbersInMatrix(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnPrimeNumbersInMatrixWhenAllZero() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[] expected = {};
        //Act
        int[] actual = Exercicio18.returnPrimeNumbersInMatrix(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    //g) a diagonal principal da matriz (apenas caso seja quadrada ou retangular);
    @Test
    void returnMainDiagonal() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = {1, 5, 9};
        //Act
        int[] actual = Exercicio18.returnMainDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnMainDiagonalRectangular() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[] expected = {1, 5, 9};
        //Act
        int[] actual = Exercicio18.returnMainDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnMainDiagonalRectangularH() {
        //Arrange
        int[][] matrix = {{1, 2, 3, 6}, {4, 5, 6, 8}, {7, 8, 9, 8}};
        int[] expected = {1, 5, 9};
        //Act
        int[] actual = Exercicio18.returnMainDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnMainDiagonalWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {4, 2, 12}};
        int[] expected = {1, 0, 12};
        //Act
        int[] actual = Exercicio18.returnMainDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnMainDiagonalWhenAllZero() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[] expected = {0, 0, 0};
        //Act
        int[] actual = Exercicio18.returnMainDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnMainDiagonalWhenNegative() {
        //Arrange
        int[][] matrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        int[] expected = {-1, -5, -9};
        //Act
        int[] actual = Exercicio18.returnMainDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnEmptyWhenNonSquareOrRectangularMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6, 5}};
        int[] expected = {};
        //Act
        int[] actual = Exercicio18.returnMainDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    //h) a diagonal secundária da matriz (apenas caso seja quadrada ou retangular);
    @Test
    void returnSecondDiagonal() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = {3, 5, 7};
        //Act
        int[] actual = Exercicio18.returnSecondDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnSecondDiagonalWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {4, 2, 12}};
        int[] expected = {3, 0, 4};
        //Act
        int[] actual = Exercicio18.returnSecondDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnSecondDiagonalWhenAllZero() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[] expected = {0, 0, 0};
        //Act
        int[] actual = Exercicio18.returnSecondDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnSecondDiagonalWhenNegative() {
        //Arrange
        int[][] matrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        int[] expected = {-3, -5, -7};
        //Act
        int[] actual = Exercicio18.returnSecondDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnEmptyArrayWhenNonSquareOrRectangularMatrix() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6, 5}};
        int[] expected = {};
        //Act
        int[] actual = Exercicio18.returnMainDiagonal(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    //i) se a mesma corresponde a uma matriz identidade;
    @Test
    void checksIfIdentityMatrix() {
        //Arrange
        int[][] matrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        boolean expected = true;
        //Act
        boolean actual = Exercicio18.checksIfIdentityMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    //non suqare matrix
    @Test
    void checksIfIdentityMatrixWhenNonSquare() {
        //Arrange
        int[][] matrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {1, 1, 1}};
        boolean expected = false;
        //Act
        boolean actual = Exercicio18.checksIfIdentityMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void checksIfIdentityMatrixWhenZero() {
        //Arrange
        int[][] matrix = {{1, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        boolean expected = false;
        //Act
        boolean actual = Exercicio18.checksIfIdentityMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void checksIfIdentityMatrixWhenAllZero() {
        //Arrange
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        boolean expected = false;
        //Act
        boolean actual = Exercicio18.checksIfIdentityMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void checksIfIdentityMatrixWhenNegative() {
        //Arrange
        int[][] matrix = {{-1, 0, 0}, {0, -1, 0}, {0, 0, -1}};
        boolean expected = false;
        //Act
        boolean actual = Exercicio18.checksIfIdentityMatrix(matrix);
        //Assert
        assertEquals(expected, actual);
    }

    //j) a matriz inversa;
    @Test
    void matrixInversa() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{6, 5, 4}, {3, 2, 1}};
        //Act
        int[][] actual = Exercicio18.matrixInversa(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void matrixInversaWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 0, 0}, {4, 2, 0}};
        int[][] expected = {{0, 2, 4}, {0, 0, 4}, {3, 2, 1}};
        //Act
        int[][] actual = Exercicio18.matrixInversa(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    //test with empty matrix
    @Test
    void shouldReturnEmptyMatrixWhenRecivingEmpty() {
        //Arrange
        int[][] matrix = {{}};
        int[][] expected = {{}};
        //Act
        int[][] actual = Exercicio18.matrixInversa(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    //k) a matriz transposta.
    @Test
    void matrixTransposta() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{1, 4}, {2, 5}, {3, 6}};
        //Act
        int[][] actual = Exercicio18.matrixTransposta(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void matrixTranspostaWhenZero() {
        //Arrange
        int[][] matrix = {{1, 2, 3}, {4, 0, 0}, {4, 2, 0}};
        int[][] expected = {{1, 4, 4}, {2, 0, 2}, {3, 0, 0}};
        //Act
        int[][] actual = Exercicio18.matrixTransposta(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }

    //test with empty matrix
    @Test
    void shouldReturnEmptyMatrixWhenRecivingEmptyMatrix() {
        //Arrange
        int[][] matrix = {{}};
        int[][] expected = {};
        //Act
        int[][] actual = Exercicio18.matrixTransposta(matrix);
        //Assert
        assertArrayEquals(expected, actual);
    }
}
