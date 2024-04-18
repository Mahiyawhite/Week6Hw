package week7hw; /* Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format */

import java.util.Scanner;

public class Ans5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student name: ");
        String name = sc.nextLine();

        System.out.println("Enter Student Roll No.: ");
        int rollNo = sc.nextInt();

        System.out.println("Enter marks for Math:");
        int mathMarks = sc.nextInt();

        System.out.println("Enter marks for Science:");
        int scienceMarks = sc.nextInt();

        System.out.println("Enter marks for English:");
        int englishMarks = sc.nextInt();

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 3.0);

        String result;
        String grade;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80)
                grade = "A+";
            else if (percentage >= 60)
                grade = "A";
            else if (percentage >= 50)
                grade = "B";
            else
                grade = "C";
        } else {
            result = "Fail";
            grade = "N/A";
        }

        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);

        System.out.println("|------------------------------------------------ |");
        System.out.println("|            Mark Sheet                           |");
        System.out.println("|------------------------------------------------ |");
        System.out.println("|                                                 |");
        System.out.println("| Name              : " + name + "                |");
        System.out.println("| Roll No           : " + rollNo + "              |");
        System.out.println("|                                                 |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| Subjects          :   Marks                     |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| Math              :   " + mathMarks + "         |");
        System.out.println("| Science           :   " + scienceMarks + "      |");
        System.out.println("| English           :   " + englishMarks + "      |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| Total             :   " + totalMarks +         "|");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| Percentage        :   " + percentage +         "|");
        System.out.println("| Result            :   " + result +             "|");
        System.out.println("| Grade             :   " + grade +              "|");
        System.out.println("|-------------------------------------------------|");
       }

    }
