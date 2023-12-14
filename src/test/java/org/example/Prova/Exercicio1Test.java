package org.example.Prova;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exercicio1Test {
    @Test
    void testCanTheCarCirculateWithPolutionBelow1() {
        //Arrange
        int carAge = 20;
        int emissions = 400;
        double polutionIndice = 0.5;
        boolean expected = true;
        //Act
        boolean result = Exercicio1.canTheCarCirculate(polutionIndice, carAge, emissions);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testCanTheCarCirculateWithPolutionBetween1And2ForYoungCar() {
        //Arrange
        int carAge = 10;
        int emissions = 250;
        double polutionIndice = 1.5;
        boolean expected = true;
        //Act
        boolean result = Exercicio1.canTheCarCirculate(polutionIndice, carAge, emissions);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testCanTheCarCirculateWithPolutionBetween1And2ForOldCar() {
        //Arrange
        int carAge = 16;
        int emissions = 250;
        double polutionIndice = 1.5;
        boolean expected = false;
        //Act
        boolean result = Exercicio1.canTheCarCirculate(polutionIndice, carAge, emissions);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testCanTheCarCirculateWithPolutionBetween2And3ForYoungCar() {
        //Arrange
        int carAge = 8;
        int emissions = 150;
        double polutionIndice = 2.5;
        boolean expected = true;
        //Act
        boolean result = Exercicio1.canTheCarCirculate(polutionIndice, carAge, emissions);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testCanTheCarCirculateWithPolutionBetween2And3ForOldCar() {
        //Arrange
        int carAge = 12;
        int emissions = 150;
        double polutionIndice = 2.5;
        boolean expected = false;
        //Act
        boolean result = Exercicio1.canTheCarCirculate(polutionIndice, carAge, emissions);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testCanTheCarCirculateWithPolutionAbove4() {
        //Arrange
        int carAge = 2;
        int emissions = 50;
        double polutionIndice = 4.5;
        boolean expected = false;
        //Act
        boolean result = Exercicio1.canTheCarCirculate(polutionIndice, carAge, emissions);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testCanTheCarCirculateWithEdgeCasePolutionExactly3() {
        //Arrange
        int carAge = 4;
        int emissions = 99;
        double polutionIndice = 3;
        boolean expected = true;
        //Act
        boolean result = Exercicio1.canTheCarCirculate(polutionIndice, carAge, emissions);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testCanTheCarCirculateWithEdgeCasePolutionExactly2() {
        //Arrange
        int carAge = 9;
        int emissions = 199;
        double polutionIndice = 2;
        boolean expected = true;
        //Act
        boolean result = Exercicio1.canTheCarCirculate(polutionIndice, carAge, emissions);
        //Assert
        assertEquals(expected, result);
    }

}