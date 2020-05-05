// imports everything in util
import java.util.*;

class Main { 
  public static void main(String[] args) {
    // angle bracket
    // List order and set has no ordering guarntee
    // The collection is interface within the collection framwork work that has other interfaces and classes as its childre relative to collection
    List <Integer>listy = new ArrayList<>();
    listy.add(100);
    listy.add(50);
    listy.add(20);
    listy.add(80);
    listy.add(25);
    // Operates on or returns collection
    // its destructive changing the the original ( like mutation in js)
    Collections.sort(listy);
    System.out.println(listy);
  }
}
// class Main { 
//   public static void main(String[] args) {
//     // angle bracket
//     // List order and set has no ordering guarntee
//     // The collection is interface within the collection framwork work that has other interfaces and classes as its childre relative to collection
//     List <Integer>listy = new ArrayList<>();
//     listy.add(100);
//     listy.add(50);
//     listy.add(20);
//     listy.add(80);
//     listy.add(25);
//     // Operates on or returns collection
//     // its destructive changing the the original ( like mutation in js)
//     Collections.sort(listy);
//     System.out.println(listy);
//   }
// }



// class Main { 
  
//   public static int staticCount = 0;
//   public int instanceCount = 0;

//   public static void main(String[] args) {
//     // create an instance
//     Main main1 = new Main();
//     Main main2  = new Main();



//     Main.myStaticCounter();
//     main1.myStaticCounter();
//     main1.myStaticCounter();
//     main1.myStaticCounter();

//     main2.myStaticCounter();

//     main1.nonStaticCounter();
//     main1.myStaticCounter();


//     main2.nonStaticCounter();
//     main2.myStaticCounter();

//   }

//   public static void  myStaticCounter() {
//     // static method talks to static variable
//     staticCount++;
//     System.out.println(" Static Count : " + staticCount);
//   }

//   public void nonStaticCounter() {
//     instanceCount++;
//     System.out.println(" Instance Count : " + instanceCount);
//   }
// }