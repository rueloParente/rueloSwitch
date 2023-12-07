package org.example.Bloco3;

public class Exercicio10 {
   //Elabore uma solução em Java para obter o valor de câmbio de valores em euros, numa das moedas
    //indicadas na tabela. As opções de câmbio possíveis são as seguintes: D (dólar), L (libra), I (Iene), C
    //(Coroa Sueca) e F (Franco Suíço).
    public static double ForexExchangeToEuro(char moeda){
        double converstionRate = -1;
        if (moeda == 'd') converstionRate = 1.534;
        else if (moeda == 'l') converstionRate = 0.774;
        else if (moeda == 'i') converstionRate = 161.480;
        else if (moeda == 'c') converstionRate = 9.593;
        else if (moeda == 'f') converstionRate = 1.601;
        return converstionRate;
    }
}
