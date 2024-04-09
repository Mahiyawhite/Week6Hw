public class HwAns2 {
//2.1 Declare two static variables.
static int variable1 = 1;
    static int variable2 = 2;

//2.2 Declare one static method.
    static  void printStaticVariables() {

//2.3 Call both static variables into the static method inside the print statement.
        System.out.println("static int variable = " + variable1);
        System.out.println("static int variable = " + variable2);
    }
//2.4 Declare the Main method.
public static void main(String[] args) {

        //2.5 Call the static method into the Main method and run the programme.
    HwAns2 h = new HwAns2();
    h.printStaticVariables();

    }
}
