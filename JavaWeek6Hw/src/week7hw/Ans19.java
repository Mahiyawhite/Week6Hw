package week7hw;
/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”*/

import java.util.Scanner;

public class Ans19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }

}
