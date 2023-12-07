package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Exercicio15Test {
    //test with positive numbers
    @Test
    public void testReturnsArrayWithEvenNumbersOnTheRightAndOddNumbersOnTheLeftWithPositiveNumbers(){
        //arrange
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6, 5, 3, 1};
        //act
        int[] result = Exercicio15.returnsArrayWithEvenNumbersOnTheRightAndOddNumbersOnTheLeft(array);
        //assert
        assertArrayEquals(result, expected);
    }
    //test with all even
    @Test
    public void testReturnsArrayWithEvenNumbersOnTheRightAndOddNumbersOnTheLeftWithAllEven(){
        //arrange
        int[] array = {2, 4, 6, 8, 10, 12};
        int[] expected = {2, 4, 6, 8, 10, 12};
        //act
        int[] result = Exercicio15.returnsArrayWithEvenNumbersOnTheRightAndOddNumbersOnTheLeft(array);
        //assert
        assertArrayEquals(result, expected);
    }
    //test with all odd
    @Test
    public void testReturnsArrayWithEvenNumbersOnTheRightAndOddNumbersOnTheLeftWithAllOdd(){
        //arrange
        int[] array = {1, 3, 5, 7, 9, 11};
        int[] expected = {11, 9, 7, 5, 3, 1};
        //act
        int[] result = Exercicio15.returnsArrayWithEvenNumbersOnTheRightAndOddNumbersOnTheLeft(array);
        //assert
        assertArrayEquals(result, expected);
    }
    //test with empty array
    @Test
    public void testReturnsArrayWithEvenNumbersOnTheRightAndOddNumbersOnTheLeftWithEmptyArray(){
        //arrange
        int[] array = {};
        int[] expected = {};
        //act
        int[] result = Exercicio15.returnsArrayWithEvenNumbersOnTheRightAndOddNumbersOnTheLeft(array);
        //assert
        assertArrayEquals(result, expected);
    }
}