package org.example.Bloco3;

public class Exercicio6 {
    //ma pequena empresa nacional vai começar a processar os salários para o corrente mês. Os seus
    //funcionários fizeram horas extraordinárias no mês anterior, as quais serão pagas juntamente com o
    //salário base. O preço de cada hora extraordinária é de 2% do salário base.

    public static int returnsSalaryWithExtraHours(int baseSalary, int extraHours){
        if (extraHours < 0) return -1;
        if (baseSalary <= 0) return -1;
        return baseSalary + (int)(baseSalary * 0.02 * extraHours);
    }
}
