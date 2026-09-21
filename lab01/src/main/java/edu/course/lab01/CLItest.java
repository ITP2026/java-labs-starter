package edu.course.lab01;
public class CLItest {
    public static void main(String[] args) {
        if (args[0].equals("prime")){
            
            int number = Integer.parseInt(args[1]);
            System.out.println(CourseToolkit.isPrime(number));
        }
        if (args[0].equals("palindrome")){
            String text = args[1];
            System.out.println(CourseToolkit.isPalindrome(text));
        }
        if (args[0].equals("average")){
            int[] values = new int[args.length - 1];
            for (int i = 1; i < args.length; i++) 
            {
                values[i - 1] = Integer.parseInt(args[i]);
            }
            System.out.println(CourseToolkit.average(values));
        }
    }
}
