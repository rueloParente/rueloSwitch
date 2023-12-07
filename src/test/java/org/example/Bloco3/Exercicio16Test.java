package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio16Test {
    @Test
    void shouldReturn0WhenNumberIsPerfect() {
        //Arrange
        int num = 6;
        //Act
        int result = Exercicio16.classifyNumber(num);
        //Assert
        assertEquals(0, result);

    }
    @Test
    void shouldReturn1WhenNumberIsAbundant() {
        //Arrange
        int num = 12;
        //Act
        int result = Exercicio16.classifyNumber(num);
        //Assert
        assertEquals(1, result);

    }
    @Test
    void shouldReturnMinus1WhenNumberIsReduced() {
        //Arrange
        int num = 8;
        //Act
        int result = Exercicio16.classifyNumber(num);
        //Assert
        assertEquals(-1, result);

    }
    //Assume que zero é um numero perfeito
    @Test
    void shouldReturn0WhenNumberIsZero() {
        //Arrange
        int num = 0;
        //Act
        int result = Exercicio16.classifyNumber(num);
        //Assert
        assertEquals(0, result);

    }
    //Assume codigo erro -2 para numeros negativos
    @Test
    void shouldReturnMinus2WhenNumberIsNegative() {
        //Arrange
        int num = -1;
        //Act
        int result = Exercicio16.classifyNumber(num);
        //Assert
        assertEquals(-2, result);

    }

}