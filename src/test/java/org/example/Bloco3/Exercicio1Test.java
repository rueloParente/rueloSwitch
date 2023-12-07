package org.example.Bloco3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio1Test {
    @Test
    public void Factorial_WithZero() {
        // Arrange
        int num = 0;
        long expected = 1;
        // Act
        long result = Exercicio1.factorial(num);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void Factorial_WithPositiveNumber() {
        // Arrange
        int num = 5;
        long expected = 120;
        // Act
        long result = Exercicio1.factorial(num);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void Factorial_WithNegativeNumber() {
        // Arrange
        int num = -5;
        long expected = 1;
        // Act
        long result = Exercicio1.factorial(num);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void Factorial_WithOne() {
        // Arrange
        int num = 1;
        long expected = 1;
        // Act
        long result = Exercicio1.factorial(num);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void Factorial_WithLargeNumber() {
        // Arrange
        int num = 10;
        long expected = 3628800;
        // Act
        long result = Exercicio1.factorial(num);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void Factorial_AboveMaxInteger() {
        // Arrange
        int num = 20;
        long expected = -1;
        // Act
        long result = Exercicio1.factorial(num);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void Factorial_WithMaxInteger() {
        // Arrange
        int num = 20;
        long expected = -1;
        // Act
        long result = Exercicio1.factorial(num);

        // Assert
        assertEquals(expected, result);
    }

}