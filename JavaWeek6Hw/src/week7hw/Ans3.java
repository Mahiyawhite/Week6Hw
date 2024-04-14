package week7hw;
  /*Declare multidimensional array and store 5 countries and their capital and print them in
    console.*/
public class Ans3 {
      public static void main(String[] args) {
          String[][] mycountry = {{"India,Canada,UnitedKingdom,Usa,France"},
                                  {"Delhi,Otava,London,Newyork,Paris"}};


          System.out.println("mycountry and capital:");
          for (int i = 0; i < mycountry.length; ++i) {
              for (int j = 0; j < mycountry[i].length; ++j)
                  System.out.println(mycountry[i][j]);
          }
      }
}
