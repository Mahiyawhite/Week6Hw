package week7hw;/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and GrossSalary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/

import java.util.Scanner;

public class Ans6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Employee ID");
        int employeeID = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Employee Name");
        String name = sc.nextLine();

        System.out.println("Enter Employee  Salary");
        double basicSalary = sc.nextDouble();

        double HRA = basicSalary * 0.10;
        double DA = basicSalary * 0.08;
        double TA = basicSalary * 0.09;
        double PF = basicSalary * 0.20;

        double GrossSalary = basicSalary + HRA + TA + DA -PF;

        System.out.println("|             Salary Slip                              |");
        System.out.println("|                                                      |");
        System.out.println("|_____________________________________________________ |");
        System.out.println("|                                                      |");
        System.out.println("| Employee ID        :" + employeeID  +     "               |");
        System.out.println("| Employee name      :" + name +       "               |");
        System.out.println("|                                                      |");
        System.out.println("|_______________________________________               |");
        System.out.println("|Basic Salary        :" + basicSalary + "              |");
        System.out.println("|HRA 10%             :" + HRA +         "              |");
        System.out.println("|TA 8%               :" + TA +          "              |");
        System.out.println("|DA 9%               :" + DA +          "              |");
        System.out.println("|PF-20&              :"+ PF +           "              |");
        System.out.println("|                                                      |");
        System.out.println("|______________________________________________________|");
        System.out.println("|Gross Salary       :" + GrossSalary +  "              |");
        System.out.println("|======================================================|");



    }

}



