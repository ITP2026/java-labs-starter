package edu.course.lab01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);

        assertTrue(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }

    @Test
    void returnsTrueForTwo() {
        boolean result = CourseToolkit.isPrime(2);

        assertTrue(result);
    }

    @Test
    void returnsFalseForCompositeNumberr() {
        boolean result = CourseToolkit.isPrime(10);

        assertFalse(result);
    }

    @Test
    void returnsFalseForPrimeNumberSquare(){
        boolean result = CourseToolkit.isPrime(49);

        assertFalse(result);
    }

    @Test
    void returnsFalseForLessThanTwo() {
        boolean result = CourseToolkit.isPrime(0);

        assertFalse(result);
    }

    @Test
    void returnsFalseForMoreThanTwo() {
        boolean result = CourseToolkit.isPrime(100);

        assertFalse(result);
    }

    @Test
    void returnsFalseForOne() {
        boolean result = CourseToolkit.isPrime(1);

        assertFalse(result);
    }

    @Test
    void returnsTrueForPаlindrom() {
        boolean result = CourseToolkit.isPalindrom("топот");

        assertTrue(result);
    }

    @Test
    void ThrowsForNull() {
        boolean thrown = false;

        try{
            CourseToolkit.isPalindrom(null);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @Test
    void returnsFalseForPаlndrom() {
        boolean result = CourseToolkit.isPalindrom("щорох");

        assertFalse(result);
    }

    @Test
    void ThrowsFoEmpty() {
        boolean thrown = false;
        try {
            CourseToolkit.average(null);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @Test
    void averageOfNegativeNumbers() {
        int[] values = {-1, -2, -3, -4};

        double result = CourseToolkit.average(values);

        assertEquals(-2.5, result);
    }

    @Test
    void averageOfPositiveNumbers() {
        int[] values = {1, 2, 3, 4};

        double result = CourseToolkit.average(values);

        assertEquals(2.5, result);
    }

    @Test
    void getMinPositiveNumbers() {
        int[] values = {1, 2, 3, 4};

        int result = CourseToolkit.getMin(values);

        assertEquals(1, result);
    }

    @Test
    void getMinNegativeNumbers() {
        int[] values = {-1, -2, -3, -4};

        int result = CourseToolkit.getMin(values);

        assertEquals(-4, result);
    }

    @Test
    void getMinEmpty() {
        int[] values = {};
        boolean thrown = false;

        try {
            CourseToolkit.getMin(values);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @Test
    void getMinNull() {
        boolean thrown = false;

        try {
            CourseToolkit.getMin(null);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @Test
    void getMaxPositiveNumbers() {
        int[] values = {1, 2, 3, 4};

        int result = CourseToolkit.getMax(values);

        assertEquals(4, result);
    }

    @Test
    void getMaxNegativeNumbers() {
        int[] values = {-1, -2, -3, -4};

        int result = CourseToolkit.getMax(values);

        assertEquals(-1, result);
    }

    @Test
    void getMaxNormal() {
        int[] values = {1, 2, 3, 4};

        int result = CourseToolkit.getMax(values);

        assertEquals(4, result);
    }

    @Test
    void getMaxEmpty() {
        int[] values = {};
        boolean thrown = false;

        try {
            CourseToolkit.getMax(values);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @Test
    void getMaxNull() {
        boolean thrown = false;

        try {
            CourseToolkit.getMax(null);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }
}