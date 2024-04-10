public class HwAns20 {
    //20.1 Declare your Spain as static variable.
    static String City = "Spain";

    //20.2 Declare your United Kingdom as instance variable.
    String Country = "United Kingdom";

    //20.3 Declare instance method name homeCountry()and call static variable.
    void homeCountry(){
        System.out.println("City: " + City);
    }

    //20.4 Declare static method name holidays() and call instance variable
    static void holidays(){
        HwAns20 h = new HwAns20();
        System.out.println("Country: " + h.Country);
    }

    //20.5 Call both methods in main method.
    public static void main(String[] args) {
        HwAns20 h = new HwAns20();
        h.homeCountry();
        holidays();
    }
}

