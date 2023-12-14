package org.example.Prova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio4Test {
    //Given an m x n binary matrix mat, return the number of special positions in mat.
    //A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
    @Test
    void returnsAllPossibleLines() {
        //Arrange
        int[][] matrix = {{1,0,0},
                         {0,0,1},
                        {2,0,0}};
        int expected = 1;
        //Act
        int result = Exercicio4.returnsAllPossibleLines(matrix);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void returnsAllPossibleLines2() {
        //Arrange
        int[][] matrix = {{1,0,0},
                {0,1,0},
                {0,0,1}};
        int expected = 3;
        //Act
        int result = Exercicio4.returnsAllPossibleLines(matrix);
        //Assert
        assertEquals(expected, result);
    }

}