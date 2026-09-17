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

        if (number == 2){
            return true;
        }

        if (number % 2 == 0){
            return false;
        }

        for (int d = 3; d*d <= number; d+=2){
            if (number % d == 0){
                return false;
            }
        } // если у числа есть делитель больше корня, то есть и делитель меньше корня, d+=2пропускает четные

        return true;   
    }

    public static boolean isPalindrome(String text) {
        if (text == null){
            throw new IllegalArgumentException("строка не может быть пустой");
        }
        int left_index = 0;
        int right_index = text.length() - 1;

        while (left_index< right_index) {
            if (text.charAt(left_index) != text.charAt(right_index)){
                return false;
            }

        left_index++;
        right_index--;
        }
        return true;
    }

    public static double average(int[] values) {
        if (values == null || values.length == 0){
            throw new IllegalArgumentException("массив не может быть пустым");
        }
        long sum = 0;
        for (int val: values){
            sum += val;
        }
        return (double) sum / values.length;
    }
}
