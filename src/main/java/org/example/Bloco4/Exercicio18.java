package org.example.Bloco4;

import java.util.Arrays;
import java.util.Objects;

public class Exercicio18 {
    // a) o elemento de menor valor;
    public static int returnSmallestElementInMatrix (int[][] matrix){
        int smallest = matrix[0][0];
        for (int i=0; i<matrix.length;i++){
            smallest = Math.min (smallest, Exercicio13.returnSmallestElementInArray(matrix[i]));
        }
        return smallest;
    }
    //b) o elemento de maior valor;
    public static int returnBigegstElementInMatrix (int[][] matrix){
        int biggest = matrix[0][0];
        for (int i=0; i<matrix.length;i++){
            biggest = Math.max (biggest, Exercicio13.returnBiggestElementInArray(matrix[i]));
        }
        return biggest;
    }
    //c) o valor médio dos elementos;
    public static double returnAverageOfMatrix (int[][] matrix) {
        double average = 0;
        for (int i=0; i<matrix.length; i++){
            average += Exercicio13.returnAverageOfArray(matrix[i]);
        }
        average = average / matrix.length;
        return average;
    }
    //d) o produto dos seus elementos;
    public static int returnProductOfMatrix (int[][] matrix){
        int product = 1;
        for (int i=0; i<matrix.length; i++){
            product *= Exercicio13.returnProductOfArray(matrix[i]);
        }
        return product;
    }
    //e) o conjunto de elementos não repetidos;
    public static int[] removesDuplicatedEntryMatrix (int[][] matrix){
        int[] array = Exercicio13.removesDuplicatedEntry(matrix[0]);
        for (int i=1; i<matrix.length; i++){
            int[] tempArray = Exercicio13.removesDuplicatedEntry(matrix[i]);
            array = Exercicio11.concatArrays(array, tempArray);
        }
        array = Exercicio13.removesDuplicatedEntry(array);
        return array;
    }
    //f) os elementos primos dessa matriz;
    public static int[] returnPrimeNumbersInMatrix (int[][] matrix){
        int[] array = Exercicio13.returnPrimeElementsInArray(matrix[0]);
        for (int i=1; i<matrix.length; i++){
            int[] tempArray = Exercicio13.returnPrimeElementsInArray(matrix[i]);
            array = Exercicio11.concatArrays(array, tempArray);
        }
        array = Exercicio13.removesDuplicatedEntry(array);
        return array;
    }
    //g) a diagonal principal da matriz (apenas caso seja quadrada ou retangular);
    public static int[] returnMainDiagonal (int[][] matrix){
        if (Exercicio16.checkIfMatrixIsSquare(matrix) || Exercicio17.checkIfMatrixIsRectanguar(matrix)) {
            int length = Math.min(matrix.length, matrix[0].length);
            int[] mainDiagonal = new int[length];
            for (int i = 0; i < length; i++) {
                mainDiagonal[i] = matrix[i][i];
            }
            return mainDiagonal;
        }
        return new int[0];
    }
    //h) a diagonal secundária da matriz (apenas caso seja quadrada ou retangular);
    public static int [] returnSecondDiagonal (int[][] matrix){
        if (Exercicio16.checkIfMatrixIsSquare(matrix) || Exercicio17.checkIfMatrixIsRectanguar(matrix)){
            int length = Math.min(matrix.length, matrix[0].length);
            int[] secondaryDiagonal = new int[length];
            int counter = matrix.length - 1;
            for (int i=0; i < length; i++){
                secondaryDiagonal[i] = matrix[i][counter];
                counter--;
            }
            return secondaryDiagonal;
        }
        return new int[0];
    }
    //i) se a mesma corresponde a uma matriz identidade;
    public static boolean checksIfIdentityMatrix (int[][] matrix){
        if(!Exercicio16.checkIfMatrixIsSquare(matrix)) return false;
        int[] mainDiagonal = returnMainDiagonal(matrix);
        int sum = Exercicio3.sumOfArrayElements(mainDiagonal);
        if (sum != matrix.length) return false;
        return  (sum == returnSumElementsOfMatrix(matrix));
    }
    public static int returnSumElementsOfMatrix (int[][] matrix){
        int sum = 0;
        for (int i=0; i<matrix.length; i++){
            sum += Exercicio3.sumOfArrayElements(matrix[i]);
        }
        return sum;
    }
    //j) a matriz inversa;
    public static int[][] matrixInversa (int[][] matrix){
        int[][] matrixInversa = new int[matrix.length][];
        int index = matrix.length - 1;
        for (int i=0; i<matrix.length; i++){
            matrixInversa[index] = Exercicio13.invertedArray(matrix[i]);
            index--;
        }
        return matrixInversa;
    }
    //k) a matriz transposta;
    public static int[][] matrixTransposta (int[][] matrix){

        int[][] matrixTransposta = new int[matrix[0].length][matrix.length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrixTransposta[j][i] = matrix[i][j];
            }
        }
        return matrixTransposta;
    }
}
