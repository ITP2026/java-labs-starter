package edu.course.lab01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {


    // Тесты для IsEven

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);
        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber(){
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);

    }
    // Тесты для IsPrime
     @Test

    void returnsTrueForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(7);
        assertTrue(result);
    }

    @Test
    void returnsFalseForCompositeNumber() {
        boolean result = CourseToolkit.isPrime(6);
        assertFalse(result);
    }

    @Test
    void returnsFalseForSquareOfPrime() {
        boolean result = CourseToolkit.isPrime(9);
        assertFalse(result);
    }

    @Test
    void returnsFalseForNumberLessThanTwo() {
        boolean result = CourseToolkit.isPrime(1);
        assertFalse(result);
    }

    //Тесты для IsPalindrom
     @Test
    void returnsTrueForPalindromeString() {
        boolean result = CourseToolkit.isPalindrome("ab ba");
        assertTrue(result);
    }

    @Test
    void returnsFalseForNonPalindromeString() {
        boolean result = CourseToolkit.isPalindrome("abc");
        assertFalse(result);
    }

    @Test
    void returnsExceptionWhenNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.isPalindrome(null);
        });
        
    }

    // Тест для Average
   @Test
    void returnsCorrectAverageForPositiveNumbers() {
        double result = CourseToolkit.average(new int[]{2, 4, 6});
        assertTrue(Math.abs(4.0 - result) < 0.001);
    }

    @Test
    void returnsCorrectAverageForNegativeNumbers() {
        double result = CourseToolkit.average(new int[]{-3, -6});
        assertTrue(Math.abs(-4.5 - result) < 0.001);
    }

    @Test
    void throwsExceptionForEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.average(new int[]{});
        });
    }


   

}
