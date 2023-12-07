package org.example.Bloco4;

public class Exercicio6 {
    //Construa uma solução em Java que calcule a soma dos dígitos pares de um número inteiro positivo.
    public static int sumEvenDigits(long number) {
        int [] digits = Exercicio2.digitsOfLongNumber(number);
        int [] evenDigits = Exercicio4.evenElementsOfArray(digits);
        int sum = Exercicio3.sumOfArrayElements(evenDigits);
        return sum;
    }
}
