package edu.course.lab01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CourseToolkitTest {


    // 1. 
  

    @Test
    void returnsTrueForNegativeEvenNumber() {
        assertTrue(CourseToolkit.isEven(-8));
    }

 
    // 2. 
  

    @Test
    void isPrime_ShouldReturnFalseForNumbersLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(-5));
    }

    @Test
    void isPrime_ShouldReturnTrueForPrimeNumbers() {
        assertTrue(CourseToolkit.isPrime(2));
        assertTrue(CourseToolkit.isPrime(7));
        assertTrue(CourseToolkit.isPrime(13));
    }

    @Test
    void isPrime_ShouldReturnFalseForCompositeNumbers() {
        assertFalse(CourseToolkit.isPrime(4));
        assertFalse(CourseToolkit.isPrime(10));
    }

    @Test
    void isPrime_ShouldReturnFalseForSquareOfPrime() {
        assertFalse(CourseToolkit.isPrime(49));
    }

    // 3. 
    

    @Test
    void isPalindrome_ShouldReturnTrueForExactPalindrome() {
        assertTrue(CourseToolkit.isPalindrome("шалаш"));
        assertTrue(CourseToolkit.isPalindrome("radar"));
    }

    @Test
    void isPalindrome_ShouldReturnFalseWhenCaseOrSpacesMatter() {
        assertFalse(CourseToolkit.isPalindrome("Код")); 
        assertFalse(CourseToolkit.isPalindrome("а роза упала на лапу азора"));
    }

    @Test
    void isPalindrome_ShouldThrowExceptionOnNull() {
        // Заменяем assertThrows классическим блоком try-catch
        try {
            CourseToolkit.isPalindrome(null);
            // Если код прошел дальше и ошибка не вылетела — тест провален
            assertFalse(true); 
        } catch (IllegalArgumentException e) {
            // Если поймали нужное исключение — тест успешно пройден
            assertTrue(true);
        }
    }


    // 4. 
    

    @Test
    void average_ShouldCalculateCorrectlyForNormalScenario() {
        int[] values = {1, 2, 3, 4};
        double result = CourseToolkit.average(values);
        
        // Заменяем assertEquals(2.5, result, 0.001) через сравнение разницы модуля чисел
        assertTrue(Math.abs(result - 2.5) < 0.001);
        
        // Проверяем, что массив не изменился (каждый элемент равен исходному)
        assertTrue(values[0] == 1);
        assertTrue(values[1] == 2);
        assertTrue(values[2] == 3);
        assertTrue(values[3] == 4);
    }

    @Test
    void average_ShouldCalculateCorrectlyForNegativeScenario() {
        int[] values = {-2, -4, -6};
        double result = CourseToolkit.average(values);
        
        assertTrue(Math.abs(result - (-4.0)) < 0.001);
    }

    @Test
    void average_ShouldThrowExceptionOnNullOrEmpty() {
        // Проверка пустого массива через try-catch
        try {
            CourseToolkit.average(new int[0]);
            assertFalse(true);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        
        // Проверка null через try-catch
        try {
            CourseToolkit.average(null);
            assertFalse(true);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}
