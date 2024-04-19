package midweek7hw;/* Take 10 integers from keyboard using loop and print their average value on the
screen.*/

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 1;

        for (int i = 1 ; i <= 10; i++) {

            System.out.print(" Enter number ");
            System.out.println(i);
            sum = sum + sc.nextInt();
        }

        System.out.println("sum is: " + sum);
        System.out.println("Avg is : " + sum /10);  // avg = sum / 10;
    }
}
