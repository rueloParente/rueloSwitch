package org.example.Bloco5;

import static java.lang.Double.NaN;

public class Vetor {
    private int[] vetor;
    //a) Construtor público em que o vetor encapsulado fica vazio (i.e. sem valores).
    public Vetor(){
        vetor = new int[0];
    }
    //b) Construtor público que permita inicializar o vetor encapsulado com alguns valores.
    public Vetor(int[] array){
        vetor = new int[array.length];
        for (int i=0; i<array.length; i++){
        vetor[i] = array[i];
        }
    }
    //c) Adicione um novo elemento (valor) ao vetor encapsulado.
    public void addValueToVetor (int num){
        vetor = returnArrayWithExtraSpaceAtEnd(vetor);
        vetor[vetor.length-1] = num;
    }
    //d) Retire o primeiro elemento do vetor encapsulado com um determinado valor.
    public void removeFirstOcurrenceOfValue (int value){
        int[] position = returnArrayPositionsWithGivenValue(vetor, value);
        if (position.length != 0){
            vetor = returnArrayWithGivenIndexRemoved(position[0], vetor);
        }
    }
    //e) Retorne o valor de um determinado elemento indicado pela sua posição.
    public int returnValueAtPosition (int index){
        int value = vetor[index];
        return value;
    }
    //f) Retorne o número de elementos no vetor.
    public int vetorLength (){
        return vetor.length;
    }
    //g) Retorne o maior elemento do vetor.
    public int returnSmallestElementInVetor (){
        if (vetor.length == 0) throw new ArrayIndexOutOfBoundsException("The given array is empty");
        int smallest = vetor[0];
        for (int i = 1; i < vetor.length; i++){
            smallest = Math.min(vetor[i], smallest);
        }
        return smallest;
    }
    //h) Retorne o menor elemento do vetor.
    public int returnBiggestElementInVetor (){
        if (vetor.length == 0) throw new ArrayIndexOutOfBoundsException("The given array is empty");
        int biggest = vetor [0];
        for (int i = 1; i < vetor.length; i++){
            biggest = Math.max(vetor[i], biggest);
        }
        return biggest;
    }
    //i) Retorne a média de todos os elementos.
    public double returnAverageOfElements(){
        return  returnAverageOfArray(vetor);
    }
    //j) Retorne a média de todos os números pares.
    public double returnAverageEvenElements(){
        int [] evenArray = returnArrayWithEvenElementsOfVetor(vetor);
        return returnAverageOfArray(evenArray);
    }
    //k) Retorne a média de todos os números ímpares.
    public double returnAverageOddElements(){
        int[] oddArray = returnArrayWithOddElementsOfVetor(vetor);
        return returnAverageOfArray(oddArray);
    }
    //l) Retorne a média de todos os múltiplos de um dado número.
    public double returnAverageOfMultipleOfGivenNumber (int multiple){
      int [] multipleArray = returnArrayWithMultiplesOfGivenNumber(vetor, multiple);
      return returnAverageOfArray(multipleArray);
    }
    //m) Ordene os valores do vetor por ordem ascendente e/ou descendente.
    public void sortVetorAscending (){
    vetor = returnArraySortedAscending(vetor);
    }
    //n) Retorne True caso o vetor esteja vazio e False em caso contrário.
    public boolean trueIfVetorEmpty (){
        return vetor.length == 0;
    }
    //o) Retorne True caso o vetor contenha apenas um elemento e False em caso contrário.
    public boolean trueIfVetorOnlyOneElement (){
        return vetor.length == 1;
    }
    //p) Retorne True se o vetor tiver apenas elementos pares e False em caso contrário.
    public boolean trueIfOnlyEven (){
        for (int i=0; i<vetor.length; i++){
            if (!trueIfEvenFalseIfOdd(vetor[i])) return false;
        }
        return true;
    }
    //q) Retorne True se o vetor tiver apenas elementos ímpares e False em caso contrário.
    public boolean trueIfOnlyOdd (){
        for (int i=0; i<vetor.length; i++){
            if (trueIfEvenFalseIfOdd(vetor[i])) return false;
        }
        return true;
    }
    //r) Retorne True se o vetor tiver elementos duplicados e False em caso contrário.
    public boolean trueIfRepeatedElementsInVetor (){
        int[] repeatedPosition = firstPositionOfRepetedElement(vetor);
        return (repeatedPosition.length != 0);
    }
    //s) Retorne os elementos do vetor cujo número de algarismos é superior ao número médio de
    //algarismos de todos os elementos do vetor.
    public int [] elementsWithNumberDigitsMoreThanAverage (){
        int[] digitsVetor = numberOfDigitsEachElement(vetor);
        double average = returnAverageOfArray(digitsVetor);

        int[] newArray = new int[vetor.length];
        int index = 0;
        for (int i=0; i<vetor.length; i++){
            if (digitsVetor[i] > average){
                newArray[index] = vetor[i];
                index++;
            }
        }
        return cleanArray(newArray, index);
    }
    //t) Retorne os elementos do vetor cuja percentagem de algarismos pares é superior à média da
    //percentagem de algarismos pares de todos os elementos do vetor.
    public int [] elementsWithNumberEvenDigitsMoreThanAverage (){
        double[] averageEvenPerElement = averageEvenDigitsEachElement(vetor);
        double averageEven = returnAverageOfArray(averageEvenPerElement);

        int[] newArray = new int[vetor.length];
        int index = 0;
        for (int i=0; i<vetor.length; i++){
           if(averageEvenPerElement[i] > averageEven){
               newArray[index] = vetor[i];
               index++;
           }
       }
        return cleanArray(newArray, index);
    }
    //u) Retorne os elementos do vetor compostos exclusivamente por algarismos pares.
    public int [] elementsWithOnlyEvenDigits (){
        int[] newArray = new int[vetor.length];
        int index = 0;
        for (int i=0; i<vetor.length; i++){
            int[] temp = returnDigitsInArray(vetor[i]);
            int[] tempEven = returnArrayWithEvenElementsOfVetor(temp);
            if (tempEven.length == temp.length){
                newArray[index] = vetor[i];
                index++;
            }
        }
        return cleanArray(newArray, index);
    }
    //v) Retorne os elementos que são sequências crescentes (e.g. 347) do vetor.
    public int [] elementsWithGrowingSequence (){
        int[] newArray = new int[vetor.length];
        int index = 0;
        for (int i=0; i<vetor.length; i++){
            int biggest = returnBiggestGrowingSequenceOfDigits(vetor[i]);
            int[] temp = returnDigitsInArray(vetor[i]);
            if (biggest == temp.length){
                newArray[index] = vetor[i];
                index++;
            }
        }
        return cleanArray(newArray, index);
    }

