package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsFalseNumbersLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(-10));
        assertFalse(CourseToolkit.isPrime(-2));
    }

    @Test
    void returnsTrueSmallPrimes() {
        assertTrue(CourseToolkit.isPrime(2));
        assertTrue(CourseToolkit.isPrime(3));
    }

    @Test
    void returnsFalseEvenCompositeNumbers() {
        assertFalse(CourseToolkit.isPrime(4));
        assertFalse(CourseToolkit.isPrime(16));
    }

    @Test
    void returnsFalseSquaresOfPrimes() {
        assertFalse(CourseToolkit.isPrime(36));
        assertFalse(CourseToolkit.isPrime(16));
    }

    @Test
    void returnsTrueValidPalindromes() {
        assertTrue(CourseToolkit.isPalindrome(""));
        assertTrue(CourseToolkit.isPalindrome("a"));
        assertTrue(CourseToolkit.isPalindrome("радар"));
        assertTrue(CourseToolkit.isPalindrome("тоот"));
    }

    @Test
    void returnsFalseNonPalindromes() {
        assertFalse(CourseToolkit.isPalindrome("hello"));
        assertFalse(CourseToolkit.isPalindrome("qwerty"));
    }

    @Test
    void returnsThrowsExceptionNullInput() {
        assertThrows(IllegalArgumentException.class, ()
                -> CourseToolkit.isPalindrome(null));
    }

    @Test
    void testCaseSensitibity() {
        boolean result = CourseToolkit.isPalindrome("Радар");

        assertFalse(result);
    }

    @Test
    void testAverageNormal() {
        int[] numbers = {5, 10, 15};
        assertEquals(10.0, CourseToolkit.average(numbers));
    }

    @Test
    void testAverageNegative() {
        int[] numbers = {-2, -4};
        assertEquals(-3.0, CourseToolkit.average(numbers));
    }

    @Test
    void testAverageError() {
        assertThrows(IllegalArgumentException.class, ()
                -> CourseToolkit.average(null));
        assertThrows(IllegalArgumentException.class, ()
                -> CourseToolkit.average(new int[0]));
    }

    @Test
    void testMaxWithMixedNumbers() {
        int[] values = {-25, 23, -4, 1, 56, 12};
        assertEquals(56, CourseToolkit.max(values));
    }

    @Test
    void testMinWithMixedNumbers() {
        int[] values = {-25, 23, -4, 1, 56, 12};
        assertEquals(-25, CourseToolkit.min(values));
    }
}
