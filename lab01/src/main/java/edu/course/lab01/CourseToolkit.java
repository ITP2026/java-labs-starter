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
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(String text) {
        if (text == null)
            throw new IllegalArgumentException();
        for (int i = 0; i< text.length()/2; i++ )
            if (text.charAt(i) != text.charAt(text.length()-i-1))
                return false;
        return true;
    }

    public static double average(int[] values) {
        if (values == null)
            throw new IllegalArgumentException();
        int ValueSum = 0;
        for (int i:values){
            ValueSum += i;
        }
        return (double)ValueSum / values.length;
    }

    public static int min(int[] values) {
        int minimum = 999999;
        for (int i = 0; i<values.length; i++)
            if (values[i] < minimum)
                minimum = values[i];
        return minimum;

    }

    public static int max(int[] values) {
        int maximum = -999999;
        for (int i = 0; i<values.length; i++)
            if (values[i] > maximum)
                maximum = values[i];
        return maximum;

    }
}

