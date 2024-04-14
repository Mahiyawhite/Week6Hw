package week7hw;
     /*Declare multidimensional array and store 5 countries and their capital and print them in
       console.*/
public class A3 {
       public static void main(String[] args) {

            String[][] countriesAndCapitals = {
                    {"India", "Delhi"},
                    {"canada", "Ottawa"},
                    {"United Kingdom", "London"},
                    {"France", "Paris"},
                    {"United States", "Washington"}
            };


            System.out.println("Countries and Capitals:");
            for (int i = 0; i < countriesAndCapitals.length; i++) {
                System.out.println(countriesAndCapitals[i][0] + " - " + countriesAndCapitals[i][1]);
            }
        }
    }


