package week7hw;
/* Same as above program-8 using switch statement. */

import java.util.Scanner;

public class Ans12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter characters between A to F:");
        String city = scanner.nextLine();

        switch (city){
            case "A": city = "Ahmedabad";
                break;
            case "B'": city = "Bombay";
                break;
            case "C": city = "Chennai";
                break;
            case "D": city = "Delhi";
                break;
            case "E": city = "England";
                break;
            case "F": city = "Florida";
                break;
            default:
                System.out.println("INVALID DATA");
        }
        System.out.println("City Name: " + city);

        scanner.close();
    }
}
