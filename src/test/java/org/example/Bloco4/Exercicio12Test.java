package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12Test {
    @Test
    void shouldReturnTruWithCapicuaNumber() {
        //Arrange
        int number = 12321;
        boolean expected = true;
        //Act
        boolean actual = new Exercicio12().isCapicua(number);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFalseWithNonCapicuaNumber() {
        //Arrange
        int number = 12345;
        boolean expected = false;
        //Act
        boolean actual = new Exercicio12().isCapicua(number);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueWithZero() {
        //Arrange
        int number = 0;
        boolean expected = true;
        //Act
        boolean actual = new Exercicio12().isCapicua(number);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueWithNegativeNumber() {
        //Arrange
        int number = -12321;
        boolean expected = true;
        //Act
        boolean actual = new Exercicio12().isCapicua(number);
        //Assert
        assertEquals(expected, actual);
    }
}