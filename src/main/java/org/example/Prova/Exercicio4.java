package org.example.Prova;

public class Exercicio4 {
    //Given an m x n binary matrix mat, return the number of special positions in mat.
    //A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

    public static int returnsAllPossibleLines (int[][] matrix) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            int[] linePosition = positionValueOneIntoArray(matrix[i]);
            if (linePosition.length == 1) {
                int column = linePosition[0];
                if (returnsTrueIFColumnSumEqualsOne(matrix, column)){
                    counter ++;
                }
            }
        }
        return counter;
    }
    public static boolean returnsTrueIFColumnSumEqualsOne(int[][] matrix, int column){
        int sum =0;
        for (int i = 0; i < matrix.length; i++){
            sum += matrix[i][column];
        }
        return (sum == 1);
    }
    public static int[] positionValueOneIntoArray (int[] array){
        int [] newArray = new int[1];
        int sum = 0;
        for (int i=0; i < array.length; i++){
            sum += array[i];
            if (sum == 1 && array[i] == 1) newArray[0] = i;
        }
        if (sum == 1) return newArray;
        else return  new int[] {};
    }
}