    //w) Retorne as capicuas existentes no vetor.
    public int [] elementsCapicua (){
        int[] newArray = new int[vetor.length];
        int index = 0;
        for (int i=0; i<vetor.length; i++){
            if (trueIfCapicua(vetor[i])){
                newArray[index] = vetor[i];
                index++;
            }
        }
        return cleanArray(newArray, index);
    }
    //x) Retorne os números existentes no vetor compostos exclusivamente por um mesmo algarismo
    //(e.g., 222).
    public int [] elementsComposedOfSameDigit (){
        int[] newArray = new int[vetor.length];
        int index = 0;
        for (int i=0; i<vetor.length; i++){
            int[] numTemp = returnDigitsInArray(vetor[i]);
            int[] repeatedPosition = firstPositionOfRepetedElement(numTemp);
            if (numTemp.length-1 == repeatedPosition.length){
                newArray[index] = vetor[i];
                index++;
            }
        }
        return cleanArray(newArray, index);
    }
    //y) Retorne os números existentes no vetor que não são de Amstrong.
    public int [] elementsNotAmstrong (){
        int[] newArray = new int[vetor.length];
        int index = 0;
        for (int i=0; i<vetor.length; i++){
            if (!trueIfAmstrong(vetor[i])){
                newArray[index] = vetor[i];
                index++;
            }
        }
        return cleanArray(newArray, index);
    }
    //z) Retorne os elementos que contêm uma sequência crescente de pelo menos n algarismos (e.g., n=3,
    //347) do vetor.
public int [] elementsGrowingSequenceOfAtLeastNNumbers (int n){
        int[] newArray = new int[vetor.length];
        int index = 0;
        for (int i=0; i<vetor.length; i++){
            int biggest = returnBiggestGrowingSequenceOfDigits(vetor[i]);
            if (biggest >= n){
                newArray[index] = vetor[i];
                index++;
            }
        }
        return cleanArray(newArray, index);
    }

    //aa) Retorne True ou False, consoante o vetor é igual a um vetor passado por parâmetro.
    public boolean trueIfVetorIsEqualToGivenVetor (int[] array){
     return compareArrays(vetor, array);
    }
    //bb) add function to get copy of vetor so we can use int the Matrix class
    public int[] getVetor (){
        int[] copyVetor = new int[vetor.length];
        for (int i=0; i<vetor.length; i++){
            copyVetor[i] = vetor[i];
        }
        return copyVetor;
    }

