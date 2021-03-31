import java.util.ArrayList;

public class MyGenericArrayListTest {
   public static void main(String[] args) {
      // type safe to hold a list of Strings
      ArrayList<String> strLst = new ArrayList<String>();
   
      strLst.add("alpha");   // compiler checks if argument is of type String
      strLst.add("beta");
   
      for (int i = 0; i < strLst.size(); ++i) {
         String str = strLst.get(i);   // compiler inserts the down casting operator (String)
         System.out.println(str);
      }
   strLst.add(2,"VM");
      //strLst.add(new Integer(1234));  // compiler detected argument is NOT String, issues compilation error

   strLst.add("Gama");
 //  System.out.println(strLst.get(2));
   System.out.println(strLst);
   }
}
 