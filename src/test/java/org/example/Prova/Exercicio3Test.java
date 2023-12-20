package org.example.Prova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio3Test {
    @Test
    void testReturnMinimalDistanceBetweenTwoCitiesWhenCity1IsNotPresent() {
        //Arrange
        String city1 = "Porto";
        String city2 = "Lisboa";
        String[] cityArray = {"Lisboa", "Coimbra", "Braga"};
        int[][] arrayDistance = {{0, 200, 0},
                                    {200, 0, 0},
                                        {0, 0, 0}};
        int expected = -1;
        //Act
        int result = Exercicio3.returnMinimalDistanceBetweenTwoCities(city1, city2, cityArray, arrayDistance);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void testReturnMinimalDistanceBetweenTwoCitiesWhenCity2IsNotPresent() {
        //Arrange
        String city1 = "Lisboa";
        String city2 = "Porto";
        String[] cityArray = {"Lisboa", "Coimbra", "Braga"};
        int[][] arrayDistance = {{0, 200, 0},
                                    {200, 0, 0},
                                        {0, 0, 0}};
        int expected = -1;
        //Act
        int result = Exercicio3.returnMinimalDistanceBetweenTwoCities(city1, city2, cityArray, arrayDistance);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void testReturnMinimalDistanceBetweenTwoCitiesWhenCity1AndCity2ArePresentAndDistanceIsZero() {
        //Arrange
        String city1 = "Porto";
        String city2 = "Lisboa";
        String[] cityArray = {"Porto", "Coimbra", "Braga", "Lisboa", "Faro", "Aveiro"};
        int[][] arrayDistance = {
                // Porto, Coimbra, Braga, Lisboa, Faro, Aveiro
                    {0,    124,     55,    315,   550,   76},     // Porto
                    {124,   0,      179,   200,   431,   60},    // Coimbra
                    {55,   179,      0,    370,   605,   131},    // Braga
                    {315, 200,      370,    0,    279,   255},   // Lisboa
                    {550, 431,      605,   279,    0,   496},   // Faro
                    {76,  60,      131,    255,   496,   0}      // Aveiro
        };
        int expected = 315;
        //Act
        int result = Exercicio3.returnMinimalDistanceBetweenTwoCities(city1, city2, cityArray, arrayDistance);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    void testReturnMinimalDistanceBetweenTwoCitiesWhenCity1AndCity2ArePresentAndDistanceIsZero2() {
        //Arrange
        String city1 = "Porto";
        String city2 = "Lisboa";
        String[] cityArray = {"Porto", "Coimbra", "Braga", "Lisboa", "Faro", "Aveiro"};
        int[][] arrayDistance = {
                // Porto, Coimbra, Braga, Lisboa, Faro, Aveiro
                {0,    124,     55,    0,   550,   76},     // Porto
                {124,   0,      179,   200,   431,   60},    // Coimbra
                {55,   179,      0,    370,   605,   131},    // Braga
                {0, 200,      370,    0,    279,   255},   // Lisboa
                {550, 431,      605,   279,    0,   496},   // Faro
                {76,  60,      131,    255,   496,   0}      // Aveiro
        };
        int expected = 324;
        //Act
        int result = Exercicio3.returnMinimalDistanceBetweenTwoCities(city1, city2, cityArray, arrayDistance);
        //Assert
        assertEquals(expected, result);
    }
    @Test
    public void testGetLowestDistanceBetweenTwoCitiesGivenThreeFoldWay(){
        String city1 = "A";
        String city2 = "B";
        String[] cityArray = {"A", "B", "C", "D", "E", "F" };
        int[][] arrayDistance = {
                //A B   C   D  E   F
                {0, 0, 20, 30, 0, 0},   //A
                {0, 0, 0, 0, 20, 10},   //B
                {20, 0, 0, 0, 20, 20},  //C
                {30, 0, 0, 0, 0, 30},   //D
                {0, 20, 20, 0, 0, 40},  //E
                {0, 10, 20, 30, 0, 0}   //F
        };
        int expected = 50;
        //Act
        int result = Exercicio3.returnMinimalDistanceBetweenTwoCities(city1, city2, cityArray, arrayDistance);
        //Assert
        assertEquals(expected, result);
    }

}