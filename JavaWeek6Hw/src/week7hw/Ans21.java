package week7hw; /* Write a Java program to sum values of an array.*/

public class Ans21 {
    public static void main(String[] args) {
        int [] numbers = {1, 5, 8, 3, 7};
        int  sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            sum = numbers[i];
        }
        System.out.println("The sum is: " + sum);

    }
}
