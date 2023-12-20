package org.example.Bloco5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    //e) Retorne True caso a matriz esteja vazia e False em caso contrário.
    @Test
    void isMatrixEmpty() {
        Matrix matrixTest = new Matrix();
        assertTrue(matrixTest.isMatrixEmpty());
    }
    //f) Retorne o maior elemento do array.
    @Test
    void returnBiggestElement() {
        //Arrange
        Vetor[] matrix = new Vetor[]{
                new Vetor(new int[]{1, 2, 10}),
                new Vetor(new int[]{4, 5, 6}),
                new Vetor(new int[]{7, 8, 9})
        };
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnBiggestElement();
        //Assert
        assertEquals(10, result);
    }
    @Test
    void returnBiggestElementWhenOnSecondRow() {
        //Arrange
        Vetor[] matrix = new Vetor[]{
                new Vetor(new int[]{1, 2, 3}),
                new Vetor(new int[]{4, 5, 9}),
                new Vetor(new int[]{7, 8, 7})
        };
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnBiggestElement();
        //Assert
        assertEquals(9, result);
    }
    @Test
    void returnBiggestElementWhenOnSecondRowWithZero() {
        //Arrange
        Vetor[] matrix = new Vetor[]{
                new Vetor(new int[]{-1, -2, -3}),
                new Vetor(new int[]{-4, -5, 0}),
                new Vetor(new int[]{-7, -8, -7})
        };
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnBiggestElement();
        //Assert
        assertEquals(0, result);
    }
    @Test
    void returnBiggestElementWhenMatrixIsEmpty() {
        //Arrange
        Matrix matrixTest = new Matrix();
        //Act
        //Assert
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> matrixTest.returnBiggestElement());
    }
    //g) Retorne o menor elemento do array.
    @Test
    void returnSmallestElement() {
        //Arrange
        Vetor[] matrix = new Vetor[]{
                new Vetor(new int[]{1, 2, 10}),
                new Vetor(new int[]{4, 5, 6}),
                new Vetor(new int[]{7, 8, 9})
        };
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnSmallestElement();
        //Assert
        assertEquals(1, result);
    }
    @Test
    void returnSmallestElementWhenOnSecondRow() {
        //Arrange
        Vetor[] matrix = new Vetor[]{
                new Vetor(new int[]{1, 2, 3}),
                new Vetor(new int[]{4, -1, 9}),
                new Vetor(new int[]{7, 8, 7})
        };
        Matrix matrixTest = new Matrix(matrix);
        //Act
        int result = matrixTest.returnSmallestElement();
        //Assert
        assertEquals(-1, result);
    }
    @Test
    void returnSmallestElementWhenOnSecondRowWithZero() {
        //Arrange
        Vetor[] matrix = new Vetor[]{
                new Vetor(new int[]{-1, -2, -3}),
                new Vetor(new int[]{-4, -5, 0}),
                new Vetor(new int[]{-7, -8, -7})
        };
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
        Vetor[] matrix = new Vetor[]{
                new Vetor(new int[]{1, 2, 10}),
                new Vetor(new int[]{4, 5, 6}),
                new Vetor(new int[]{7, 8, 9})
        };
        Matrix matrixTest = new Matrix(matrix);
        //Act
        double result = matrixTest.returnAverage();
        //Assert
        assertEquals(5.77, result, 0.1);
    }
    @Test
    void returnAverageWhenOnSecondRow() {
        //Arrange
        Vetor[] matrix = new Vetor[]{
                new Vetor(new int[]{1, 2, 3}),
                new Vetor(new int[]{4, -1, 9}),
                new Vetor(new int[]{7, 8, 7})
        };        Matrix matrixTest = new Matrix(matrix);
        //Act
        double result = matrixTest.returnAverage();
        //Assert
        assertEquals(4.44, result, 0.1);
    }
    @Test
    void returnAverageWhenOnSecondRowWithZero() {
        //Arrange
        Vetor[] matrix = new Vetor[]{
                new Vetor(new int[]{0, 0, 0}),
                new Vetor(new int[]{0, 0, 0}),
                new Vetor(new int[]{0, 0, 0})
        };
        Matrix matrixTest = new Matrix(matrix);
       //Act
        double result = matrixTest.returnAverage();
        //Assert
        assertEquals(0, result, 0.1);
    }
    @Test
    void returnAverageWhenMatrixIsEmpty() {
        //Arrange
        Matrix matrixTest = new Matrix();
        //Act
        double result = matrixTest.returnAverage();
        //Assert
        assertEquals(Double.NaN, result);
    }


}