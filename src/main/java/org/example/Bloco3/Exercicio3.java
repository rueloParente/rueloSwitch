package org.example.Bloco3;

public class Exercicio3 {
    //a) A soma de todos os números pares num dado intervalo.
    public static int returnTheSumOfAllEvenNumbersInInterval(int min, int max){
        if (min > max) return -1;
        int sumOfEvenNumbers = 0;
        for (int i=min; i<=max; i++){
            if (i%2==0){
                sumOfEvenNumbers += i;
            }
        }
        return sumOfEvenNumbers;
    }
    //c) A soma de todos os números ímpares num dado intervalo.
    public static int returnTheSumOfAllOddNumbersInInterval(int min, int max){
        if (min > max) return -1;
        int sumOfOddNumbers = 0;
        for (int i=min; i<=max; i++){
            if (i%2!=0){
                sumOfOddNumbers += i;
            }
        }
        return sumOfOddNumbers;
    }
    //e) A soma de todos os números múltiplos de um dado número num dado intervalo. Os dois
    //números, que definem os limites do intervalo, não estão necessariamente por ordem crescente.
    public static int returnSumMultiplesOfNumber (int value1, int value2, int num){
        int min = Math.min(value1, value2);
        int max = Math.max(value1, value2);
        if (num==0) num = 1;
        int sum=0;
        for (int i = min; i <= max; i++){
            if (i%num == 0) sum += i;
        }
              return sum;
    }
    //g) A média dos múltiplos de um dado número num intervalo definido por dois números.
    public static double returnAverageOfMultiplesOfNumber (int value1, int value2, int num){
        int min = Math.min(value1, value2);
        int max = Math.max(value1, value2);
        if (num==0) num = 1;
        int sum=0;
        int count=0;
        for (int i = min; i <= max; i++){
            if (i%num == 0) {
                sum += i;
                count++;
            }
        }
        return (double) sum/count;
    }
    //h) A média dos múltiplos de X ou Y num intervalo definido por dois números. X e Y são dados.
    public static double returnAverageOfMultiplesOfXorY (int min, int max, int num1, int num2){
        if (min > max) return -1;
        if (num1==0) num1 = 1;
        if (num2==0) num2 = 1;
        int sum=0;
        int count=0;
        for (int i = min; i <= max; i++){
            if (i%num1 == 0 || i%num2 == 0) {
                sum += i;
                count++;
            }
        }
        return (double) sum/count;
    }
}
