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
    //Возвращает true если у числа два делителя
    public static boolean isPrime(int number){
        if (number < 2) return false;

        for (int i = 2; i <= Math.sqrt(number); ++i){
            if ((number%i)==0) return false;
        }
        return true;
       
    }
    //Проверяет на палиндромность
    public static boolean isPalindrome(String text){
        if (text == null) throw new IllegalArgumentException("text must not be null");
        
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Возвращает среднее значение от массива
    public static double average(int[] values){
        if(values==null || values.length == 0) throw new IllegalArgumentException("Values array must not be null");
        double sum = 0;
        for(double value:values){
            sum+=value;
        }
        return sum /= values.length;
    }
    //Возвращает меньшее число из массива
    public static int min(int[] values){
        int min = values[0];
        for(int v : values){
            if (v<min){
                min = v;
            }
        }
        return min;
    }
    // Возвращает максимальное число из массива
    public static int max(int [] values){
        int max = values [0];
        for(int v : values){
            if(v>max){
                max = v;
            }
        }
        return max;
    }
}
