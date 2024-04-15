package week7hw;
/* Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry. */

import java.util.Scanner;

public class Ans11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet between A to F :");
        char alphabet = scanner.next().toUpperCase().charAt(0);

        String cityName;
        if (alphabet == 'A') {
            cityName = "Ahmedabad";
        } else if (alphabet == 'B') {
            cityName = "Bombay";
        } else if (alphabet == 'C') {
            cityName = "Chennai";
        } else if (alphabet == 'D') {
            cityName = "Dubai";
        } else if (alphabet == 'E') {
            cityName = "England";
        } else if (alphabet == 'F') {
            cityName = "Florida";
        } else {
            cityName = "Invalid entry";
        }

        System.out.println("City Name: " + cityName);

        scanner.close();
    }
}
