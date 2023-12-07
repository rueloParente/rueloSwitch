package org.example.Bloco3;

public class Exercicio16 {
    //Elabore uma solução em Java que dado um número inteiro classifique esse número. Deve retornar 0 se
    //for perfeito, 1 se for abundante e -1 se for reduzido.
    public static int classifyNumber(int num){
        int sumOfDivisors = 0;
        if (num < 0) return -2;
        for (int i = 1; i < num; i++) {
            if(num % i == 0) sumOfDivisors += i;
        }
        if(sumOfDivisors == num) return 0;
        else if(Math.max(sumOfDivisors, num) == sumOfDivisors) return 1;
        else return -1;
    }
}
