package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio6Test {
    @Test
    void shouldReturnSumOfEvenDigits() {
        long number = 123456789;
        int expected = 20;
        int actual = Exercicio6.sumEvenDigits(number);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnZero() {
        long number = 13579;
        int expected = 0;
        int actual = Exercicio6.sumEvenDigits(number);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnSumOfEvenDigitsOfNegativeNumber() {
        long number = -123456789;
        int expected = 20;
        int actual = Exercicio6.sumEvenDigits(number);
        assertEquals(expected, actual);
    }

}