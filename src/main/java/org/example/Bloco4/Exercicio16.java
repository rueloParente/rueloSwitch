package org.example.Bloco4;

public class Exercicio16 {
    //Construa uma solução em Java que verifica se todas as linhas de uma matriz possuem o mesmo número
    //de colunas. Em caso positivo, deve retornar o número de colunas e, em caso negativo, retornar um
    //número negativo.
    public static boolean checkIfMatrixIsSquare(int[][] matrix) {
        if (Exercicio15.checkSizeOfSquareMatrix(matrix) > 0) {
            return true;
        }
        return false;
    }
}
