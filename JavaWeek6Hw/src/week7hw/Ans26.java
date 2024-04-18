package week7hw;
/* Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd */

public class Ans26 {
    public static void main(String[] args) {
        String name = "Vaishali";
        for(int i = name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
    }
}
