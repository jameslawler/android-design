package com.jameslawler.design;

import com.jameslawler.design.FizzBuzz;

import junit.framework.TestCase;

/**
 * Created by james on 06/09/2015.
 */
public class FizzBuzzTest extends TestCase {

    public void testWhenCalledWithOneShouldOutputOne() {
        // Arrange
        Integer number = 1;

        // Act
        String result = FizzBuzz.GetOutput(number);

        // Assert
        assertEquals("1", result);
    }

    public void testWhenCalledWithThreeShouldOutputFizz() {
        // Arrange
        int number = 3;

        // Act
        String result = FizzBuzz.GetOutput(number);

        // Assert
        assertEquals("Fizz", result);
    }

    public void testWhenCalledWithFiveShouldOutputBuzz() {
        // Arrange
        int number = 5;

        // Act
        String result = FizzBuzz.GetOutput(number);

        // Assert
        assertEquals("Buzz", result);
    }

    public void testWhenCalledWithFifteenShouldOutputFizzBuzz() {
        // Arrange
        int number = 15;

        // Act
        String result = FizzBuzz.GetOutput(number);

        // Assert
        assertEquals("FizzBuzz", result);
    }
}