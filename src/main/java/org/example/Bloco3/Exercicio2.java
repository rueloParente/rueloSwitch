package org.example.Bloco3;

public class Exercicio2 {
    //b) O número de múltiplos de um dado número inteiro num dado intervalo.
    public static int returnsTheNumberOfMultiplesInInterval(int num, int min, int max){
        if (min > max) return -1;
        if (num == 0) return max-min;
        int numberOfMultiples = 0;
        for (int i=min; i<=max; i++){
            if (i%num==0){
                numberOfMultiples++;
            }
        }
        return numberOfMultiples;
    }
    //c) O número de múltiplos de 3 e 5 num dado intervalo.
    public static int returnTheNumberOfMultiplesOfThreeAndFiveInInterval(int min, int max){
        if (min > max) return -1;
        int numberOfMultiples = 0;
        for (int i=min; i<=max; i++){
            if (i%3==0 && i%5==0){
                numberOfMultiples++;
            }
        }
        return numberOfMultiples;
    }
    //d) O número de múltiplos de dois números inteiros num dado intervalo.
    public static int returnTheNumberOfMultiplesOfTwoNumbersInInterval(int num1, int num2, int min, int max){
        if (min > max) return -1;
        if (num1 == 0 && num2 == 0) return max-min;
        if (num1 == 0) num1 = 1;
        if (num2 == 0) num2 = 1;

        int numberOfMultiples = 0;
        for (int i=min; i<=max; i++){
            if (i%num1==0 && i%num2==0){
                numberOfMultiples++;
            }
        }
        return numberOfMultiples;
    }
//e) A soma dos múltiplos de dois números inteiros num dado intervalo.
    public static int returnTheSumOfMultiplesOfTwoNumbersInInterval(int num1, int num2, int min, int max){
        if (min > max) return -1;
        if (num1 == 0 && num2 == 0) {
            num1 = 1;
            num2 = 1;
        }
        if (num1 == 0) num1 = 1;
        if (num2 == 0) num2 = 1;

        int sumOfMultiples = 0;
        for (int i=min; i<=max; i++){
            if (i%num1==0 && i%num2==0){
                sumOfMultiples += i;
            }
        }
        return sumOfMultiples;
    }
}
