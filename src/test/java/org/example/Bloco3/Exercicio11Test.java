package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio11Test {
    //teste with -1
    @Test
    void testWithMinus1() {
        //Arrange
        int note = -1;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('X', result);
    }
    //teste with 0
    @Test
    void testWith0() {
        //Arrange
        int note = 0;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('E', result);
    }
    //teste with 4
    @Test
    void testWith4() {
        //Arrange
        int note = 4;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('E', result);
    }
    //teste with 5
    @Test
    void testWith5() {
        //Arrange
        int note = 5;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('D', result);
    }
    //teste with 9
    @Test
    void testWith9() {
        //Arrange
        int note = 9;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('D', result);
    }
    //teste with 10
    @Test
    void testWith10() {
        //Arrange
        int note = 10;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('C', result);
    }
    //teste with 13
    @Test
    void testWith13() {
        //Arrange
        int note = 13;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('C', result);
    }
    //teste with 14
    @Test
    void testWith14() {
        //Arrange
        int note = 14;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('B', result);
    }
    //teste with 17
    @Test
    void testWith17() {
        //Arrange
        int note = 17;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('B', result);
    }
    //teste with 18
    @Test
    void testWith18() {
        //Arrange
        int note = 18;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('A', result);
    }
    //teste with 20
    @Test
    void testWith20() {
        //Arrange
        int note = 20;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('A', result);
    }
    //teste with 21
    @Test
    void testWith21() {
        //Arrange
        int note = 21;
        //Act
        char result = Exercicio11.returnsGradeCharTakingNote (note);
        //Assert
        assertEquals('X', result);
    }
}