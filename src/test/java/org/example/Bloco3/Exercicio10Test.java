package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio10Test {
    //teste with char h
    @Test
    void testWithCharH() {
        //Arrange
        char moeda = 'h';
        //Act
        double result = Exercicio10.ForexExchangeToEuro(moeda);
        //Assert
        assertEquals(-1, result);
    }
    //teste with char d
    @Test
    void testWithCharD() {
        //Arrange
        char moeda = 'd';
        //Act
        double result = Exercicio10.ForexExchangeToEuro(moeda);
        //Assert
        assertEquals(1.534, result);
    }
    //teste with char l
    @Test
    void testWithCharL() {
        //Arrange
        char moeda = 'l';
        //Act
        double result = Exercicio10.ForexExchangeToEuro(moeda);
        //Assert
        assertEquals(0.774, result);
    }
    //teste with char i
    @Test
    void testWithCharI() {
        //Arrange
        char moeda = 'i';
        //Act
        double result = Exercicio10.ForexExchangeToEuro(moeda);
        //Assert
        assertEquals(161.480, result);
    }
    //teste with char c
    @Test
    void testWithCharC() {
        //Arrange
        char moeda = 'c';
        //Act
        double result = Exercicio10.ForexExchangeToEuro(moeda);
        //Assert
        assertEquals(9.593, result);
    }
    //teste with char f
    @Test
    void testWithCharF() {
        //Arrange
        char moeda = 'f';
        //Act
        double result = Exercicio10.ForexExchangeToEuro(moeda);
        //Assert
        assertEquals(1.601, result);
    }


}