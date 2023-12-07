package org.example.Bloco4;

public class Exercicio5 {
    //Construa uma solução semelhante à anterior, para retornar outro vetor contendo apenas os elementos
    //ímpares do vetor recebido.
    public static int[] getOddNumbers(int[] array) {
        int[] oddNumbers = new int[array.length];
        int index = 0;

        for (int number : array) {
            if (number % 2 != 0) {
                oddNumbers[index] = number;
                index++;
            }
        }
        oddNumbers = Exercicio8.cleanArray(oddNumbers, index);
        return oddNumbers;
    }
}
