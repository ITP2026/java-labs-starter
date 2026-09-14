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

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Строка не может быть null!");
        }

        int length = text.length();

        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static double average(final int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть null или пустым!");
        }

        long sum = 0;

        for (int val : values) {
            sum += val;
        }
        return (double)sum / values.length;
    }

    public static int min(final int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть null или пустым!");
        }

        int min = values[0];
        for (int val : values) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public static int max(final int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть null или пустым!");
        }

        int max = values[0];
        for (int val : values) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}
