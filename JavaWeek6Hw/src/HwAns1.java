public class HwAns1 {
    // Step 1.1: Declare two instance variables
    int variable1 = 5;
    int variable2 = 10;

    //1.2 Declare one instance method.
    void printVariables(){

        // Step 1.3: Call both instance variables into the instance method inside the print statement
        System.out.println("int variables1 = " + variable1);
        System.out.println("int variables2 = " + variable2);
    }

    // Step 1.4: Declare the Main method
    public static void main(String[] args) {
        HwAns1 obj = new HwAns1();

        // Step 1.5: Call the above instance method into the Main method and run the program
        obj.printVariables();
    }

}
