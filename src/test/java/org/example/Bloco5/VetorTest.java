package org.example.Bloco5;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetorTest {
    //a) Construtor público em que o vetor encapsulado fica vazio (i.e. sem valores).
    @Test
    void emptyConstructorShouldCreateEmptyArray() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        boolean expected = vetor.trueIfVetorEmpty();
        //Assert
        assertTrue(expected);
    }

    @Test
    void emptyConstructorShouldCreateArrayWithLengthZero() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        int expected = vetor.vetorLength();
        //Assert
        assertEquals(0, expected);
    }

    //b) Construtor público que permita inicializar o vetor encapsulado com alguns valores.
    //constructor so we need to indirectly test it
    @Test
    void constructorWithArrayShouldCreateArrayNotEmpty() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfVetorEmpty();
        //Assert
        assertFalse(expected);
    }

    @Test
    void shouldReturnAverageOfElements() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageOfElements();
        //Assert
        assertEquals(3, expected);
    }

    @Test
    void shouldReturnBiggestElement() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnBiggestElementInVetor();
        //Assert
        assertEquals(5, expected);
    }

    @Test
    void shouldReturnSmallestElement() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnSmallestElementInVetor();
        //Assert
        assertEquals(1, expected);
    }

    @Test
    void shouldReturnArrayWithLength() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.vetorLength();
        //Assert
        assertEquals(5, expected);
    }

    //c) Adicione um novo elemento (valor) ao vetor encapsulado.
    //void function so we need to indirectly test it
    @Test
    void shouldReturnArrayLengthPlusOne() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        vetor.addValueToVetor(6);
        int expected = vetor.vetorLength();
        //Assert
        assertEquals(6, expected);
    }

    @Test
    void shouldReturnAverageTakingIntoAccountNewElement() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        vetor.addValueToVetor(6);
        double expected = vetor.returnAverageOfElements();
        //Assert
        assertEquals(3.5, expected);
    }

    @Test
    void shouldReturnBiggestElementTakingIntoAccountNewElement() {
        //Arrange
        int[] array = {1, 2, 3, 4, -7};
        Vetor vetor = new Vetor(array);
        //Act
        vetor.addValueToVetor(6);
        int expected = vetor.returnBiggestElementInVetor();
        //Assert
        assertEquals(6, expected);
    }

    @Test
    void shouldReturnSmallestElementTakingIntoAccountNewElement() {
        //Arrange
        int[] array = {1, 2, 3};
        Vetor vetor = new Vetor(array);
        //Act
        vetor.addValueToVetor(0);
        int expected = vetor.returnSmallestElementInVetor();
        //Assert
        assertEquals(0, expected);
    }

    //d) Retire o primeiro elemento do vetor encapsulado com um determinado valor.
    //void function so we need to indirectly test it
    @Test
    void shouldReturnArrayLengthMinusOne() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        vetor.removeFirstOcurrenceOfValue(3);
        //Act
        int expected = vetor.vetorLength();
        //Assert
        assertEquals(4, expected);
    }

    @Test
    void shouldReturnAverageTakingIntoAccountRemovedElement() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        vetor.removeFirstOcurrenceOfValue(3);
        //Act
        double expected = vetor.returnAverageOfElements();
        //Assert
        assertEquals(3, expected);
    }

    @Test
    void shouldReturnBiggestElementTakingIntoAccountRemovedElement() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        vetor.removeFirstOcurrenceOfValue(5);
        //Act
        int expected = vetor.returnBiggestElementInVetor();
        //Assert
        assertEquals(4, expected);
    }

    @Test
    void shouldReturnSmallestElementTakingIntoAccountRemovedElement() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        vetor.removeFirstOcurrenceOfValue(1);
        //Act
        int expected = vetor.returnSmallestElementInVetor();
        //Assert
        assertEquals(2, expected);
    }

    //e) Retorne o valor de um determinado elemento indicado pela sua posição.
    @Test
    void shouldReturnElementAtGivenPosition() {
        //Arrange
        int[] array = {1, 2, 3, 0, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnValueAtPosition(3);
        //Assert
        assertEquals(0, expected);
    }

    @Test
    void shouldReturnElementAtZeroPosition() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnValueAtPosition(0);
        //Assert
        assertEquals(1, expected);
    }

    @Test
    void shouldReturnElementAtLastPosition() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnValueAtPosition(4);
        //Assert
        assertEquals(5, expected);
    }

    @Test
    void shouldThrowExceptionIfIndexIsOutOfBounds() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Assert
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> vetor.returnValueAtPosition(5));
    }

    //f) Retorne o número de elementos no vetor.
    @Test
    void shouldReturnArrayLength() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.vetorLength();
        //Assert
        assertEquals(5, expected);
    }

    @Test
    void shouldReturnArrayLengthZeroIfEmpty() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        int expected = vetor.vetorLength();
        //Assert
        assertEquals(0, expected);
    }

    @Test
    void shouldReturnArrayLengthZeroIfFilledWithZeros() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.vetorLength();
        //Assert
        assertEquals(5, expected);
    }

    //g) Retorne o maior elemento do vetor.
    @Test
    void shouldReturnBiggestElementInArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnBiggestElementInVetor();
        //Assert
        assertEquals(5, expected);
    }

    @Test
    void shouldReturnBiggestElementInArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {0, -2, -3, -4, -5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnBiggestElementInVetor();
        //Assert
        assertEquals(0, expected);
    }

    @Test
    void shouldReturnBiggestElementInArrayWithRepeatedNumbers() {
        //Arrange
        int[] array = {0, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnBiggestElementInVetor();
        //Assert
        assertEquals(5, expected);
    }

    @Test
    void shouldThrowExceptionIfArrayIsEmpty() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act and Assert
        assertThrows(ArrayIndexOutOfBoundsException.class, vetor::returnBiggestElementInVetor);
        //Assert text thrown
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            vetor.returnBiggestElementInVetor();
        }, "The given array is empty");
    }

    //h) Retorne o menor elemento do vetor.
    @Test
    void shouldReturnSmallestElementInArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnSmallestElementInVetor();
        //Assert
        assertEquals(1, expected);
    }

    @Test
    void shouldReturnSmallestElementInArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {0, -2, -3, -4, -5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnSmallestElementInVetor();
        //Assert
        assertEquals(-5, expected);
    }

    @Test
    void shouldReturnSmallestElementInArrayWithRepeatedNumbers() {
        //Arrange
        int[] array = {0, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int expected = vetor.returnSmallestElementInVetor();
        //Assert
        assertEquals(0, expected);
    }

    @Test
    void shouldThrowExceptionIfArrayIsEmpty2() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act and Assert
        assertThrows(ArrayIndexOutOfBoundsException.class, vetor::returnSmallestElementInVetor);
        //Assert text thrown
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            vetor.returnSmallestElementInVetor();
        }, "The given array is empty");
    }

    //i) Retorne a média de todos os elementos.
    @Test
    void shouldReturnAverageOfElementsInArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageOfElements();
        //Assert
        assertEquals(3, expected);
    }

    @Test
    void shouldReturnAverageOfElementsInArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {0, -2, -3, -4, -5};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageOfElements();
        //Assert
        assertEquals(-2.8, expected);
    }

    @Test
    void shouldReturnNaNIfArrayIsEmpty() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        double expected = vetor.returnAverageOfElements();
        //Assert
        assertEquals(Double.NaN, expected);
    }

    //j) Retorne a média de todos os números pares.
    @Test
    void shouldReturnAverageOfEvenElementsInArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 6};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageEvenElements();
        //Assert
        assertEquals(4, expected);
    }

    @Test
    void shouldReturnAverageOfEvenElementsInArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {0, -2, -3, -4, -5, -6};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageEvenElements();
        //Assert
        assertEquals(-3, expected);
    }

    @Test
    void shouldReturnNaNIfOnlyOddNumbersAndImpossibleToAverage() {
        //Arrange
        int[] array = {-3, -3, -7, -5, 9};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageEvenElements();
        //Assert
        assertEquals(Double.NaN, expected);
    }

    @Test
    void shouldReturnNaNIfArrayIsEmpty2() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        double expected = vetor.returnAverageEvenElements();
        //Assert
        assertEquals(Double.NaN, expected);
    }

    //k) Retorne a média de todos os números ímpares.
    @Test
    void shouldReturnAverageOfOddElementsInArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 6};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageOddElements();
        //Assert
        assertEquals(3, expected);
    }

    @Test
    void shouldReturnAverageOfOddElementsInArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {0, -2, -3, -4, -5, -6};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageOddElements();
        //Assert
        assertEquals(-4, expected);
    }

    @Test
    void shouldReturnNaNIfOnlyEvenNumbersAndImpossibleToAverage() {
        //Arrange
        int[] array = {-2, -2, -6, -4, 8};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageOddElements();
        //Assert
        assertEquals(Double.NaN, expected);
    }

    @Test
    void shouldReturnNaNIfArrayIsEmpty3() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        double expected = vetor.returnAverageOddElements();
        //Assert
        assertEquals(Double.NaN, expected);
    }

    //l) Retorne a média de todos os múltiplos de um dado número.
    @Test
    void shouldReturnAverageOfElementsMultipleOfGivenNumberInArray() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 6};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageOfMultipleOfGivenNumber(2);
        //Assert
        assertEquals(4, expected);
    }

    @Test
    void shouldReturnAverageOfElementsMultipleOfGivenNumberInArrayWithNegativeNumbers() {
        //Arrange
        int[] array = {0, -2, -3, -4, -5, -6};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageOfMultipleOfGivenNumber(2);
        //Assert
        assertEquals(-3, expected);
    }

    @Test
    void shouldReturnNaNIfOnlyOddNumbersAndImpossibleToAverage2() {
        //Arrange
        int[] array = {-3, -3, -7, -5, 9};
        Vetor vetor = new Vetor(array);
        //Act
        double expected = vetor.returnAverageOfMultipleOfGivenNumber(2);
        //Assert
        assertEquals(Double.NaN, expected);
    }

    @Test
    void shouldReturnNaNIfArrayIsEmpty4() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        double expected = vetor.returnAverageOfMultipleOfGivenNumber(2);
        //Assert
        assertEquals(Double.NaN, expected);
    }

    //m) Ordene os valores do vetor por ordem ascendente e/ou descendente.
    @Test
    void shouldReturnSmallestElementInArrayAfterSorting() {
        //Arrange
        int[] array = {5, 4, 3, 2, 1};
        Vetor vetor = new Vetor(array);
        //Act
        vetor.sortVetorAscending();
        int expected = vetor.returnValueAtPosition(0);
        //Assert
        assertEquals(1, expected);
    }

    @Test
    void shouldReturnBiggestElementInArrayAfterSorting() {
        //Arrange
        int[] array = {5, 4, 3, 2, 1};
        Vetor vetor = new Vetor(array);
        //Act
        vetor.sortVetorAscending();
        int expected = vetor.returnValueAtPosition(4);
        //Assert
        assertEquals(5, expected);
    }

    //Test using value at midle position
    @Test
    void shouldReturnMiddleElementInArrayAfterSorting() {
        //Arrange
        int[] array = {5, 4, 3, 2, 1};
        Vetor vetor = new Vetor(array);
        //Act
        vetor.sortVetorAscending();
        int expected = vetor.returnValueAtPosition(2);
        //Assert
        assertEquals(3, expected);
    }

    //n) Retorne True caso o vetor esteja vazio e False em caso contrário.
    @Test
    void shouldReturnTrueIfArrayIsEmpty() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        boolean expected = vetor.trueIfVetorEmpty();
        //Assert
        assertTrue(expected);
    }

    @Test
    void shouldReturnFalseIfArrayIsNotEmpty() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfVetorEmpty();
        //Assert
        assertFalse(expected);
    }

    @Test
    void shouldReturnFalseIfArrayIsNotEmpty2() {
        //Arrange
        int[] array = {0};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfVetorEmpty();
        //Assert
        assertFalse(expected);
    }

    //o) Retorne True caso o vetor contenha apenas um elemento e False em caso contrário.
    @Test
    void shouldReturnTrueIfArrayHasOnlyOneElement() {
        //Arrange
        int[] array = {0};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfVetorOnlyOneElement();
        //Assert
        assertTrue(expected);
    }

    @Test
    void shouldReturnFalseIfArrayHasMoreThanOneElement() {
        //Arrange
        int[] array = {0, 1};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfVetorOnlyOneElement();
        //Assert
        assertFalse(expected);
    }

    @Test
    void shouldReturnFalseIfArrayIsEmpty3() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        boolean expected = vetor.trueIfVetorOnlyOneElement();
        //Assert
        assertFalse(expected);
    }

    //p) Retorne True se o vetor tiver apenas elementos pares e False em caso contrário.
    @Test
    void shouldReturnTrueIfArrayHasOnlyEvenElements() {
        //Arrange
        int[] array = {0, 2, 4, 6, 8};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfOnlyEven();
        //Assert
        assertTrue(expected);
    }

    @Test
    void shouldReturnFalseIfArrayHasOneOddElements() {
        //Arrange
        int[] array = {2, 4, 5, 6, 8};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfOnlyEven();
        //Assert
        assertFalse(expected);
    }

    //Defaults to true if array is empty
    @Test
    void shouldReturnFalseIfArrayIsEmpty4() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        boolean expected = vetor.trueIfOnlyEven();
        //Assert
        assertTrue(expected);
    }

    //q) Retorne True se o vetor tiver apenas elementos ímpares e False em caso contrário.
    @Test
    void shouldReturnTrueIfArrayHasOnlyOddElements() {
        //Arrange
        int[] array = {1, 3, 5, 7, 9};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfOnlyOdd();
        //Assert
        assertTrue(expected);
    }

    @Test
    void shouldReturnFalseIfArrayHasOneEvenElements() {
        //Arrange
        int[] array = {1, 3, 5, 6, 9};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfOnlyOdd();
        //Assert
        assertFalse(expected);
    }

    //Defaults to true if array is empty
    @Test
    void shouldReturnFalseIfArrayIsEmpty5() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        boolean expected = vetor.trueIfOnlyOdd();
        //Assert
        assertTrue(expected);
    }

    //r) Retorne True se o vetor tiver elementos duplicados e False em caso contrário.
    @Test
    void shouldReturnTrueIfArrayHasDuplicatedElements() {
        //Arrange
        int[] array = {1, 3, 5, 6, 9, 9};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfRepeatedElementsInVetor();
        //Assert
        assertTrue(expected);
    }

    @Test
    void shouldReturnFalseIfArrayHasNoDuplicatedElements() {
        //Arrange
        int[] array = {1, 3, 5, 6, 9};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfRepeatedElementsInVetor();
        //Assert
        assertFalse(expected);
    }

    @Test
    void shouldReturnTrueIfArrayHasDuplicatedElements2() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfRepeatedElementsInVetor();
        //Assert
        assertTrue(expected);
    }

    //Defaults to false if array is empty
    @Test
    void shouldReturnFalseIfArrayIsEmpty6() {
        //Arrange
        Vetor vetor = new Vetor();
        //Act
        boolean expected = vetor.trueIfRepeatedElementsInVetor();
        //Assert
        assertFalse(expected);
    }

    //s) Retorne os elementos do vetor cujo número de algarismos é superior ao número médio de
    //algarismos de todos os elementos do vetor.
    @Test
    void shouldReturnElementsWithMoreDigitsThanAverage() {
        //Arrange
        int[] array = {1, 10, 100, 1000, 10000};
        Vetor vetor = new Vetor(array);
        int[] expected = {1000, 10000};
        //Act
        int[] result = vetor.elementsWithNumberDigitsMoreThanAverage();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnElementsWithMoreDigitsThanAverageNegativeNumbers() {
        //Arrange
        int[] array = {-1, -10, -100, 1000, -10000};
        Vetor vetor = new Vetor(array);
        int[] expected = {1000, -10000};
        //Act
        int[] result = vetor.elementsWithNumberDigitsMoreThanAverage();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfAllElementsHaveSameNumberOfDigits() {
        //Arrange
        int[] array = {1, 1, 1, 1, 1};
        Vetor vetor = new Vetor(array);
        int[] expected = {};
        //Act
        int[] result = vetor.elementsWithNumberDigitsMoreThanAverage();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfArrayIsEmpty7() {
        //Arrange
        Vetor vetor = new Vetor();
        int[] expected = {};
        //Act
        int[] result = vetor.elementsWithNumberDigitsMoreThanAverage();
        //Assert
        assertArrayEquals(expected, result);
    }

    //t) Retorne os elementos do vetor cuja percentagem de algarismos pares é superior à média da
    //percentagem de algarismos pares de todos os elementos do vetor.
    @Test
    void shouldReturnElementsWithMoreEvenDigitsThanAverage() {
        //Arrange
        int[] array = {1, 10, 100, 1000, 10000};
        Vetor vetor = new Vetor(array);
        int[] expected = {100, 1000, 10000};
        //Act
        int[] result = vetor.elementsWithNumberEvenDigitsMoreThanAverage();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnElementsWithMoreEvenDigitsThanAverageNegativeNumbers() {
        //Arrange
        int[] array = {-1, -10, -100, 1000, -10000};
        Vetor vetor = new Vetor(array);
        int[] expected = {-100, 1000, -10000};
        //Act
        int[] result = vetor.elementsWithNumberEvenDigitsMoreThanAverage();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfAllElementsHaveSameNumberOfEvenDigits() {
        //Arrange
        int[] array = {2, 2, 2, 2, 2};
        Vetor vetor = new Vetor(array);
        int[] expected = {};
        //Act
        int[] result = vetor.elementsWithNumberEvenDigitsMoreThanAverage();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfArrayIsEmpty8() {
        //Arrange
        Vetor vetor = new Vetor();
        int[] expected = {};
        //Act
        int[] result = vetor.elementsWithNumberEvenDigitsMoreThanAverage();
        //Assert
        assertArrayEquals(expected, result);
    }

    //u) Retorne os elementos do vetor compostos exclusivamente por algarismos pares.
    @Test
    void shouldReturnElementsWithOnlyEvenDigits() {
        //Arrange
        int[] array = {2, 4, 6, 8, 10, 445};
        Vetor vetor = new Vetor(array);
        int[] expected = {2, 4, 6, 8};
        //Act
        int[] result = vetor.elementsWithOnlyEvenDigits();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnElementsWithOnlyEvenDigitsNegativeNumbers() {
        //Arrange
        int[] array = {-2, -4, -6, -8, -10};
        Vetor vetor = new Vetor(array);
        int[] expected = {-2, -4, -6, -8};
        //Act
        int[] result = vetor.elementsWithOnlyEvenDigits();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfNoElementsHaveOnlyEvenDigits() {
        //Arrange
        int[] array = {11, 30, 52, 75, 90};
        Vetor vetor = new Vetor(array);
        int[] expected = {};
        //Act
        int[] result = vetor.elementsWithOnlyEvenDigits();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfArrayIsEmpty9() {
        //Arrange
        Vetor vetor = new Vetor();
        int[] expected = {};
        //Act
        int[] result = vetor.elementsWithOnlyEvenDigits();
        //Assert
        assertArrayEquals(expected, result);
    }

    //v) Retorne os elementos que são sequências crescentes (e.g. 347) do vetor.
    @Test
    void shouldReturnElementsThatAreIncreasingSequences() {
        //Arrange
        int[] array = {123, 234, 345, 456, 5672};
        Vetor vetor = new Vetor(array);
        int[] expected = {123, 234, 345, 456};
        //Act
        int[] result = vetor.elementsWithGrowingSequence();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnElementsThatAreIncreasingSequencesNegativeNumbers() {
        //Arrange
        int[] array = {-123, -234, -345, -456, -567};
        Vetor vetor = new Vetor(array);
        int[] expected = {-123, -234, -345, -456, -567};
        //Act
        int[] result = vetor.elementsWithGrowingSequence();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfNoElementsAreIncreasingSequences() {
        //Arrange
        int[] array = {121, 231, 342, 414, 561};
        Vetor vetor = new Vetor(array);
        int[] expected = {};
        //Act
        int[] result = vetor.elementsWithGrowingSequence();
        //Assert
        assertArrayEquals(expected, result);
    }

    //w) Retorne as capicuas existentes no vetor.
    @Test
    void shouldReturnElementsThatAreCapicuas() {
        //Arrange
        int[] array = {121, 232, 343, 414, 566};
        Vetor vetor = new Vetor(array);
        int[] expected = {121, 232, 343, 414};
        //Act
        int[] result = vetor.elementsCapicua();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnElementsThatAreCapicuasNegativeNumbers() {
        //Arrange
        int[] array = {-121, -232, -343, -414, -565};
        Vetor vetor = new Vetor(array);
        int[] expected = {-121, -232, -343, -414, -565};
        //Act
        int[] result = vetor.elementsCapicua();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfNoElementsAreCapicuas() {
        //Arrange
        int[] array = {122, 231, 342, 415, 561};
        Vetor vetor = new Vetor(array);
        int[] expected = {};
        //Act
        int[] result = vetor.elementsCapicua();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnElementsThatAreCapicuas2() {
        //Arrange
        int[] array = {0, 0, 0, 0, 0};
        Vetor vetor = new Vetor(array);
        int[] expected = {0, 0, 0, 0, 0};
        //Act
        int[] result = vetor.elementsCapicua();
        //Assert
        assertArrayEquals(expected, result);
    }

    //x) Retorne os números existentes no vetor compostos exclusivamente por um mesmo algarismo
    //e.g. 111, 222, 333, 444, 555, 666, 777, 888, 999.
    @Test
    void shouldReturnElementsThatAreComposedOfSameDigit() {
        //Arrange
        int[] array = {111, 222, 333, 444, 555, 666, 777, 888, 9988};
        Vetor vetor = new Vetor(array);
        int[] expected = {111, 222, 333, 444, 555, 666, 777, 888};
        //Act
        int[] result = vetor.elementsComposedOfSameDigit();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnElementsThatAreComposedOfSameDigitNegativeNumbers() {
        //Arrange
        int[] array = {-111, -222, -333, -444, -555, -666, -777, -888, -9988};
        Vetor vetor = new Vetor(array);
        int[] expected = {-111, -222, -333, -444, -555, -666, -777, -888};
        //Act
        int[] result = vetor.elementsComposedOfSameDigit();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfNoElementsAreComposedOfSameDigit() {
        //Arrange
        int[] array = {122, 231, 342, 415, 561};
        Vetor vetor = new Vetor(array);
        int[] expected = {};
        //Act
        int[] result = vetor.elementsComposedOfSameDigit();
        //Assert
        assertArrayEquals(expected, result);
    }

    //y) Retorne os números existentes no vetor que não são de Amstrong.
    @Test
    void shouldReturnElementsThatAreNotAmstrong() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 153, 154};
        Vetor vetor = new Vetor(array);
        int[] expected = {2, 3, 4, 5, 6, 7, 8, 154};
        //Act
        int[] result = vetor.elementsNotAmstrong();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
        //Assuming that negative numbers are not Amstrong
    void shouldReturnElementsThatAreNotAmstrongNegativeNumbers() {
        //Arrange
        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8, -153, -154};
        Vetor vetor = new Vetor(array);
        int[] expected = {-1, -2, -3, -4, -5, -6, -7, -8, -153, -154};
        //Act
        int[] result = vetor.elementsNotAmstrong();
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfNoElementsAreNotAmstrong() {
        //Arrange
        int[] array = {1, 153};
        Vetor vetor = new Vetor(array);
        int[] expected = {};
        //Act
        int[] result = vetor.elementsNotAmstrong();
        //Assert
        assertArrayEquals(expected, result);
    }

    //z) Retorne os elementos que contêm uma sequência crescente de pelo menos n algarismos (e.g., n=3,
    @Test
    void shouldReturnElementsThatContainGrowingSequenceOfAtLeastNNumbers() {
        //Arrange
        int[] array = {9123, 234, 345, 456, 5672};
        Vetor vetor = new Vetor(array);
        int[] expected = {9123, 234, 345, 456, 5672};
        //Act
        int[] result = vetor.elementsGrowingSequenceOfAtLeastNNumbers(3);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnElementsThatContainGrowingSequenceOfAtLeastNNumbersNegativeNumbers() {
        //Arrange
        int[] array = {-9123, -234, -345, -456, -5672};
        Vetor vetor = new Vetor(array);
        int[] expected = {-9123, -234, -345, -456, -5672};
        //Act
        int[] result = vetor.elementsGrowingSequenceOfAtLeastNNumbers(3);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfNoElementsContainGrowingSequenceOfAtLeastNNumbers() {
        //Arrange
        int[] array = {121, 231, 342, 414, 561};
        Vetor vetor = new Vetor(array);
        int[] expected = {};
        //Act
        int[] result = vetor.elementsGrowingSequenceOfAtLeastNNumbers(3);
        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyArrayIfArrayIsEmpty10() {
        //Arrange
        Vetor vetor = new Vetor();
        int[] expected = {};
        //Act
        int[] result = vetor.elementsGrowingSequenceOfAtLeastNNumbers(3);
        //Assert
        assertArrayEquals(expected, result);
    }

    //aa) Retorne True ou False, consoante o vetor é igual a um vetor passado por parâmetro.
    @Test
    void shouldReturnTrueIfVetorIsEqualToGivenVetor() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfVetorIsEqualToGivenVetor(array2);
        //Assert
        assertTrue(expected);
    }

    @Test
    void shouldReturnFalseIfVetorIsNotEqualToGivenVetor() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 6};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfVetorIsEqualToGivenVetor(array2);
        //Assert
        assertFalse(expected);
    }

    @Test
    void shouldReturnTrueIfBothEmptu() {
        //Arrange
        int[] array = {};
        int[] array2 = {};
        Vetor vetor = new Vetor(array);
        //Act
        boolean expected = vetor.trueIfVetorIsEqualToGivenVetor(array2);
        //Assert
        assertTrue(expected);
    }

    //bb) add function to get copy of vetor so we can use int the Matrix class
    @Test
    void shouldReturnCopyOfVetor() {
        //Arrange
        int[] array = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(array);
        //Act
        int[] expected = vetor.getVetor();
        //Assert
        assertArrayEquals(array, expected);
    }
    @Test
    void shouldReturnCopyOfEmptyVetor() {
        //Arrange
        int[] array = {};
        Vetor vetor = new Vetor(array);
        //Act
        int[] expected = vetor.getVetor();
        //Assert
        assertArrayEquals(array, expected);
    }
    @Test
    void shouldReturnCopyOfVetorContainingZero() {
        //Arrange
        int[] array = {0};
        Vetor vetor = new Vetor(array);
        //Act
        int[] expected = vetor.getVetor();
        //Assert
        assertArrayEquals(array, expected);
    }
}

