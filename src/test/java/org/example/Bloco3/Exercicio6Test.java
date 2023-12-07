package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio6Test {
    //Test with positive base salary and positive extra hours
    @Test
    public void testReturnsSalaryWithExtraHoursWithPositiveBaseSalaryAndPositiveExtraHours(){
        //arrange
        int baseSalary = 1000;
        int extraHours = 10;
        int expected = 1200;
        //act
        int result = Exercicio6.returnsSalaryWithExtraHours(baseSalary, extraHours);
        //assert
        assertEquals(result, expected);
    }
    //Test with negative base salary and positive extra hours
    @Test
    public void testReturnsSalaryWithExtraHoursWithNegativeBaseSalaryAndPositiveExtraHours(){
        //arrange
        int baseSalary = -1000;
        int extraHours = 10;
        int expected = -1;
        //act
        int result = Exercicio6.returnsSalaryWithExtraHours(baseSalary, extraHours);
        //assert
        assertEquals(result, expected);
    }
    //Test with positive base salary and negative extra hours
    @Test
    public void testReturnsSalaryWithExtraHoursWithPositiveBaseSalaryAndNegativeExtraHours(){
        //arrange
        int baseSalary = 1000;
        int extraHours = -10;
        int expected = -1;
        //act
        int result = Exercicio6.returnsSalaryWithExtraHours(baseSalary, extraHours);
        //assert
        assertEquals(result, expected);
    }
    //Test with positive base salary and zero extra hours
    @Test
    public void testReturnsSalaryWithExtraHoursWithPositiveBaseSalaryAndZeroExtraHours(){
        //arrange
        int baseSalary = 1000;
        int extraHours = 0;
        int expected = 1000;
        //act
        int result = Exercicio6.returnsSalaryWithExtraHours(baseSalary, extraHours);
        //assert
        assertEquals(result, expected);
    }
    //Test with zero base salary and positive extra hours
    @Test
    public void testReturnsSalaryWithExtraHoursWithZeroBaseSalaryAndPositiveExtraHours(){
        //arrange
        int baseSalary = 0;
        int extraHours = 10;
        int expected = -1;
        //act
        int result = Exercicio6.returnsSalaryWithExtraHours(baseSalary, extraHours);
        //assert
        assertEquals(result, expected);
    }
}