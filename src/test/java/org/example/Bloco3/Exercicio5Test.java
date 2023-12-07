package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio5Test {
    //a) Verifique se um número inteiro longo é capicua.
    //test with positive number
    @Test
    public void testReturnsIfNumberIsCapicuaWithPositiveNumber(){
        //arrange
        int num = 12321;
        boolean expected = true;
        //act
        boolean result = Exercicio5.returnsIfNumberIsCapicua(num);
        //assert
        assertEquals(result, expected);
    }
    //test with number 10
    @Test
    public void testReturnsIfNumberIsCapicuaWithNumber10(){
        //arrange
        int num = 10;
        boolean expected = false;
        //act
        boolean result = Exercicio5.returnsIfNumberIsCapicua(num);
        //assert
        assertEquals(result, expected);
    }
    //test with number 0
    @Test
    public void testReturnsIfNumberIsCapicuaWithNumber0(){
        //arrange
        int num = 0;
        boolean expected = true;
        //act
        boolean result = Exercicio5.returnsIfNumberIsCapicua(num);
        //assert
        assertEquals(result, expected);
    }
    //b) Verifique se um dado número é um número de Amstrong, i.e. se for igual à soma dos cubos dos seus algarismos.
    //test with positive number
    @Test
    public void testReturnsIfNumberIsAmstrongWithPositiveNumber(){
        //arrange
        int num = 153;
        boolean expected = true;
        //act
        boolean result = Exercicio5.returnsIfNumberIsAmstrong(num);
        //assert
        assertEquals(result, expected);
    }
    //test with zero
    @Test
    public void testReturnsIfNumberIsAmstrongWithZero(){
        //arrange
        int num = 0;
        boolean expected = true;
        //act
        boolean result = Exercicio5.returnsIfNumberIsAmstrong(num);
        //assert
        assertEquals(result, expected);
    }
    //test with negative number
    @Test
    public void testReturnsIfNumberIsAmstrongWithNegativeNumber(){
        //arrange
        int num = -153;
        boolean expected = true;
        //act
        boolean result = Exercicio5.returnsIfNumberIsAmstrong(num);
        //assert
        assertEquals(result, expected);
    }
    //test with number not amstrong
    @Test
    public void testReturnsIfNumberIsAmstrongWithNumberNotAmstrong(){
        //arrange
        int num = 154;
        boolean expected = false;
        //act
        boolean result = Exercicio5.returnsIfNumberIsAmstrong(num);
        //assert
        assertEquals(result, expected);
    }
    //e) Retorne o número de capicuas num dado intervalo.
    //test with positive numbers
    @Test
    public void testReturnsNumberOfCapicuasInIntervalWithPositiveNumbers(){
        //arrange
        int start = 1;
        int end = 100;
        int expected = 18;
        //act
        int result = Exercicio5.returnsNumberOfCapicuasInInterval(start, end);
        //assert
        assertEquals(result, expected);
    }
    //test with no capicua
    @Test
    public void testReturnsNumberOfCapicuasInIntervalWithNoCapicua(){
        //arrange
        int start = 102;
        int end = 110;
        int expected = 0;
        //act
        int result = Exercicio5.returnsNumberOfCapicuasInInterval(start, end);
        //assert
        assertEquals(result, expected);
    }
    //test with start equals end
    @Test
    public void testReturnsNumberOfCapicuasInIntervalWithStartEqualsEnd(){
        //arrange
        int start = 101;
        int end = 101;
        int expected = 1;
        //act
        int result = Exercicio5.returnsNumberOfCapicuasInInterval(start, end);
        //assert
        assertEquals(result, expected);
    }
    //test with start greater than end
    @Test
    public void testReturnsNumberOfCapicuasInIntervalWithStartGreaterThanEnd(){
        //arrange
        int start = 110;
        int end = 101;
        int expected = -1;
        //act
        int result = Exercicio5.returnsNumberOfCapicuasInInterval(start, end);
        //assert
        assertEquals(result, expected);
    }
    ////f) Retorne o primeiro número de Amstrong num dado intervalo.
    //test with positive numbers
    @Test
    public void testReturnsFirstAmstrongInIntervalWithPositiveNumbers(){
        //arrange
        int start = 1;
        int end = 100;
        int expected = 1;
        //act
        int result = Exercicio5.returnsFirstAmstrongInInterval(start, end);
        //assert
        assertEquals(result, expected);
    }
    //test with no amstrong
    @Test
    public void testReturnsFirstAmstrongInIntervalWithNoAmstrong(){
        //arrange
        int start = 102;
        int end = 110;
        int expected = -2;
        //act
        int result = Exercicio5.returnsFirstAmstrongInInterval(start, end);
        //assert
        assertEquals(result, expected);
    }
    //test with start equals end
    @Test
    public void testReturnsFirstAmstrongInIntervalWithStartEqualsEnd(){
        //arrange
        int start = 153;
        int end = 153;
        int expected =153;
        //act
        int result = Exercicio5.returnsFirstAmstrongInInterval(start, end);
        //assert
        assertEquals(result, expected);
    }
    //test with start greater than end
    @Test
    public void testReturnsFirstAmstrongInIntervalWithStartGreaterThanEnd(){
        //arrange
        int start = 110;
        int end = 101;
        int expected = -1;
        //act
        int result = Exercicio5.returnsFirstAmstrongInInterval(start, end);
        //assert
        assertEquals(result, expected);
    }

}