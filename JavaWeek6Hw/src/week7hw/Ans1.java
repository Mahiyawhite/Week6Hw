package week7hw;

import java.util.Scanner;

/* Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :) */
public class Ans1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = s.nextInt();

        if (num%2==0)
            System.out.println("Even num" + num);
        else
            System.out.println("odd num" + num);
    }

}
