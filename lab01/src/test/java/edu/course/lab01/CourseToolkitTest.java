package edu.course.lab01;

import org.junit.jupiter.api.Test;

import java.sql.Array;

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
    void returnsTrueForPrimeNumber(){
        boolean result = CourseToolkit.isPrime(17);

        assertTrue(result);
    }

    @Test
    void returnsFalseForCompositeNumber(){
        boolean result = CourseToolkit.isPrime(4);

        assertFalse(result);
    }

    @Test
    void returnsFalseForOne(){
        boolean result = CourseToolkit.isPrime(1);

        assertFalse(result);
    }


    @Test
    void returnsFalseForNotPalindrome(){
        boolean result = CourseToolkit.isPalindrome("abc");

        assertFalse(result);
    }

    @Test
    void returnsTrueForPalindrome(){
        boolean result = CourseToolkit.isPalindrome("abba");

        assertTrue(result);
    }

    @Test
    void returnsFalseForPalindrome(){
        boolean result = CourseToolkit.isPalindrome("baobab");

        assertFalse(result);
    }


    @Test
    void shouldThrowExceptionWhenStringIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.isPalindrome(null)
        );
    }

    @Test
    void shouldThrowExceptionWhenArrayIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.average(null)
        );
    }

    @Test
    void shouldThrowExceptionWhenArrayIsEmpty() {
        int[] arr = {};
        assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.average(arr)
        );
    }

    @Test
    void shouldReturnAverage() {
        int[] arr = {12, 12, 12};
        assertEquals(12.0, CourseToolkit.average(arr));
    }






}
