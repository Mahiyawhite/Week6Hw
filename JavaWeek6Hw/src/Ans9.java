public class Ans9 {
    //Write a Java program to print the result of the following operations.
    //Test Data:  -5 + 8 * 6
    //Expected Output : 43
    public static void main(String[] args) {
        int a = (-5);
        int b = 8;
        int c = 6;

        int result = a + b * c;

        //print the result
        System.out.println("Result of a: " + result);

        // Operation b: (55+9) % 9
        int resultB = (55 + 9) % 9;
        System.out.println("Result of b: " + resultB);

        // Operation c: 20 + -3*5 / 8
        int resultC = 20 + -3 * 5 / 8;
        System.out.println("Result of c: " + resultC);

        // Operation d: 5 + 15 / 3 * 2 - 8 % 3
        int resultD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Result of d: " + resultD);
    }
}
