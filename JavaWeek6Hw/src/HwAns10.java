public class HwAns10 {
    //Write a Java program that takes a number as input and prints its multiplication
    //table up to 10.
    //Expected Output :
    //8 x 1 = 8
    //8 x 2 = 16
    //8 x 3 = 24
    //...
    //8 x 10 = 80

    public static void main(String[] args) {
        //int x = 8;
        for (int i = 1; i < 11; i++) {
            int result = 8 * i;
            System.out.println("8*" + i + "=" + result);
        }
    }
}
