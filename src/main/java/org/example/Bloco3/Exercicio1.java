package org.example.Bloco3;

public class Exercicio1 {
    // Exercicio 1
    public static long factorial(int num) {
        int validationOfEntryData = validationOfEntryData(num);
        if (validationOfEntryData != 0) return -1;
        else {
            long factorial = 1;
            for (int i = num; i >= 2; i--) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static int validationOfEntryData (int num)
    {
        if (num >= 20) return -1;
        else return 0;
    }
}
