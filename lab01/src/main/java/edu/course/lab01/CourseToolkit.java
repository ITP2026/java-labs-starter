package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0){
                    return false;
            }
            
        }
        return true;
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Неправильно");
        }
        String reverse = new StringBuilder(text).reverse().toString();
        return reverse.equals(text);

    }

    public static double average(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null или пустым");
        }
        long sum = 0;
        for (int i : values) {
            sum += i;

            
        }
        return (double) sum / values.length;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
