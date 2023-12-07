package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio7Test {
    //Sum of odd digits
    @Test
    void shouldReturnSumOfOddDigits() {
        long number = 123456789;
        int expected = 25;
        int actual = Exercicio7.sumOddDigits(number);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnZero() {
        long number = 2468;
        int expected = 0;
        int actual = Exercicio7.sumOddDigits(number);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnSumOfOddDigitsOfNegativeNumber() {
        long number = -123456789;
        int expected = 25;
        int actual = Exercicio7.sumOddDigits(number);
        assertEquals(expected, actual);
    }

}