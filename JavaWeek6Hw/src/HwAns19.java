public class HwAns19 {
    //19.1 Declare one of your group member names as instance variable.
    String Name1 = "Deva";

    //19.2 Declare one of your group member names as static variable.
    static String Name2 = "Kin";

    //19.3 Declare one instance method name with group name (e.g. selenium())and call both global
    //variables.
    void Selenium(){
        System.out.println("Name1: " + Name1);
        System.out.println("Name2: " + Name2);
    }

    //19.4 Declare static method name agile() and call both variable
    static void agile(){
        HwAns19 d = new HwAns19();
        System.out.println("Name1:" + d.Name1);
        System.out.println("Name2:" + Name2);
    }

    //19.5 Call both user defined methods into main method.
    public static void main(String[] args) {
        HwAns19 d = new HwAns19();
        d.Selenium();
        agile();
    }
}
