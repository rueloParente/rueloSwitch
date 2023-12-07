package org.example.Bloco4;

public class Exercicio17 {
    //Construa uma solução em Java que verifica se uma dada matriz é retangular.
    public static boolean checkIfMatrixIsRectanguar (int[][] matrix){
        for (int i = 1; i < matrix.length; i++){
            if (matrix[0].length != matrix[i].length) return false;
        }
        if (!Exercicio16.checkIfMatrixIsSquare(matrix)) return true;
        else return false;
    }
}
