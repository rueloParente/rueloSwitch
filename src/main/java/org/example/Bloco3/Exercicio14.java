package org.example.Bloco3;

public class Exercicio14 {
    //Defina uma solução em Java para detetar erros de escrita do número do Bilhete de Identidade ou
    //Cartão de Cidadão.
    //O procedimento de verificação é o seguinte: primeiro, acrescenta-se à direita do número o algarismo
    //que se encontra imediatamente à sua direita no cartão de identificação; depois, determina-se a soma
    //ponderada dos 8 algarismos desse número; e por fim, verifica-se se essa soma é múltipla de 11. Se for, o
    //número está correto, senão, está errado.
/*    public static boolean checksNumberOfIdentificationCard (int num, int algarismo){
        int numberLength = (int)Math.log10(num)+1;
        if ( numberLength != 7) return false;

        int i = 2;
        int sum = 0;
        while (num != 0){
            int digit = num % 10;
            sum += digit * (i);
            i++;
            num /= 10;
        }
        return (sum+algarismo) % 11 == 0;
    }*/
/*    public static boolean checksNumberOfIdentificationCard (int num, int algarismo){
        int validation = (num * 10) + algarismo;
        int numberLength = (int)Math.log10(num)+1;
        if ( numberLength != 8) return false;

        int i = 1;
        int sum = 0;
        while (validation != 0){
            int digit = validation % 10;
            sum += digit * (i);
            i++;
            validation /= 10;
        }
        return sum % 11 == 0;
    }*/
}
