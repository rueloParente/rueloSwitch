package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio2Test {
    //a) A soma de todos os números pares num dado intervalo.
    @Test
    public void testReturnTheSumOfAllEvenNumbersInInterval() {
        //Arrange
        int min = 1;
        int max = 10;
        int expected = 30;
        //Act
        int actual = Exercicio3.returnTheSumOfAllEvenNumbersInInterval(min, max);
        //Assert
        assertEquals(expected, actual);
    }
    //test with min > max
    @Test
    public void testReturnTheSumOfAllEvenNumbersInIntervalWithMinGreaterThanMax() {
        //Arrange
        int min = 10;
        int max = 1;
        int expected = -1;
        //Act
        int actual = Exercicio3.returnTheSumOfAllEvenNumbersInInterval(min, max);
        //Assert
        assertEquals(expected, actual);
    }
    //test with min = max
    @Test
    public void testReturnTheSumOfAllEvenNumbersInIntervalWithMinEqualsMax() {
        //Arrange
        int min = 10;
        int max = 10;
        int expected = 10;
        //Act
        int actual = Exercicio3.returnTheSumOfAllEvenNumbersInInterval(min, max);
        //Assert
        assertEquals(expected, actual);
    }
    //c) O número de múltiplos de 3 e 5 num dado intervalo.
    //test with min > max
    @Test
    public void testReturnTheNumberOfMultiplesOfThreeAndFiveInIntervalWithMinGreaterThanMax() {
        //Arrange
        int min = 10;
        int max = 1;
        int expected = -1;
        //Act
        int actual = Exercicio2.returnTheNumberOfMultiplesOfThreeAndFiveInInterval(min, max);
        //Assert
        assertEquals(expected, actual);
    }
    //test with min = max
    @Test
    public void testReturnTheNumberOfMultiplesOfThreeAndFiveInIntervalWithMinEqualsMax() {
        //Arrange
        int min = 10;
        int max = 10;
        int expected = 0;
        //Act
        int actual = Exercicio2.returnTheNumberOfMultiplesOfThreeAndFiveInInterval(min, max);
        //Assert
        assertEquals(expected, actual);
    }
    //test with min < max
    @Test
    public void testReturnTheNumberOfMultiplesOfThreeAndFiveInIntervalWithMinLessThanMax() {
        //Arrange
        int min = 1;
        int max = 15;
        int expected = 1;
        //Act
        int actual = Exercicio2.returnTheNumberOfMultiplesOfThreeAndFiveInInterval(min, max);
        //Assert
        assertEquals(expected, actual);
    }
    //test with min < max no multiples
    @Test
    public void testReturnTheNumberOfMultiplesOfThreeAndFiveInIntervalWithMinLessThanMaxNoMultiples() {
        //Arrange
        int min = 1;
        int max = 10;
        int expected = 0;
        //Act
        int actual = Exercicio2.returnTheNumberOfMultiplesOfThreeAndFiveInInterval(min, max);
        //Assert
        assertEquals(expected, actual);
    }
    //e) A soma de todos os números múltiplos de um dado número num dado intervalo. Os dois
    //números, que definem os limites do intervalo, não estão necessariamente por ordem crescente.
    @Test
    public void testReturnSumMultiplesOfNumber() {
        //Arrange
        int value1 = 1;
        int value2 = 10;
        int num = 2;
        int expected = 30;
        //Act
        int actual = Exercicio3.returnSumMultiplesOfNumber(value1, value2, num);
        //Assert
        assertEquals(expected, actual);
    }
    //test with value1 > value2
    @Test
    public void testReturnSumMultiplesOfNumberWithValue1GreaterThanValue2() {
        //Arrange
        int value1 = 10;
        int value2 = 1;
        int num = 2;
        int expected = 30;
        //Act
        int actual = Exercicio3.returnSumMultiplesOfNumber(value1, value2, num);
        //Assert
        assertEquals(expected, actual);
    }
    //test with num = 0
    @Test
    public void testReturnSumMultiplesOfNumberWithNumEqualsZero() {
        //Arrange
        int value1 = 1;
        int value2 = 10;
        int num = 0;
        int expected = 55;
        //Act
        int actual = Exercicio3.returnSumMultiplesOfNumber(value1, value2, num);
        //Assert
        assertEquals(expected, actual);
    }
    //test with value1 = value2
    @Test
    public void testReturnSumMultiplesOfNumberWithValue1EqualsValue2() {
        //Arrange
        int value1 = 10;
        int value2 = 10;
        int num = 2;
        int expected = 10;
        //Act
        int actual = Exercicio3.returnSumMultiplesOfNumber(value1, value2, num);
        //Assert
        assertEquals(expected, actual);
    }
    //g) A média dos múltiplos de um dado número num intervalo definido por dois números.
    @Test
    public void testReturnAverageOfMultiplesOfNumber() {
        //Arrange
        int value1 = 1;
        int value2 = 10;
        int num = 2;
        double expected = 6.0;
        //Act
        double actual = Exercicio3.returnAverageOfMultiplesOfNumber(value1, value2, num);
        //Assert
        assertEquals(expected, actual);
    }
    //test with value1 > value2
    @Test
    public void testReturnAverageOfMultiplesOfNumberWithValue1GreaterThanValue2() {
        //Arrange
        int value1 = 10;
        int value2 = 1;
        int num = 2;
        double expected = 6.0;
        //Act
        double actual = Exercicio3.returnAverageOfMultiplesOfNumber(value1, value2, num);
        //Assert
        assertEquals(expected, actual);
    }
    //test with num = 0
    @Test
    public void testReturnAverageOfMultiplesOfNumberWithNumEqualsZero() {
        //Arrange
        int value1 = 1;
        int value2 = 10;
        int num = 0;
        double expected = 5.5;
        //Act
        double actual = Exercicio3.returnAverageOfMultiplesOfNumber(value1, value2, num);
        //Assert
        assertEquals(expected, actual);
    }
    //test with value1 = value2
    @Test
    public void testReturnAverageOfMultiplesOfNumberWithValue1EqualsValue2() {
        //Arrange
        int value1 = 10;
        int value2 = 10;
        int num = 2;
        double expected = 10.0;
        //Act
        double actual = Exercicio3.returnAverageOfMultiplesOfNumber(value1, value2, num);
        //Assert
        assertEquals(expected, actual);
    }
}