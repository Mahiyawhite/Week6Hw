package midweek7hw; /* Print multiplication table of 24, 50 and 29 using loop.*/

public class Que2 {
    public static void main(String[] args) {
        //int x = 24;
        System.out.println("Multiplication table of 24:");
        for (int i = 1; i < 11; i++) {
            int result = 24 * i;
            System.out.println("24*" + i + "=" + result);

        }
        //int y = 50;
        System.out.println();
        System.out.println("Multiplication table of 50:");
        for (int i = 1; i < 11; i++) {
            int result = 50 * i;
            System.out.println("50*" + i + "=" + result);

        }
        //int z = 29;
        System.out.println();
        System.out.println("Multiplication table of 29:");
        for (int i = 1; i < 11; i++) {
            int result = 29 * i;
            System.out.println("29*" + i + "=" + result);
        }
    }
}
