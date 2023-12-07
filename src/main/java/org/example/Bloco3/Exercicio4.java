package org.example.Bloco3;

public class    Exercicio4 {
    //a) O número de algarismos de um número inteiro longo.
    public static int returnNumberOfDigitsOfLongInteger(long num){
        num = Math.abs(num);
        int count = 0;
        if(num == 0) return 1;
        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }

    //f) A soma dos algarismos ímpares de um número inteiro longo.
    public static int returnsSumOfOddDigitsOfLongInteger(long num){
        num = Math.abs(num);
        int sum = 0;
        while (num > 0){
            if(num % 2 != 0) {sum += (int)num % 10;}
            num /= 10;
        }
        return sum;
    }
    //h) A média dos algarismos pares de um número inteiro longo.
    public static int returnsAverageOfEvenDigitsOfLongInteger(long num){
        num = Math.abs(num);
        int sum = 0;
        int count = 0;
        while (num > 0){
            if(num % 2 == 0) {
                sum += (int)num % 10;
                count++;
            }
            num /= 10;
        }
        if (count == 0) return 0;
        return sum/count;
    }
    //j) Um número inteiro longo cujos dígitos estão pela ordem inversa (e.g. dado 987 retorna 789).
public static long returnsLongIntegerWithDigitsInReverseOrder(long num){
        num = Math.abs(num);
        long result = 0;
        if (num==0) return 0;
        while (num > 0){
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}
