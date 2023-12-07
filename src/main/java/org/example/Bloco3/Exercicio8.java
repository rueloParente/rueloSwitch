package org.example.Bloco3;

public class Exercicio8 {
    //Elabore uma solução em Java que, dado um número N de 1 a 20, retorne o número de todas as
    //maneiras possíveis de obter esse número N, somando dois números de 0 a 10, independentemente da
    //ordem desses dois números.
    public static int returnsNumberOfWaysToGetNumber(int num){
        if (num < 0 || num > 20) return -1;
        int count = 0;
        for (int i = 0; i <= num; i++){
            for (int j = 0; j <= num/2; j++){
                if (i + j == num) count++;
            }
        }
        return count;
    }

}
