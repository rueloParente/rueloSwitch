package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio13Test {
    //a) Elabore uma solução em Java que dado o peso de um animal e a quantidade de ração que come
    //diariamente, indique se essa quantidade é a adequada para um animal com esse peso,
    //retornando 0. Em todas as outras situações deve retornar 1 se a alimentação está acima do
    //esperado ou -1 se estiver abaixo. Nota: Não necessita de validar os dados de entrada.
    //test with weight 10 and daily intake 100
    @Test
    void testWithWeight10AndDailyIntake100() {
        //Arrange
        int weight = 10;
        int dailyIntake = 100;
        int expected = 0;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 10 and daily intake 101
    @Test
    void testWithWeight10AndDailyIntake101() {
        //Arrange
        int weight = 10;
        int dailyIntake = 101;
        int expected = 1;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 10 and daily intake 99
    @Test
    void testWithWeight10AndDailyIntake99() {
        //Arrange
        int weight = 10;
        int dailyIntake = 99;
        int expected = -1;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 25 and daily intake 250
    @Test
    void testWithWeight25AndDailyIntake250() {
        //Arrange
        int weight = 25;
        int dailyIntake = 250;
        int expected = 0;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 25 and daily intake 251
    @Test
    void testWithWeight25AndDailyIntake251() {
        //Arrange
        int weight = 25;
        int dailyIntake = 251;
        int expected = 1;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 25 and daily intake 249
    @Test
    void testWithWeight25AndDailyIntake249() {
        //Arrange
        int weight = 25;
        int dailyIntake = 249;
        int expected = -1;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 45 and daily intake 300
    @Test
void testWithWeight45AndDailyIntake300() {
        //Arrange
        int weight = 45;
        int dailyIntake = 300;
        int expected = 0;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 45 and daily intake 301
    @Test
    void testWithWeight45AndDailyIntake301() {
        //Arrange
        int weight = 45;
        int dailyIntake = 301;
        int expected = 1;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 45 and daily intake 299
    @Test
    void testWithWeight45AndDailyIntake299() {
        //Arrange
        int weight = 45;
        int dailyIntake = 299;
        int expected = -1;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 46 and daily intake 500
    @Test
    void testWithWeight46AndDailyIntake500() {
        //Arrange
        int weight = 46;
        int dailyIntake = 500;
        int expected = 0;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 46 and daily intake 501
    @Test
    void testWithWeight46AndDailyIntake501() {
        //Arrange
        int weight = 46;
        int dailyIntake = 501;
        int expected = 1;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }
    //test with weight 46 and daily intake 499
    @Test
    void testWithWeight46AndDailyIntake499() {
        //Arrange
        int weight = 46;
        int dailyIntake = 499;
        int expected = -1;
        //Act
        int result = Exercicio13.calculaRacao(weight, dailyIntake);
        //Assert
        assertEquals(expected, result);
    }

}