package week7hw;

import java.util.Scanner;

/*Write a java program to get numbers from users and print whether it is positive or negative.*/
public class Ans8 {
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

