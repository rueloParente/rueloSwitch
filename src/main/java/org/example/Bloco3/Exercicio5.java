package org.example.Bloco3;

public class Exercicio5 {
    //a) Verifique se um número inteiro longo é capicua.
    public static boolean returnsIfNumberIsCapicua (int num){
        num = Math.abs(num);
        if (num <10) return true;
        int capicua = 0;
        int temp = num;
        while (temp > 0){
            capicua = capicua*10 + temp%10;
            temp /= 10;
        }
        return num == capicua;
    }
    //b) Verifique se um dado número é um número de Amstrong, i.e. se for igual à soma dos cubos dos seus algarismos.
    public static boolean returnsIfNumberIsAmstrong (int num){
        num = Math.abs(num);
        int temp = num;
        int amstrong = 0;
        while (temp > 0){
            amstrong += (int)Math.pow(temp%10,3);
            temp/=10;
        }
        return amstrong == num;
    }

    //e) Retorne o número de capicuas num dado intervalo.
    public static int returnsNumberOfCapicuasInInterval(int start, int end){
        int count = 0;
        if (start > end) return -1;
        for (int i = start; i <= end; i++){
            if (returnsIfNumberIsCapicua(i)) count++;
        }
        return count;
    }
    //f) Retorne o primeiro número de Amstrong num dado intervalo.
    public static int returnsFirstAmstrongInInterval(int start, int end){
        if (start > end) return -1;
        for (int i = start; i <= end; i++){
            if (returnsIfNumberIsAmstrong(i)) return i;
        }
        return -2;
    }
}
