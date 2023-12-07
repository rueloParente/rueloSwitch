package org.example.Bloco4;

public class Exercicio2 {
    //Construa uma solução em Java que dado um número inteiro positivo retorne um vetor em que os seus
    //elementos correspondem aos dígitos do número dado.
    public static int[] digitsOfLongNumber (long num){
        if (num == 0) return new int[]{0};
        else num = Math.abs(num);

        int numberOfDigits = Exercicio1.numberOfDigitsOfLongNumber(num);
        int[] digits = new int[numberOfDigits];
        for (int i = numberOfDigits - 1; i >= 0; i--){
            digits[i] = (int) (num % 10);
            num = num / 10;
        }
        return digits;
    }
}
