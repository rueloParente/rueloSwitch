package org.example.Bloco4;

public class Exercicio12 {
    //Construa uma solução em Java que dado um número inteiro positivo verifique se o mesmo é ou não
    //capicua.
    public boolean isCapicua(int number) {
        int reverse = 0;
        int aux = number;
        while (aux != 0) {
            int lastDigit = aux % 10;
            reverse = reverse * 10 + lastDigit;
            aux /= 10;
        }

        return number == reverse;
    }
}
