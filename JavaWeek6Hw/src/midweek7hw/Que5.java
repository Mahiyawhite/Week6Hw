package midweek7hw; /* Take two int values from user and print greatest among them. */

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second value: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Greatest number is: " + n1);
        } else if (n2 > n1) {
            System.out.println("Greatest number is: " + n2);
        }

    }
}
