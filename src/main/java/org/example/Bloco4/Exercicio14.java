package org.example.Bloco4;

import static java.lang.Float.NaN;

public class Exercicio14 {
    //Construa uma solução em Java que calcule o produto escalar de 2 vetores de números.
    public static double productOfTwoArrays (int [] array1, int [] array2){
        if (array1.length != array2.length) return NaN;
        double product = 0;
        for (int i = 0; i < array1.length; i++){
            product += (array1[i] * array2[i]);
        }
        return product;
    }
}
