package org.example.Prova;

public class Exercicio1 {
//A Câmara Municipal pretende controlar a poluição do meio ambiente através de
//proibições de circulação de automóveis em função do índice de poluição do dia, da idade e
//emissão de CO2 de cada veículo, de acordo com a seguinte informação:
    public static boolean canTheCarCirculate (double polutionIndice, int carAge, int emissions){
        // ? validaçao das variaveis de entrada
        if(polutionIndice < 1) return true;
        else if ( polutionIndice >= 1 && polutionIndice < 2){
            return (carAge < 15 && emissions < 300);
        }
        else if (polutionIndice >= 2 && polutionIndice < 3) {
            return (carAge < 10 && emissions < 200);
        }
        else if (polutionIndice >= 3 && polutionIndice < 4){
            return (carAge < 5 && emissions < 100);
        }
        else return false;
    }
}
