package org.example.Bloco4;

public class Exercicio8 {
    public static int[] cleanArray (int[] array, int numberOfElements){
        numberOfElements = Math.min (array.length, numberOfElements);
        numberOfElements = Math.max (0, numberOfElements);

        int[] cleanArray = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++){
            cleanArray[i] = array[i];
        }
        return cleanArray;
    }
}
