package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio3Test {
    //b) O número de múltiplos de um dado número inteiro num dado intervalo.
    @Test
    public void returnsTheNumberOfMultiplesInInterval_WithValidInput_ReturnsCorrectNumberOfMultiples() {
        // Arrange
        int num = 3;
        int min = 1;
        int max = 10;
        int expectedNumberOfMultiples = 3;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnsTheNumberOfMultiplesInInterval(num, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    @Test
    public void returnsTheNumberOfMultiplesInInterval_WithValidInput_LastNumIsMultiple() {
        // Arrange
        int num = 5;
        int min = 1;
        int max = 10;
        int expectedNumberOfMultiples = 2;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnsTheNumberOfMultiplesInInterval(num, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    @Test
    public void returnsTheNumberOfMultiplesInInterval_WithValidInput_NumisZero() {
        // Arrange
        int num = 0;
        int min = 1;
        int max = 10;
        int expectedNumberOfMultiples = 9;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnsTheNumberOfMultiplesInInterval(num, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    //Test with min > max
    @Test
    public void returnsTheNumberOfMultiplesInInterval_WithMinGreaterThanMax_ReturnsMinusOne() {
        // Arrange
        int num = 3;
        int min = 10;
        int max = 1;
        int expectedNumberOfMultiples = -1;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnsTheNumberOfMultiplesInInterval(num, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    @Test
    public void returnsTheNumberOfMultiplesInInterval_WithMinEqualsMax() {
        // Arrange
        int num = 3;
        int min = 10;
        int max = 10;
        int expectedNumberOfMultiples = 0;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnsTheNumberOfMultiplesInInterval(num, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    //c) A soma de todos os números ímpares num dado intervalo.
    //test with min < max
    @Test
    public void returnTheSumOfAllOddNumbersInInterval_WithValidInput_ReturnsCorrectSumOfOddNumbers() {
        // Arrange
        int min = 1;
        int max = 10;
        int expectedSumOfOddNumbers = 25;

        // Act
        int actualSumOfOddNumbers = Exercicio3.returnTheSumOfAllOddNumbersInInterval(min, max);

        // Assert
        assertEquals(expectedSumOfOddNumbers, actualSumOfOddNumbers);
    }
    //test with min > max
    @Test
    public void returnTheSumOfAllOddNumbersInInterval_WithMinGreaterThanMax_ReturnsMinusOne() {
        // Arrange
        int min = 10;
        int max = 1;
        int expectedSumOfOddNumbers = -1;

        // Act
        int actualSumOfOddNumbers = Exercicio3.returnTheSumOfAllOddNumbersInInterval(min, max);

        // Assert
        assertEquals(expectedSumOfOddNumbers, actualSumOfOddNumbers);
    }
    //test with min = max
    @Test
    public void returnTheSumOfAllOddNumbersInInterval_WithMinEqualsMax() {
        // Arrange
        int min = 9;
        int max = 9;
        int expectedSumOfOddNumbers = 9;

        // Act
        int actualSumOfOddNumbers = Exercicio3.returnTheSumOfAllOddNumbersInInterval(min, max);

        // Assert
        assertEquals(expectedSumOfOddNumbers, actualSumOfOddNumbers);
    }
    //test with min negative and max positive
    @Test
    public void returnTheSumOfAllOddNumbersInInterval_WithMinNegativeAndMaxPositive_ReturnsCorrectSumOfOddNumbers() {
        // Arrange
        int min = -10;
        int max = 10;
        int expectedSumOfOddNumbers = 0;

        // Act
        int actualSumOfOddNumbers = Exercicio3.returnTheSumOfAllOddNumbersInInterval(min, max);

        // Assert
        assertEquals(expectedSumOfOddNumbers, actualSumOfOddNumbers);
    }
//d) O número de múltiplos de dois números inteiros num dado intervalo.
    @Test
    public void returnTheNumberOfMultiplesOfTwoNumbersInInterval_WithValidInput_ReturnsCorrectNumberOfMultiples() {
        // Arrange
        int num1 = 3;
        int num2 = 5;
        int min = 1;
        int max = 10;
        int expectedNumberOfMultiples = 0;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnTheNumberOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    @Test
    public void returnTheNumberOfMultiplesOfTwoNumbersInInterval_WithNum1EqualsZero_ReturnsCorrectNumberOfMultiples() {
        // Arrange
        int num1 = 0;
        int num2 = 5;
        int min = 1;
        int max = 10;
        int expectedNumberOfMultiples = 2;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnTheNumberOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    @Test
    public void returnTheNumberOfMultiplesOfTwoNumbersInInterval_WithNum2EqualsZero_ReturnsCorrectNumberOfMultiples() {
        // Arrange
        int num1 = 3;
        int num2 = 0;
        int min = 1;
        int max = 10;
        int expectedNumberOfMultiples = 3;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnTheNumberOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    @Test
    public void returnTheNumberOfMultiplesOfTwoNumbersInInterval_WithNum1EqualsNum2EqualsZero_ReturnsCorrectNumberOfMultiples() {
        // Arrange
        int num1 = 0;
        int num2 = 0;
        int min = 1;
        int max = 10;
        int expectedNumberOfMultiples = 9;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnTheNumberOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    @Test
    public void returnTheNumberOfMultiplesOfTwoNumbersInInterval_WithMinGreaterThanMax_ReturnsMinusOne() {
        // Arrange
        int num1 = 3;
        int num2 = 5;
        int min = 10;
        int max = 1;
        int expectedNumberOfMultiples = -1;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnTheNumberOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    @Test
    public void returnTheNumberOfMultiplesOfTwoNumbersInInterval_WithMinEqualsMax_ReturnsZero() {
        // Arrange
        int num1 = 3;
        int num2 = 5;
        int min = 10;
        int max = 10;
        int expectedNumberOfMultiples = 0;

        // Act
        int actualNumberOfMultiples = Exercicio2.returnTheNumberOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedNumberOfMultiples, actualNumberOfMultiples);
    }
    //e) A soma dos múltiplos de dois números inteiros num dado intervalo.
    @Test
    public void returnTheSumOfMultiplesOfTwoNumbersInInterval_WithValidInput_ReturnsCorrectSumOfMultiples() {
        // Arrange
        int num1 = 3;
        int num2 = 5;
        int min = 1;
        int max = 10;
        int expectedSumOfMultiples = 0;

        // Act
        int actualSumOfMultiples = Exercicio2.returnTheSumOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedSumOfMultiples, actualSumOfMultiples);
    }
    @Test
    public void returnTheSumOfMultiplesOfTwoNumbersInInterval_WithValidInput_ReturnsCorrectSumOfMultiples2() {
        // Arrange
        int num1 = 3;
        int num2 = 6;
        int min = 1;
        int max = 10;
        int expectedSumOfMultiples = 6;

        // Act
        int actualSumOfMultiples = Exercicio2.returnTheSumOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedSumOfMultiples, actualSumOfMultiples);
    }
    @Test
    public void returnTheSumOfMultiplesOfTwoNumbersInInterval_WithNum1EqualsZero_ReturnsCorrectSumOfMultiples() {
        // Arrange
        int num1 = 0;
        int num2 = 5;
        int min = 1;
        int max = 10;
        int expectedSumOfMultiples = 15;

        // Act
        int actualSumOfMultiples = Exercicio2.returnTheSumOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedSumOfMultiples, actualSumOfMultiples);
    }
    @Test
    public void returnTheSumOfMultiplesOfTwoNumbersInInterval_WithNum2EqualsZero_ReturnsCorrectSumOfMultiples() {
        // Arrange
        int num1 = 3;
        int num2 = 0;
        int min = 1;
        int max = 10;
        int expectedSumOfMultiples = 18;

        // Act
        int actualSumOfMultiples = Exercicio2.returnTheSumOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedSumOfMultiples, actualSumOfMultiples);
    }
    @Test
    public void returnTheSumOfMultiplesOfTwoNumbersInInterval_WithNum1EqualsNum2EqualsZero_ReturnsCorrectSumOfMultiples() {
        // Arrange
        int num1 = 0;
        int num2 = 0;
        int min = 1;
        int max = 10;
        int expectedSumOfMultiples = 55;

        // Act
        int actualSumOfMultiples = Exercicio2.returnTheSumOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedSumOfMultiples, actualSumOfMultiples);
    }
    @Test
    public void returnTheSumOfMultiplesOfTwoNumbersInInterval_WithMinGreaterThanMax_ReturnsMinusOne() {
        // Arrange
        int num1 = 3;
        int num2 = 5;
        int min = 10;
        int max = 1;
        int expectedSumOfMultiples = -1;

        // Act
        int actualSumOfMultiples = Exercicio2.returnTheSumOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedSumOfMultiples, actualSumOfMultiples);
    }
    @Test
    public void returnTheSumOfMultiplesOfTwoNumbersInInterval_WithMinEqualsMax_ReturnsZero() {
        // Arrange
        int num1 = 3;
        int num2 = 5;
        int min = 10;
        int max = 10;
        int expectedSumOfMultiples = 0;

        // Act
        int actualSumOfMultiples = Exercicio2.returnTheSumOfMultiplesOfTwoNumbersInInterval(num1, num2, min, max);

        // Assert
        assertEquals(expectedSumOfMultiples, actualSumOfMultiples);
    }
    //h) A média dos múltiplos de X ou Y num intervalo definido por dois números. X e Y são dados.
    //test with min < max
    @Test
    public void returnAverageOfMultiplesOfXorY_WithValidInput_ReturnsCorrectAverageOfMultiples() {
        // Arrange
        int min = 1;
        int max = 10;
        int num1 = 3;
        int num2 = 5;
        double expectedAverageOfMultiples = 6.6;

        // Act
        double actualAverageOfMultiples = Exercicio3.returnAverageOfMultiplesOfXorY(min, max, num1, num2);

        // Assert
        assertEquals(expectedAverageOfMultiples, actualAverageOfMultiples);
    }
    //test with min > max
    @Test
    public void returnAverageOfMultiplesOfXorY_WithMinGreaterThanMax_ReturnsMinusOne() {
        // Arrange
        int min = 10;
        int max = 1;
        int num1 = 3;
        int num2 = 5;
        double expectedAverageOfMultiples = -1;

        // Act
        double actualAverageOfMultiples = Exercicio3.returnAverageOfMultiplesOfXorY(min, max, num1, num2);

        // Assert
        assertEquals(expectedAverageOfMultiples, actualAverageOfMultiples);
    }
    //test with min = max
    @Test
    public void returnAverageOfMultiplesOfXorY_WithMinEqualsMax_ReturnsTen() {
        // Arrange
        int min = 10;
        int max = 10;
        int num1 = 3;
        int num2 = 5;
        double expectedAverageOfMultiples = 10;

        // Act
        double actualAverageOfMultiples = Exercicio3.returnAverageOfMultiplesOfXorY(min, max, num1, num2);

        // Assert
        assertEquals(expectedAverageOfMultiples, actualAverageOfMultiples);
    }
}