public class HwAns18 {
    //18.1 Declare your council name as static variables.
    static String council = "Ealing";

    //18.2 Declare your house number as instance variables.
    int House = 16;

    //18.3 Declare one instance method name borough() and call Static variable
    void borough(){   //instance method
        System.out.println("council: " + council + "borough");
    }

    //18.4 Declare static method name address() and call instance variable
    static void address(){  //static method
        HwAns18 p = new HwAns18();
        System.out.println("address: " + p.House);
    }

    //18.5 Call both user defined methods into main method.
    public static void main(String[] args) {
        HwAns18 p = new HwAns18();
        p.borough();
        address();
    }

}
