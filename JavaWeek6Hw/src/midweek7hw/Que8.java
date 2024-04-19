package midweek7hw;/* A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not. */

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create object

        System.out.print("Enter number of classes held: "); //num classes held
        int classH = sc.nextInt();

        System.out.print("Enter number of classes attended: "); //num classes attended
        int classA = sc.nextInt();

        double attendPercent = (double) classA / classH * 100; // Calculate percentage
        System.out.println("Percentage classes attended: " + attendPercent + "%"); // Print percentage

        if (attendPercent >= 75) {
            System.out.println("Student is allowed to sit in the exam.");
        } else {
            System.out.println("Student is not allowed to sit in the exam.");
        }


    }
}


