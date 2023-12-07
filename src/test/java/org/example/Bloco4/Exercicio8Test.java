package org.example.Bloco4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio8Test {

        @Test
        void cleanArray() {
            int[] array = {1, 2, 3, 4, 5};
            int[] expected = {1, 2, 3};
            int[] actual = Exercicio8.cleanArray(array, 3);
            assertArrayEquals(expected, actual);
        }
        @Test
        void cleanArrayWithSameLength() {
            int[] array = {1, 2, 3, 4, 5};
            int[] expected = {1, 2, 3, 4, 5};
            int[] actual = Exercicio8.cleanArray(array, 5);
            assertArrayEquals(expected, actual);
        }
        @Test
        void cleanArrayWithZeroLength() {
            int[] array = {1, 2, 3, 4, 5};
            int[] expected = {};
            int[] actual = Exercicio8.cleanArray(array, 0);
            assertArrayEquals(expected, actual);
        }
        @Test
        void cleanArrayWithNegativeLength() {
            int[] array = {1, 2, 3, 4, 5};
            int[] expected = {};
            int[] actual = Exercicio8.cleanArray(array, -1);
            assertArrayEquals(expected, actual);
        }
        @Test
        void cleanArrayWithLengthGreaterThanArrayLength() {
            int[] array = {1, 2, 3, 4, 5};
            int[] expected = {1, 2, 3, 4, 5};
            int[] actual = Exercicio8.cleanArray(array, 6);
            assertArrayEquals(expected, actual);
        }

}