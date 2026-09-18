package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Возвращает true, если число простое
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number != 2 && number%2==0) {
            return false;
        }
        for (int i=3; i*i <= number; i+=2 ) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Сравнивает строку в точности
     */
    public static boolean isPalindrom(String text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }

       int left = 0;
       int right = text.length()-1;
       while (left < right) {
        if (text.charAt(left) != text.charAt(right)){
            return false;
        }
        left++;
        right--;
       }
    return true;
    }

    /**
     * Возвращает среднее арифметическое
     */
    public static double average(int[] values) {
    if (values == null) {
        throw new IllegalArgumentException();
    }

    int sum = 0;
    for (int i=0; i < values.length; i++) {
        sum += values[i];
    }
   return (double) sum / values.length;
    }

    /**
     * Возвращает min число массива
     */
    public static int getMin(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException();
        }

        int min = values[0];
        for (int i=0; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }

    /**
     * Возвращает max число массива
     */
    public static int getMax(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException();
        }

        int max = values[0];
        for (int i=0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }
}
