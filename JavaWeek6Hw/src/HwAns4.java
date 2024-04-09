public class HwAns4 {
    //4.1 Declare two instance and two static variables.
    //4.2 Declare one instance method.
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    //print statement.
    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.

    int InstanceVariable1  = 20;
    int InstanceVariable2 = 25;
    static int staticVariable1 = 30;
    static int staticVariable2 = 35;

    //4.2 Declare one instance method.
    void InstanceMethod() {
        //4.4 Call all four instance and static variables into both instance and static methods inside the
        //print statement.
        System.out.println("Instance variable: " + InstanceVariable1);
        System.out.println("Instance variable: " + InstanceVariable2);
        System.out.println("Static variable: " + staticVariable1);
        System.out.println("Static variable: " + staticVariable2);
    }
    //4.3 Declare one static method.
    static void StaticMethod(){
        HwAns4 v = new HwAns4();
        HwAns4 p = new HwAns4();
        //4.4 Call all four instance and static variables into both instance and static methods inside the
        //print statement.
        System.out.println("Instance variable: " + v.InstanceVariable1);
        System.out.println("Instance variable: " + p.InstanceVariable2);
        System.out.println("Static variable: " + staticVariable1);
        System.out.println("Static variable: " + staticVariable2);

    }
    //4.5 Declare the Main method.
    public static void main(String[] args) {
        //4.6 Call both instance and static methods into the Main method and run the programme.
        HwAns4 v = new HwAns4();
        HwAns4 p = new HwAns4();
        v.InstanceMethod();
        p.InstanceMethod();
        StaticMethod();


    }
}
