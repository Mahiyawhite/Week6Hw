package week7hw;
  /*Declare multidimensional array and store 5 countries and their capital and print them in
    console.*/
public class Ans3 {
    // 1 example:
      public static void main(String[] args) {
          String[][] mycountry = {{"India,Canada,UnitedKingdom,Usa,France"},
                                  {"Delhi,Otava,London,Newyork,Paris"}};


          System.out.println("Countries and Capitals:");
          for (int i = 0; i < mycountry.length; ++i) {
              for (int j = 0; j < mycountry[i].length; ++j)
                  System.out.println(mycountry[i][j]);
          }
          // 2 example:
          String[][] countriesAndCapitals = {
                  {"India", "Delhi"},
                  {"Canada", "Ottawa"},
                  {"United Kingdom", "London"},
                  {"France", "Paris"},
                  {"United States", "Washington"}
          };

          System.out.println();
          System.out.println("Countries and Capitals:");
          for (int i = 0; i < countriesAndCapitals.length; i++) {
              System.out.println(countriesAndCapitals[i][0] + " - " + countriesAndCapitals[i][1]);
          }
      }
}




