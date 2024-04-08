public class DivisionProgramme {
    //Write a Java program to divide two numbers and print on the screen.
    //Test Data: 50/3
    //Expected Output: 16
    public static void main(String[] args) {
        DivisionProgramme d = new DivisionProgramme();
        d.divide();
    }

        public void divide(){
            int x = 50;
            int y = 3;
            int divide = x/y;
            System.out.println("Expected Output: "+divide);

    }
}