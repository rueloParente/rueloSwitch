package org.example.Bloco4;

public class Exercicio15 {
    //Construa uma solução em Java que verifica se todas as linhas de uma matriz possuem o mesmo número
    //de colunas. Em caso positivo, deve retornar o número de colunas e, em caso negativo, retornar um
    //número negativo.
    public static int checkSizeOfSquareMatrix (int[][] matrix){
        int numberColumns = 0;
        for (int i = 0; i < matrix.length; i++){
            if (matrix.length != matrix[i].length) return -1;
        }
        return matrix.length;
    }
}
