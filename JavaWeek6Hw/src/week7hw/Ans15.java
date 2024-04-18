package week7hw;

import java.util.Scanner;

/* Write a program that tells us input value is number or an alphabet or symbol.*/
public class Ans15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        int input = sc.next().charAt(0);

        //if (input >= 'A' && input <= 'Z')
        { if (input >= 'a' && input <= 'z')
            System.out.println("The input is an alphabet.");
        }
         if (input >= '0' && input <= '9') {
            System.out.println("The input is a number.");
        }
        else
            System.out.println("The input is a symbol.");
        }
    }

