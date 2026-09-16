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

        for (int divisor = 2; (long) divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Текст не должен быть null");
        }

        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    public static double average(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Входные значения не должны быть null или пустыми");
        }
        long sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    public static int minForArray(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Входные значения не должны быть null или пустыми");
        }
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }
    public static int maxForArray(int[] values){
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Входные значения не должны быть null или пустыми");
        }
        int max= values[0];
        for (int i = 1; i < values.length; i++){
            if (max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}
