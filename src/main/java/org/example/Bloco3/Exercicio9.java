package org.example.Bloco3;

public class Exercicio9 {
    //Construa uma solução em Java que um código de um produto e retorna a descrição de acordo com a
    //tabela abaixo.
    public static char returnNumberCorrespondingToDescription (int code){
        char codeDescription = 'f';
        if (code == 1) codeDescription = 'a';
        if (code > 1 && code <= 4) codeDescription = 'b';
        if (code > 4 && code <= 6) codeDescription = 'c';
        if (code == 7) codeDescription = 'd';
        if (code > 7 && code <= 15) codeDescription = 'e';
        return codeDescription;
    }
}
