package org.example.Bloco4;

public class Exercicio20 {
    //a) calcule o produto de uma matriz por uma constante;
    public static int [][] multiplyMatrixByConstant(int[][] matrix, int constant){
        for (int i=0; i < matrix.length; i++){
            matrix[i] = multiplyArrayByConstant(matrix[i], constant);
        }
        return matrix;
    }
    private static int [] multiplyArrayByConstant (int[] array, int constant ){
        for (int i=0; i<array.length; i++){
            array[i] = array[i] * constant;
        }
        return array;
    }
//b) calcule a soma de duas matrizes de números inteiros;
    public static int[][] returnSumTwoMatrix (int[][] matrix1, int[][] matrix2){
        int[][] newMatrix = new int[matrix1.length][];
        for (int i=0; i<matrix1.length; i++){
            newMatrix[i] = returnSumTwoArrays(matrix1[i], matrix2[i]);
        }
        return newMatrix;
    }
    private static int [] returnSumTwoArrays (int[] array1, int[] array2){
        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++){
            newArray[i] = array1[i] + array2[i];
        }
        return newArray;
    }
//c) calcule o produto de duas matrizes de números inteiros;
    public static int[][] returnProductTwoMatrix (int[][] matrix1, int[][] matrix2){
        if (matrix1[0].length != matrix2.length) return new int[][]{{}};
        int[][] newMatrix = new int[matrix1.length][matrix2[0].length];
        for (int i=0; i< matrix1.length ; i++){
            for (int j=0; j< newMatrix[0].length; j++){
                int [] column = getColumnToArray(matrix2, j);
                newMatrix[i][j] = productOFTwoArrays(matrix1[i], column);
            }
        } return newMatrix;
    }
    public static int[] getColumnToArray (int[][] matrix, int column){
        int[] array = new int[matrix.length];
        for (int i=0; i < array.length; i++){
            array[i] = matrix[i][column];
        }
        return array;
    }
    public static int productOFTwoArrays (int[] array1, int[] array2){
        int product = 0;
        for (int i=0; i<array1.length; i++){
            product += array1[i] * array2[i];
        }
        return product;
    }
    public static int [] sortEvenToLeftOddToRight (int[] array){
        int index = 0;
        int temp = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] % 2 == 0){
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
                index++;
            }
        }
        return array;
    }
}
