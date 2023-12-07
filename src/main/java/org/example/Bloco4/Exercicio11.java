package org.example.Bloco4;

public class Exercicio11 {
    //Construa uma solução em Java que determine os múltiplos comuns de vários números inteiros (N)
    //num dado intervalo.
    public static int[] getCommonMultiples(int[] numbers, int start, int end) {
        int[] commonMultiples = Exercicio9.multiplesOfNumberInInterval(numbers[0], start, end);
        for (int i = 1; i < numbers.length; i++) {
            int[] Multiples = Exercicio9.multiplesOfNumberInInterval(numbers[i], start, end);
            commonMultiples = concatArrays(commonMultiples, Multiples);
            commonMultiples = returnsOnlyRepeatedElementsOfArray(commonMultiples);
        }
        return commonMultiples;
    }

    public static int[] returnsOnlyRepeatedElementsOfArray(int[] array) {
        int[] repeatedElements = new int[array.length];
        int repeatedElementsIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repeatedElements[repeatedElementsIndex] = array[i];
                    repeatedElementsIndex++;
                }
            }
        }
        return Exercicio8.cleanArray(repeatedElements, repeatedElementsIndex);
    }
        public static int[] concatArrays(int[] array1, int[] array2){
            int[] result = new int[array1.length + array2.length];
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i];
            }
            for (int i = 0; i < array2.length; i++) {
                result[array1.length + i] = array2[i];
            }
            return result;
        }
    }
