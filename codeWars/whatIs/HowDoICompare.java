package whatIs;


public class HowDoICompare {
  public static String whatIs(Integer x) {

    System.out.println("This is x: " + x);

      for (Object[] p : specialNumbers) {
        // System.out.println("This is p[0]: " + p[0]);
        // System.out.println("This is p[1]: " + p[1]);
          if (p[0] == x)
            System.out.println("This will return: " + p[1]);
              return (String)p[1];
      }
      System.out.println("This is returning nothing");
      return "nothing";
  }
  
  // This is a object with arrays inside. Object [] is the data type of the specialNumbers and [] is the return type.

  // When a variable is declared with final keyword, its value can’t be modified, essentially, a constant. This also means that you must initialize a final variable. 
  static final Object[][] specialNumbers = {
      {42, "everything" },
      {42 * 42, "everything squared"},
  };
}