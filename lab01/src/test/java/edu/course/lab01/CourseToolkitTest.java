package edu.course.lab01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CourseToolkitTest {

    @Test
    void isEven_returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void isEven_returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void isEven_returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }

    @Test
    void isPrime_returnsTrueForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(7);

        assertTrue(result);
    }


    @Test
    void isPrime_returnsTrueForSmallestPrimeNumber() {
        boolean result = CourseToolkit.isPrime(2);

        assertTrue(result);
    }

    @Test
    void isPrime_returnsFalseForNumberLessThanTwo() {
        boolean result = CourseToolkit.isPrime(1);

        assertFalse(result);
    }

    @Test
    void isPrime_returnsFalseForNegativeNumber() {
        boolean result = CourseToolkit.isPrime(-5);

        assertFalse(result);
    }

    @Test
    void isPrime_returnsFalseForSquareOfPrimeNumber() {
        boolean result = CourseToolkit.isPrime(9);

        assertFalse(result);
    }


    @Test
    void isPalindrome_returnsTrueForPalindrome() {
        boolean result = CourseToolkit.isPalindrome("топот");

        assertTrue(result);
    }

    @Test
    void isPalindrome_returnsFalseForPalindrome() {
        boolean result = CourseToolkit.isPalindrome("привет");

        assertFalse(result);
    }

    @Test
    void isPalindrome_returnsFalseForRegisterPalindrome() {
        boolean result = CourseToolkit.isPalindrome("Топот");

        assertFalse(result);
    }

    @Test
    void isPalindrome_isSpaceSensitiveForPalindrome() {
        boolean result = CourseToolkit.isPalindrome("топ от");

        assertFalse(result);
    }

    @Test
    void isPalindrome_throwsForNullText() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
    }

    @Test
    void average_calculatesAverageOfPositiveValues() {
        double result = CourseToolkit.average(new int[]{2, 4, 6});

        assertEquals(4.0, result);
    }

    @Test
    void average_calculatesAverageOfNegativeValues() {
        double result = CourseToolkit.average(new int[]{-2, -4, -6});

        assertEquals(-4.0, result);
    }

    @Test
    void average_throwsForEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(new int[0]));
    }

    @Test
    void average_throwsForNullArray() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(null));
    }

    @Test
    void minForArray_findMinForDifferentValues() {
        double result = CourseToolkit.minForArray(new int[]{-2, 4, -5});

        assertEquals(-5, result);
    }

    @Test
    void maxForArray_findMaxForDifferentValues() {
        double result = CourseToolkit.maxForArray(new int[]{-1, 5, 1});

        assertEquals(5, result);
    }
}
