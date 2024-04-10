public class HwAns17 {

    //17.1 Declare your city as instance variables.
    String city = "London";

    //17.2 Declare your country as static variables.
    static String country = "United Kingdom";

    //17.3 Declare one instance method and call static variable in print statement
    void PrintCity(){
        System.out.println("static country: " + country);
    }

    //17.4 Declare static method and call instance variable in print Statement.
    static void  PrintCountry(){
        HwAns17 c = new HwAns17();
        System.out.println("String city: " + c.city);
    }

    //17.5 Call both user defined methods into main method.
    public static void main(String[] args) {
        HwAns17 c = new HwAns17();
        c.PrintCity();
        PrintCountry();
    }
}