    //Metodos auxiliares
    private boolean trueIfAmstrong (int num){
        if(num < 0) return false;
        int[] digitsArray = returnDigitsInArray(num);
        int sum = 0;
        for (int i=0; i<digitsArray.length; i++){
            sum += (int) Math.pow(digitsArray[i], 3);
        }
        return sum == num;
    }
    private boolean trueIfCapicua (int num){
    int[] digitsNum = returnDigitsInArray(num);
    int[] invertsDigitsNum = invertsArray(digitsNum);
    return compareArrays(digitsNum, invertsDigitsNum);
    }
    private boolean compareArrays (int[] array1, int[] array2){
        if (array1.length != array2.length) return false;
        for (int i=0; i<array1.length; i++){
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
    private int[] invertsArray (int[] array){
        int[] newArray = new int[array.length];
        for (int i=0, j=array.length-1; i<array.length; i++, j--){
            newArray[i] = array[j];
        }
        return newArray;
    }
    private int returnBiggestGrowingSequenceOfDigits (int num){
        int[] digitsArray = returnDigitsInArray(num);
        int biggest = 1;
        int temp = 1;
        for (int i=0, j=1; j <digitsArray.length;i++, j++){
            if(digitsArray[i] < digitsArray[j]){
                temp++;
            } else {
                temp = 1;
            }
            biggest = Math.max(biggest, temp);
        }
        return biggest;
    }
    private double [] averageEvenDigitsEachElement (int[] array){
        double [] averageOfEven = new double[array.length];
        for (int i=0; i<array.length;i++){
            int[] temp = returnDigitsInArray(array[i]);
            int[] tempEven = returnArrayWithEvenElementsOfVetor(temp);
            averageOfEven[i] = (double)tempEven.length/temp.length;
        }
        return averageOfEven;
    }
    private int [] numberOfDigitsEachElement(int[] array){
        int[] digitsArray = new int[array.length];
        for (int i=0; i < array.length; i++){
            int num = Math.abs(array[i]);
            digitsArray[i] = (int)Math.log10(num) + 1;
        }
        return digitsArray;
    }
    private int[] returnDigitsInArray (int num){
        num = Math.abs(num);
        if (num == 0) return new int[]{0};
        int[] array = new int [(int)Math.log10(num)+1];
        for (int i=(array.length-1); num > 0; i--){
            array[i] = num % 10;
            num /= 10;
        }
        return array;
    }
    private int[] firstPositionOfRepetedElement (int[] array){
        int[] newArray = new int [array.length];
        int index = 0;
        for (int i=0; i < array.length; i++){
            for (int j=i+1; j < array.length; j++){
                if (array[i] == array[j]){
                    newArray[index] = i;
                    index ++;
                    break;
                }

            }
        }
        return cleanArray(newArray, index);
    }
    private int[] returnArraySortedAscending (int[] array){
        for (int i=0, j=1; j < array.length; i++, j++){
            if(array[i] > array[j]){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i = -1;
                j= 0;
            }
        }
        return array;
    }

    private int[] returnArrayWithMultiplesOfGivenNumber (int[] array, int num){
        int[] multipleArray = new int[array.length];
        int index = 0;
        for (int i=0; i<array.length; i++){
            if (checkIfMultipleOfGivenNumber(array[i], num)){
                multipleArray[index] = array[i];
                index++;
            }
        }
       return cleanArray(multipleArray, index);
    }
    private boolean checkIfMultipleOfGivenNumber (int num, int multiple){
        if (multiple == 0) return true;
        return num % multiple == 0;
    }
    private double returnAverageOfArray(int[] array){
        if (array.length == 0) return NaN;
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double)sum/array.length;
    }
    private double returnAverageOfArray(double[] array){
        if (array.length == 0) return NaN;
        double sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double)sum/array.length;
    }
    private int[] returnArrayWithOddElementsOfVetor (int[] array){
        int[] newArray = new int[array.length];
        int index = 0;
        for (int i=0; i<array.length; i++){
            if (!trueIfEvenFalseIfOdd(array[i])){
                newArray[index] = array[i];
                index++;
            }
        }
        return cleanArray(newArray, index);
    }
    private int[] returnArrayWithEvenElementsOfVetor (int[] array){
        int[] newArray = new int[array.length];
        int index = 0;
        for(int i=0; i<array.length; i++){
            if (trueIfEvenFalseIfOdd(array[i])){
                newArray[index] = array[i];
                index++;
            }
        }
        return cleanArray(newArray, index);
    }
    private boolean trueIfEvenFalseIfOdd (int num){
        return num % 2 == 0;
    }
    private static int [] returnArrayWithGivenIndexRemoved (int index, int[] array){
    int[] newArray = new int[array.length-1];
    for (int i=0, j=0; i< array.length; i++){
        if (i!= index){
            newArray[j] = array[i];
            j++;
        }
    }
    return newArray;
    }
    private static int [] returnArrayPositionsWithGivenValue (int[] array, int value){
        int[] positions = new int[array.length];
        int index = 0;
        for (int i =0; i<array.length; i++){
            if (array[i] == value){
                positions[index] = i;
                index++;
            }
        }
        return cleanArray(positions, index);
    }
    private static int [] cleanArray (int[] array, int index){
        int[] newArray = new int[index];
        for (int i=0; i< newArray.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    private static int[] returnArrayWithExtraSpaceAtEnd (int[] array){
        int[] newArray = new int[array.length+1];
        for (int i=0; i< array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

}
