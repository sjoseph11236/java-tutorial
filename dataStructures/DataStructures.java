// import java.util.Vector; 
// import java.util.ArrayList;
// // import java.util.LinkedList;
// import java.util.List;
// import java.util.HashMap;
// // import java.util.Map;
// import java.util.HashSet;

public class DataStructures { 
  public static void main(String[] args) {
    // // Array
    // int[] intArr = {1, 2, 3, 4 ,5, 6}; // Array- constant size

    // for(int i = 0; i < intArr.length; i++) {
    //   // print element
    //   System.out.println(intArr[i]);
    //   // print index
    //   System.out.println(i);
    // }

    // // Vector
    // Vector<Integer> vecty = new Vector<>(2,3); //capacity incremental capcity
    //               // elements in the list, capacity
    // vecty.add(10); //1,2
    // vecty.add(12); //2,2
    // vecty.add(3);// 3,5
    // vecty.add(30); //4,5
    // vecty.add(300); //5,5
    // vecty.add(3000);//6, 8
    // System.out.println("This is the capcity");
    // System.out.println(vecty.capacity());

    // // ArrayList
    // // Unlimited capcity
    // // ineffiecnt to remove from the beginning than from end
    // ArrayList<String> listy = new ArrayList<>();
    // // Index is stored already.
    // listy.add("One");
    // listy.add("Two");
    // listy.add("Three");
    // listy.add("Four");
    // listy.add("Five");
    
    // System.out.println("This is the list: ");
    // System.out.println(listy);

    // // Linked List 
    // LinkedList <Boolean> linky = new LinkedList<>();
    // linky.add(true);
    // linky.add(false);
    // linky.add(false);
    // linky.add(true);

    // System.out.println("This is linky:");
    // // list has to calculate the index eveytime
    // System.out.println(linky.get(0));
    
    // // Creating an instance to use the listMethod on the instance
    // DataStructures classInstance = new DataStructures();

    // List <Integer> result = classInstance.listMethod(true);

    // result.add(10);

    // System.out.println(result);

    // //  Object or List can be put in as type to be stored in the Hash Map.
    // HashMap<String,Integer> mappy = new HashMap<>();
    // // // The interface for HashMap is Map
    // // Map<String, Integer> mappy = new HashMap<>();
    // mappy.put("Age", 30);
    // System.out.println(mappy);

    // // Allows to enforce a uniuq value
    // Set<String> setty = new HashSet<>();
    // setty.add("One");
    // setty.add("Two");



  }

  // // List is the interface for ArrayList, LinkedList, Vector
  // // Without this return type you this method would have an error since it would be expecting to return either a ArrayList or Vector
  // public List<Integer> listMethod(boolean isClient) {
  //   if(isClient) {
  //     Vector<Integer> clientIds = new Vector<>();
  //     return clientIds;
  //   }
  //   else { 
  //     ArrayList<Integer> jobIds = new ArrayList<>();
  //     return jobIds;
  //   }
  // }
}