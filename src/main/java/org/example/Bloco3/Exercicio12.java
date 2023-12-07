package org.example.Bloco3;

public class Exercicio12 {
    //Numa determinada empresa, o salário bruto dos seus trabalhadores está sujeito à seguinte regra de
    //imposto a reter: o montante até 500€ está sujeito a um imposto de 10%; o montante entre 500€ e 1000€
    //está sujeito a um imposto de 15%; e o montante acima de 1000€, a um imposto de 20%.
    //Construa uma solução em Java que dado o salário bruto de um trabalhador calcule e devolva o
    //respetivo salário líquido.
    public static double returnsNetSalaryTakingGrossSalary (double grossSalary){
        int salaryBracket = returnsBracketForSalary(grossSalary);
        double netSalary = 0;
        if (salaryBracket == -1) {
            netSalary = -1.0;
        } else if (salaryBracket == 1) {
            netSalary = grossSalary * 0.9;
        } else if (salaryBracket == 2) {
            netSalary = 450 + (grossSalary - 500) * 0.85;
        } else if (salaryBracket == 3) {
            netSalary = 875 + (grossSalary - 1000) * 0.8;
        }
        return netSalary;
    }
    protected static int returnsBracketForSalary (double grossSalary){
        int bracket;
        if (grossSalary <= 0) bracket = -1;
        else if (grossSalary <= 500) bracket = 1;
        else if (grossSalary <= 1000) bracket = 2;
        else bracket = 3;

        return bracket;
    }
}
