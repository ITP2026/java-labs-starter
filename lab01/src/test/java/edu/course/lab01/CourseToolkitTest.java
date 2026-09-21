package edu.course.lab01;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

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
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }
    
    @Test
    void returnsTrueIfSevenIsPrime() {
        boolean result = CourseToolkit.isPrime(7);

        assertTrue(result);
    }

    @Test
    void returnsTrueIfThirteenIsPrime() {
        boolean result = CourseToolkit.isPrime(13);

        assertTrue(result);
    }

    @Test
    void returnsTrueIfFiveIsPrime() {
        boolean result = CourseToolkit.isPrime(5);

        assertTrue(result);
    }

    @Test
    void returnsTrueIfElevenIsPrime() {
        boolean result = CourseToolkit.isPrime(11);

        assertTrue(result);
    }

    @Test
    void returnsTrueIfStatsIsPalindrome() {
        boolean result = CourseToolkit.isPalindrome("stats");

        assertTrue(result);
    }

    @Test
    void returnsTrueIfNullPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
    }

    @Test
    void returnsTrueIfCaBaCIsPalindrome() {
        boolean result = CourseToolkit.isPalindrome("Ca Bic");

        assertFalse(result);
    }

    @Test
    void returnsAverage() {
        double result = CourseToolkit.average(new int[]{1, 2, 3, 4, 5});

        assertEquals(3.0, result);
    }

    @Test
    void returnsAverageNegate() {
        double result = CourseToolkit.average(new int[]{-2, 4, 6});

        assertEquals(8.0/3.0, result);
    }

    @Test
    void returnsAverageErrornes() {
        assertThrows(IllegalArgumentException.class,() -> CourseToolkit.average(null));
    }

    @Test
    void returnsMin() {
        double result = CourseToolkit.min(new int[]{1, 2, 3, 4, 5});

        assertEquals(1, result);
    }

    @Test
    void returnsMax() {
        double result = CourseToolkit.max(new int[]{1, 2, 3, 4, 5});

        assertEquals(5, result);
    }
}
