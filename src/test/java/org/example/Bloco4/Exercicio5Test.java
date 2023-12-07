package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio5Test {

        @Test
        void shouldreturnOddNumbersOfArray() {
            int[] array = {1, 2, -3, 4, 5};
            int[] expected = {1, -3, 5};
            int[] actual = Exercicio5.getOddNumbers(array);
            assertArrayEquals(expected, actual);
        }
        @Test
        void shouldreturnAllNumbersOfArray() {
            int[] array = {1, 3, 5, 7, 9};
            int[] expected = {1, 3, 5, 7, 9};
            int[] actual = Exercicio5.getOddNumbers(array);
            assertArrayEquals(expected, actual);
        }
        //teste all even numbers
        @Test
        void shouldReturnEmptyArray() {
            int[] array = {2, 4, 6, 8, 10};
            int[] expected = {};
            int[] actual = Exercicio5.getOddNumbers(array);
            assertArrayEquals(expected, actual);
        }
}