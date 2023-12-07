package org.example.Bloco4;

public class Exercicio7 {
    //Construa uma solução semelhante à anterior para calcular a soma dos elementos ímpares do número
    //recebido.
    public static int sumOddDigits(long number) {
        int [] digits = Exercicio2.digitsOfLongNumber(number);
        int [] oddDigits = Exercicio5.getOddNumbers(digits);
        int sum = Exercicio3.sumOfArrayElements(oddDigits);
        return sum;
    }
}
