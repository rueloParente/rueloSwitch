package org.example.Bloco4;

public class Exercicio19 {
    //Construa uma solução em Java que para uma matriz de números inteiros calcula o seu determinante
    //através da aplicação do teorema de Laplace.
    public static int laplanceTheorema (int[][] matrix){
        int size = matrix.length;
        if(size == 2) {
            return determinantOf2by2Matrix(matrix);
        }
        int determinant = 0;
        for (int i=0; i<size; i++){
            int[][] minorMatrix = removesRowFromSquareMatrix(matrix, i);
            minorMatrix = removesColumnFromSquareMatrix(minorMatrix, 0);
            determinant +=(i % 2 == 0 ? 1 : -1) * matrix[i][0] * laplanceTheorema(minorMatrix);
        }
        return determinant;
    }

    private static int determinantOf2by2Matrix(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    public static int[][] removesRowFromSquareMatrix (int[][] matrix, int row){
        int[][] newMatrix = new int[matrix.length - 1][];
        int index = 0;
        for (int i = 0; i < matrix.length; i++){
            if(i != row) {
                newMatrix[index] = matrix[i];
                index++;
            }

        }
        return newMatrix;
    }
    public static int [][] removesColumnFromSquareMatrix(int[][] matrix, int column){
        int[][] newMatrix = new int[matrix.length][matrix[0].length-1];
        for (int i = 0; i <matrix.length; i++){
            newMatrix[i] = removesElementFromArray(matrix[i], column);
        }
        return newMatrix;
    }
    public static int[] removesElementFromArray (int[] array, int element){
        int[] newArray = new int [array.length-1];
        int index = 0;
        for (int i=0; i<array.length;i++){
            if (i != element){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}
