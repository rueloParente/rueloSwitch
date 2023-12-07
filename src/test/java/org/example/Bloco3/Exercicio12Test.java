package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio12Test {
    //teste with -1
    @Test
    void testWithMinus1() {
        //Arrange
        double grossSalary = -1;
        //Act
        double result = Exercicio12.returnsNetSalaryTakingGrossSalary (grossSalary);
        //Assert
        assertEquals(-1, result);
    }
    //teste with 0
    @Test
    void testWith0() {
        //Arrange
        double grossSalary = 0;
        //Act
        double result = Exercicio12.returnsNetSalaryTakingGrossSalary (grossSalary);
        //Assert
        assertEquals(-1, result);
    }
    //teste with 499
    @Test
    void testWith499() {
        //Arrange
        double grossSalary = 499.99;
        //Act
        double result = Exercicio12.returnsNetSalaryTakingGrossSalary (grossSalary);
        //Assert
        assertEquals(449.99, result, 0.01);
    }
    //teste with 500
    @Test
    void testWith500() {
        //Arrange
        double grossSalary = 500;
        //Act
        double result = Exercicio12.returnsNetSalaryTakingGrossSalary (grossSalary);
        //Assert
        assertEquals(450, result);
    }
    //teste with 501
    @Test
    void testWith501() {
        //Arrange
        double grossSalary = 500.01;
        //Act
        double result = Exercicio12.returnsNetSalaryTakingGrossSalary (grossSalary);
        //Assert
        assertEquals(450.008, result, 0.001);
    }
    //teste with 999
    @Test
    void testWith999() {
        //Arrange
        double grossSalary = 999.99;
        //Act
        double result = Exercicio12.returnsNetSalaryTakingGrossSalary (grossSalary);
        //Assert
        assertEquals(874.99, result, 0.01);
    }
    //teste with 1000
    @Test
    void testWith1000() {
        //Arrange
        double grossSalary = 1000;
        //Act
        double result = Exercicio12.returnsNetSalaryTakingGrossSalary (grossSalary);
        //Assert
        assertEquals(875, result);
    }
    //teste with 1001
    @Test
    void testWith1001() {
        //Arrange
        double grossSalary = 1000.01;
        //Act
        double result = Exercicio12.returnsNetSalaryTakingGrossSalary (grossSalary);
        //Assert
        assertEquals(875.008, result, 0.001);
    }
    //teste with 2000
    @Test
    void testWith2000() {
        //Arrange
        double grossSalary = 2000;
        //Act
        double result = Exercicio12.returnsNetSalaryTakingGrossSalary (grossSalary);
        //Assert
        assertEquals(1675, result);
    }
////////////////////////////////////////////////////////////////
    //teste bracket with -1
    @Test
    void testBracketWithMinus1() {
        //Arrange
        double grossSalary = -1;
        //Act
        int result = Exercicio12.returnsBracketForSalary (grossSalary);
        //Assert
        assertEquals(-1, result);
    }
    //teste bracket with 0
    @Test
    void testBracketWith0() {
        //Arrange
        double grossSalary = 0;
        //Act
        int result = Exercicio12.returnsBracketForSalary (grossSalary);
        //Assert
        assertEquals(-1, result);
    }
    //teste bracket with 499
    @Test
    void testBracketWith499() {
        //Arrange
        double grossSalary = 499.99;
        //Act
        int result = Exercicio12.returnsBracketForSalary (grossSalary);
        //Assert
        assertEquals(1, result);
    }
    //teste bracket with 500
    @Test
    void testBracketWith500() {
        //Arrange
        double grossSalary = 500;
        //Act
        int result = Exercicio12.returnsBracketForSalary (grossSalary);
        //Assert
        assertEquals(1, result);
    }
    //teste bracket with 501
    @Test
    void testBracketWith501() {
        //Arrange
        double grossSalary = 500.01;
        //Act
        int result = Exercicio12.returnsBracketForSalary (grossSalary);
        //Assert
        assertEquals(2, result);
    }
    //teste bracket with 999
    @Test
    void testBracketWith999() {
        //Arrange
        double grossSalary = 999.99;
        //Act
        int result = Exercicio12.returnsBracketForSalary (grossSalary);
        //Assert
        assertEquals(2, result);
    }
    //teste bracket with 1000
    @Test
    void testBracketWith1000() {
        //Arrange
        double grossSalary = 1000;
        //Act
        int result = Exercicio12.returnsBracketForSalary (grossSalary);
        //Assert
        assertEquals(2, result);
    }
    //teste bracket with 1001
    @Test
    void testBracketWith1001() {
        //Arrange
        double grossSalary = 1000.01;
        //Act
        int result = Exercicio12.returnsBracketForSalary (grossSalary);
        //Assert
        assertEquals(3, result);
    }

}