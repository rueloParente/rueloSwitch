package org.example.Bloco4;

public class Exercicio4 {
    //Construa uma solução em Java que dado um vetor de números inteiros retorne um outro vetor
    //contendo apenas os elementos pares do vetor recebido.
    public static int[] evenElementsOfArray (int[] array){
        int[] evenElements = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                evenElements[index] = array[i];
                index++;
            }
        }
        evenElements = Exercicio8.cleanArray(evenElements, index);
        return evenElements;
    }
}
