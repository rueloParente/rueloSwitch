package org.example.Prova;

import java.util.Objects;

public class Exercicio3 {
    //Pretende-se determinar a menor distância entre duas cidades iden;ficadas pelo seu
    //nome. As distâncias entre as cidades estão armazenadas numa matriz de inteiros. As cidades
    //estão armazenadas num array de strings, em que a sua posição no array também
    //corresponde à posição nas linhas e colunas da matriz de distâncias. Considere que as
    //distâncias entre cidades não estão todas preenchidas, e que pode ser necessário determinar
    //a distância entre duas cidades passando por outra(s).

    public static int returnMinimalDistanceBetweenTwoCities(String city1, String city2, String[] cityArray, int[][]arrayDistance){
        int indexCity1 = -1;
        int indexCity2 = -1;
        int index = 0;
        for (int i=0; i < cityArray.length; i++){
            if (Objects.equals(cityArray[i], city1)) indexCity1 = i;
            if (Objects.equals(cityArray[i], city2)) indexCity2 = i;
        }
        if (indexCity1 == -1 || indexCity2 == -1) return -1; //error code for city not present

        int distance = Math.max(arrayDistance[indexCity1][indexCity2], arrayDistance[indexCity2][indexCity1]);
        if (distance > 0) return distance; //returns minimal distance when present
        else { // calculates the minimal distance using information in other cells
            int[] arrayDataCity1 = arrayDistance[indexCity1];
            int[] arrayDataCity2 = arrayDistance[indexCity2];
            return returnsMinimalSumBetweenTwoArrays(arrayDataCity1, arrayDataCity2);
        }
    }
    public static int[] retursColumnOfMatrix (int[][] array, int column){
        int[] arrayColumn = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arrayColumn[i] = array[i][column];
        }
        return arrayColumn;
    }
    public static int returnsMinimalSumBetweenTwoArrays (int[] array1, int[] array2){
        int minimalDistance = Integer.MAX_VALUE;
        for (int i = 0; i < array1.length; i++){
            if (array1[i] > 0 && array2[i] > 0){
                int distance = array1[i] + array2[i];
                minimalDistance = Math.min(distance, minimalDistance);
            }
        }
        return minimalDistance;
    }

}
