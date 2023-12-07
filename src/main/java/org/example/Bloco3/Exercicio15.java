package org.example.Bloco3;

public class Exercicio15 {
    //Escreva um algoritmo que dada uma sequência de n números inteiros positivos de um só algarismo, a
    //reorganize de modo a obter os pares à direita e os ímpares à esquerda.
    public static int[] returnsArrayWithEvenNumbersOnTheRightAndOddNumbersOnTheLeft(int[] array){
        int[] newArray = new int[array.length];
        int evenNumbersIndex = 0;
        int oddNumbersIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                newArray[evenNumbersIndex] = array[i];
                evenNumbersIndex++;
            }else{
                newArray[oddNumbersIndex] = array[i];
                oddNumbersIndex--;
            }
        }
        return newArray;
    }
}
