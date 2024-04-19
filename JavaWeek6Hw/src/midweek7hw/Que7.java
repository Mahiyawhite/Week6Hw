package midweek7hw; /* Take input of age of 3 people by user and determine oldest
                       and youngest among them. */

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the first person: ");
        int person1 = sc.nextInt();

        System.out.print("Enter the age of the second person: ");
        int person2 = sc.nextInt();

        System.out.print("Enter the age of the third person: ");
        int person3 = sc.nextInt();

        if (person1 < person2 && person1 < person3) {
            System.out.println("First Person is Youngest");
        }
        else if (person2<person1 && person2<person3) {
            System.out.println("Second Person is Youngest");
        }
        else if (person3<person1 && person3<person2)  {
            System.out.println("Third Person is Youngest");
    }
        if (person1>person2 && person1>person3) {
            System.out.println("First Person is Oldest");
        }
        else if (person2>person1 && person2>person3) {
            System.out.println("Second Person is Oldest");
        }
        else if (person3>person1 && person3>person2)  {
            System.out.println("Third Person is oldest");
            }
        }
}





