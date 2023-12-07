package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio4Test {
    // a) O número de algarismos de um número inteiro longo.
    //test with positive number
    @Test
    public void testReturnNumberOfDigitsOfLongIntegerWithPositiveNumber(){
        //arrange
        long num = 123456789;
        int expected = 9;
        //act
        int result = Exercicio4.returnNumberOfDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }

    //test with negative number
    @Test
    public void testReturnNumberOfDigitsOfLongIntegerWithNegativeNumber(){
        //arrange
        long num = -123456789;
        int expected = 9;
        //act
        int result = Exercicio4.returnNumberOfDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //test with zero
    @Test
    public void testReturnNumberOfDigitsOfLongIntegerWithZero(){
        //arrange
        long num = 0;
        int expected = 1;
        //act
        int result = Exercicio4.returnNumberOfDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //test with 1
    @Test
    public void testReturnNumberOfDigitsOfLongIntegerWithOne(){
        //arrange
        long num = 1;
        int expected = 1;
        //act
        int result = Exercicio4.returnNumberOfDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //f) A soma dos algarismos ímpares de um número inteiro longo.
    //test with positive number
    @Test
    public void testReturnsSumOfOddDigitsOfLongIntegerWithPositiveNumber(){
        //arrange
        long num = 123456789;
        int expected = 25;
        //act
        int result = Exercicio4.returnsSumOfOddDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //test with all even digits
    @Test
    public void testReturnsSumOfOddDigitsOfLongIntegerWithAllEvenDigits(){
        //arrange
        long num = 2468;
        int expected = 0;
        //act
        int result = Exercicio4.returnsSumOfOddDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //test with all odd digits
    @Test
    public void testReturnsSumOfOddDigitsOfLongIntegerWithAllOddDigits(){
        //arrange
        long num = 13579;
        int expected = 25;
        //act
        int result = Exercicio4.returnsSumOfOddDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //h) A média dos algarismos pares de um número inteiro longo.
    //test with positive number
    @Test
    public void testReturnsAverageOfEvenDigitsOfLongIntegerWithPositiveNumber(){
        //arrange
        long num = 123456789;
        int expected = 5;
        //act
        int result = Exercicio4.returnsAverageOfEvenDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //test with all even digits
    @Test
    public void testReturnsAverageOfEvenDigitsOfLongIntegerWithAllEvenDigits(){
        //arrange
        long num = 2468;
        int expected = 5;
        //act
        int result = Exercicio4.returnsAverageOfEvenDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //test with all odd digits
    @Test
    public void testReturnsAverageOfEvenDigitsOfLongIntegerWithAllOddDigits(){
        //arrange
        long num = 13579;
        int expected = 0;
        //act
        int result = Exercicio4.returnsAverageOfEvenDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //test with zero
    @Test
    public void testReturnsAverageOfEvenDigitsOfLongIntegerWithZero(){
        //arrange
        long num = 0;
        int expected = 0;
        //act
        int result = Exercicio4.returnsAverageOfEvenDigitsOfLongInteger(num);
        //assert
        assertEquals(result, expected);
    }
    //j) Um número inteiro longo cujos dígitos estão pela ordem inversa (e.g. dado 987 retorna 789).
    //test with positive number
    @Test
    public void testReturnsLongIntegerWithDigitsInReverseOrderWithPositiveNumber(){
        //arrange
        long num = 123456789;
        long expected = 987654321;
        //act
        long result = Exercicio4.returnsLongIntegerWithDigitsInReverseOrder(num);
        //assert
        assertEquals(result, expected);
    }
    //test with zero
    @Test
    public void testReturnsLongIntegerWithDigitsInReverseOrderWithZero(){
        //arrange
        long num = 0;
        long expected = 0;
        //act
        long result = Exercicio4.returnsLongIntegerWithDigitsInReverseOrder(num);
        //assert
        assertEquals(result, expected);
    }
    //test with one digit number
    @Test
    public void testReturnsLongIntegerWithDigitsInReverseOrderWithOneDigitNumber(){
        //arrange
        long num = 1;
        long expected = 1;
        //act
        long result = Exercicio4.returnsLongIntegerWithDigitsInReverseOrder(num);
        //assert
        assertEquals(result, expected);
    }
}