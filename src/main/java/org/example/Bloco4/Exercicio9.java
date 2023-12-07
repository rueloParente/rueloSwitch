package org.example.Bloco4;

public class Exercicio9 {
    //Construa uma solução em Java que determine os múltiplos of num num dado intervalo.
    public static int[] multiplesOfNumberInInterval (int num, int start, int end){
        int[] multiples = new int[Math.subtractExact(end, start)+1];
        if (num == 0) num = 1;

        int index = 0;
        for (int i = start; i <= end; i++){
            if (i % num == 0){
                multiples[index] = i;
                index++;
            }
        }
        return Exercicio8.cleanArray(multiples, index);
    }

}
