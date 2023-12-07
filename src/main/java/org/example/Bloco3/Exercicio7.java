package org.example.Bloco3;

public class Exercicio7 {
    //Desenvolva uma solução em Java que receba um array de números positivos e que retorne em que
    //posição o produto acumulado destes é superior a um dado número fornecido pelo utilizador.
    public static int returnsPositionOfProductOfArrayGreaterThanNumber(int[] array, int number){
        int product = 1;
        for (int i = 0; i < array.length; i++){
            product *= array[i];
            if (product > number) return i;
        }
        return -1;
    }
}
