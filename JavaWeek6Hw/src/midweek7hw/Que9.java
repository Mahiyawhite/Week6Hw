package midweek7hw; /* Modify the above question to allow student to sit if he/she
has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' )
and print accordingly. */

import java.util.Scanner;

public class Que9 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of classes held: ");
            int Class1 = scanner.nextInt();

            System.out.print("Enter the number of classes attended: ");
            int attendedClasses = scanner.nextInt();

            System.out.print("Do you have a medical cause? (Y/N): ");
            String medicalCause = scanner.next();


            double attendancePercentage = ((double) attendedClasses / Class1) * 100;

            if (medicalCause.equals("Y")) {
                System.out.println(" you are allowed to sit in the exam.");
            } else if (attendancePercentage >= 75) {
                System.out.println("You are allowed to sit in the exam." + attendancePercentage + "%");
            } else {
                System.out.println("You are not allowed to sit in the exam. " + attendancePercentage + "%");
            }
        }
    }


