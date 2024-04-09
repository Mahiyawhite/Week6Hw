public class HwAns3 {
   //3.1 Declare one instance and one static variable.


    //3.4 Call both instance and static variables into both instance and static methods inside the
    //print statement.


int InstanceVariable  = 20;
static int staticVariable = 30;

//3.2 Declare one instance method.
    void InstanceMethod(){
        //3.4 Call both instance and static variables into both instance and static methods inside the
        //print statement.
        System.out.println("Instance variable: " + InstanceVariable);
        System.out.println("Static variable: " + staticVariable);
    }

    //3.3 Declare one static method.
    static void StaticVariable() {

        //3.4 Call both instance and static variables into both instance and static methods inside the
        //print statement.
        HwAns3 v = new HwAns3();
        System.out.println("Instance variable: " + v.InstanceVariable);
        System.out.println("Static variable: " + staticVariable);

    }
    //3.5 Declare the Main method.
    public static void main(String[] args) {

        //3.6 Call both instance and static methods into the Main method and run the programme.
        HwAns3 v = new HwAns3();
        v.InstanceMethod();
        StaticVariable();
    }

}
