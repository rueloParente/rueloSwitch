package org.example.Bloco4;

import static java.lang.Double.NaN;

public class Exercicio13 {
//Construa uma solução em Java que para um vetor de números inteiros determine:
    //a) o elemento de menor valor;
    public static int returnSmallestElementInArray (int[] array){
        int smallest = array[0];
        for (int i = 1; i < array.length; i++){
            smallest = Math.min(array[i], smallest);
        }
        return smallest;
    }
    //b) o elemento de maior valor;
    public static int returnBiggestElementInArray (int [] array){
        int biggest = array [0];
        for (int i = 1; i < array.length; i++){
            biggest = Math.max(array[i], biggest);
        }
        return biggest;
    }
    //c) o valor médio dos elementos;
    public static double returnAverageOfArray (int[] array){
        int sum = 0;
        int elements = array.length;
        for (int i=0; i < array.length; i++){
            sum += array[i];
        }
        if (elements == 0) return NaN;
        return (double)sum/elements;
    }
    //d) o produto dos seus elementos;
    public static int returnProductOfArray(int[] array){
        int product=1;
        for (int i =0; i < array.length; i++){
            product *= array[i];
        }
        return product;
    }
    //e) o conjunto de elementos não repetidos;
    public static int [] removesDuplicatedEntry (int[] array){
        int[] newArray = new int [array.length];
        int index = 0;
        for (int i=0; i<array.length;i++){
            if (checksIfElementUniqueInArrayAfterGivenPosition(array[i], i, array)){
                newArray[index]= array[i];
                index++;
            }
        }
        return  Exercicio8.cleanArray(newArray, index);
    }
    private static boolean checksIfElementUniqueInArrayAfterGivenPosition (int value, int position, int[] array){
        boolean repeated = true;
        for (int i=position+1; i<array.length;i++){
            if (value == array[i]) repeated = false;
        }
        return repeated;
    }
    //f) o vetor cujos elementos estão pela ordem inversa
    public static int[] invertedArray (int[] array){
        int reverser = array.length-1;
        int[] invertedArray = new int[array.length];
        for (int i = 0; i<array.length;i++){
            invertedArray[reverser] = array[i];
            reverser--;
        }
        return invertedArray;
    }
    //g) os elementos primos desse vetor.
    public static int[] returnPrimeElementsInArray (int[] array){
        int[] primeArray = new int[array.length];
        int index = 0;
        for (int i=0; i<array.length;i++){
            if (checksIfNumberIsPrimeOrNot(array[i])){
                primeArray[index]= array[i];
                index++;
            }
        }
        primeArray =  Exercicio8.cleanArray(primeArray, index);
        return removesDuplicatedEntry(primeArray);
    }
    public static boolean checksIfNumberIsPrimeOrNot(int num){
        if (Math.max(num, 1) == 1) return false;
        boolean prime = true;
        for (int i=2; i < num; i++){
            if (num % i == 0) prime = false;
        }
        return prime;
    }
}
