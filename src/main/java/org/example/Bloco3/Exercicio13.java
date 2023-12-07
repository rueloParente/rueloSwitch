package org.example.Bloco3;

public class Exercicio13 {
    //Em canicultura é considerada uma raça pequena a que apresenta um peso até 10Kg, uma raça média se
    //o peso for superior a 10, mas inferior ou igual a 25Kg e grande se o peso for superior a 25Kg e inferior
    //ou igual a 45Kg. Acima deste valor é uma raça gigante. Suponha que um animal de raça pequena come
    //100g de ração por dia, um de raça média 250g, um de raça grande 300g e um de raça gigante 500g.
      //a) Elabore uma solução em Java que dado o peso de um animal e a quantidade de ração que come
    //diariamente, indique se essa quantidade é a adequada para um animal com esse peso,
    //retornando 0. Em todas as outras situações deve retornar 1 se a alimentação está acima do
    //esperado ou -1 se estiver abaixo. Nota: Não necessita de validar os dados de entrada.
    public static int calculaRacao(int peso, int racao) {
        int racaoDiaria = calculateDailyIntakeTakingIntoAccountDogWeight(peso);
        int result = Integer.compare(racao, racaoDiaria);
        return result;
    }
    private static int calculateDailyIntakeTakingIntoAccountDogWeight(int peso){
        if (peso <= 10) {
            return 100;
        } else if (peso <= 25) {
            return 250;
        } else if (peso <= 45) {
            return 300;
        } else {
            return 500;
        }
    }
}
