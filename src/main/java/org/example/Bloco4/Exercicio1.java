package org.example.Bloco4;

public class Exercicio1 {
    //Construa uma solução em Java que dado um número inteiro positivo retorne o número de dígitos desse
    //número.
    public static int numberOfDigitsOfLongNumber (long num){
        if (num == 0) return 1;
        else num = Math.abs(num);

        int numberOfDigits = 0;
        for (;num > 0;){
            num = num /10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }
}
