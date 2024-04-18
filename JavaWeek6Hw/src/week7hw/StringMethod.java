package week7hw;
/* String Method in Java */
public class StringMethod {
    public static void main(String[] args) {
        String N = "Harmione ";
        String M = "Granger";

        //Length of the string
        System.out.println("String length: " + N.length());

        //String charAt
        System.out.println("String char: " + N.charAt(4));

        //String concat
        System.out.println("Concate two String : " +N.concat(M));

        //String contains
        System.out.println(N.contains("Har")); //true
        System.out.println(M.contains("Gro")); //false

        //String starstWith
        System.out.println(N.startsWith("Har"));  //true
        System.out.println(M.startsWith("R"));  //false

        //String endsWith
        System.out.println(N.endsWith("e ")); //true
        System.out.println(M.endsWith("e"));  //false

        //String equals
        String L = "Mahi";
        String K = "Mahi";
        System.out.println(M.equals(N)); //false
        System.out.println(L.equals(K)); //true

        //String indexOf
        String A = "Weather is very Beautiful";
        System.out.println(A.indexOf("is"));

        //String isEmpty
        System.out.println(N.isEmpty()); //false

        //String replace
        String B = "Apexa";
        String newStr = B.replace('e','i');
        System.out.println(newStr);

        //String substring
        System.out.println(B.substring(0,3));

        //String toCharArray
        char[] Array = B.toCharArray();
        System.out.println(Array[3]);

        //String toLowerCase
        System.out.println(N.toLowerCase());

        //String toUpperCase
        System.out.println(M.toUpperCase());

        //String trim
        String D = "    Harry Potter    ";
        System.out.println(D);
        System.out.println(D.trim());

    }



}

