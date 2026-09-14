package edu.course.lab01;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

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
     *  Возвращает true если среди чисел от 2 до корня числа не оказалось делителей иначе false
     * */
    public static boolean isPrime(int number) {
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     *  Возвращает true если строка - палиндром
     * */
    public static boolean isPalindrome(@Nullable String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }


        int i = 0;
        int j = str.length() - 1;



        while (i < j){

            if (str.charAt(i) != str.charAt(j)){
                return false;
            }

            i++;
            j--;


        }

        return true;
    }


    public static double average(@Nullable int[] values) {
        if (values == null || values.length == 0){
            throw new IllegalArgumentException();
        }

        return Arrays.stream(values).sum() / values.length;
    }


}
