package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio7Test {
    //Desenvolva uma solução em Java que receba um array de números positivos e que retorne em que
    //posição o produto acumulado destes é superior a um dado número fornecido pelo utilizador.
    //test with array [1,2,3,4,5,6,7,8,9,10] and number 100
    @Test
    public void testReturnsPositionOfProductOfArrayGreaterThanNumberWithArray12345678910AndNumber100(){
        //arrange
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int number = 120;
        int expected = 5;
        //act
        int result = Exercicio7.returnsPositionOfProductOfArrayGreaterThanNumber(array, number);
        //assert
        assertEquals(result, expected);
    }
    //test with array [1,2,3,4] and number 1000
    @Test
    public void testReturnsPositionOfProductOfArrayGreaterThanNumberWithArray1234AndNumber1000(){
        //arrange
        int[] array = {1,2,3,4};
        int number = 1000;
        int expected = -1;
        //act
        int result = Exercicio7.returnsPositionOfProductOfArrayGreaterThanNumber(array, number);
        //assert
        assertEquals(result, expected);
    }


}