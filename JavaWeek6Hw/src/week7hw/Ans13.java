package week7hw;
/* Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/

import java.util.Scanner;

public class Ans13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.print("Enter the symbol (+, -, *, /): ");
        char action = sc.next().charAt(0);

        double result;
        if (action == '+') {
            result = number1 + number2;
            System.out.println("Result: " + result);
        } else if (action == '-') {
            result = number1 - number2;
            System.out.println("Result: " + result);
        } else if (action == '*') {
            result = number1 * number2;
            System.out.println("Result: " + result);
        } else if (action == '/') {

           if (number2 != 0) {
                result = number1 / number2;
               System.out.println("Result: " + result);
            }

            }
        }
}





