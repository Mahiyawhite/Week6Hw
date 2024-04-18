package week7hw;/* Write a Java program to calculate the average value of array elements.*/

public class Ans22 {
    public static void main(String[] args) {
        int [] numbers = {1, 5, 8, 3, 7};
        int  sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            sum = numbers[i];
        }
        double average = (double) sum/numbers.length;
        System.out.println("Average value: " + average);

    }
}
