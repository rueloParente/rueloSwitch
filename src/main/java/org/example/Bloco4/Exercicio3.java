package org.example.Bloco4;

public class Exercicio3 {
    //Construa uma solução em Java que calcule a soma dos elementos de um vetor.
    public static int sumOfArrayElements (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }
}
