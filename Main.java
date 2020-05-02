// Class must match the name of the file
// Root
// Strings[ ] string in array of argumenet

// int - interger

// Javac - Java Complier
class Main { 
  //Entry Point of the Application
  // Public is an Access modifer method can be used globaly
  // Static is class method rather than instance menthod 
  //  return type Void is for a method that returns nothing. 
  // Method Signuture
  public static void main(String[] args) {
    // Main myMain = new Main();
    Main main = new Main();
    // System.out.println("Hello World");
    // add();
    // Method on the class
    System.out.println(staticAdd());
    // Method on the instance
    System.out.println(main.add(2, 3));

    // Refering to how man bits for memory allocate
    // Optimize for scalabilty
    // Can store 8-bit -128 to 127;
    // 8 primitives 8 Wrappers data types

    // Primative Data type
    byte myByte = 1;
    // Has access to methods from number class. 
    // Class Data type
    Byte myWrapperByte = 1; 
    // Can store 16-bit up 3200 +/-
    short myShort = 1;
    Short myWrapperShort = 1;
    // Can sotre 32-bit about 2 billion.
    int myVar = 3;    
    // Interger myWrapperVar = 5;
    // Can store 64-bit up ...
    long myLong = 123456;
    Long myWrapperLong = 12345l;



    float myFloat = 2.5f;
    Float myWrapperFloat = 2.5f;
    // ....alot for percision
    double myDouble = 2.34567;
    Double myWrapperDouble = 2.3456;

    // 1-bit  0 - 1;
    boolean foo = false;
    Boolean bar = true;

    char myChar = 'a';
    Character myWrapperChar = 'B';

    String myString = "Test";

    // ==== CONTROL FLOW ====\\

    if( bar == true)  { 
      System.out.println("True"); 
    }
    // Strings have to be double quotes.
    else if(!bar) {
      System.out.println("False");
    }
    else { 
      System.out.println("Something Else");
    }

    // myVarr++ Adding it after the line is executed
    // ++myVar Adding it right when the line is executed. 

    if(myVar == 5) {
      myVar++;
    }
    else if(myVar == 6) {
      myVar--;
    }
    else { 
      myVar -= 3; 
    }

    for(int i = 0; i < myVar; i++) {
      System.out.println(i);
    }

    while(myVar < 10) {
      myVar++; 
    }

    // run at atlest once
    do {
      myVar++;
    }while(myVar < 10);

    switch(myString) {
      case "Test":
        System.out.println("Its Working");
        break;
      case " Error":
        System.out.println("It broke!");
        break;
      default: 
        break;
    }
  }
  public static int staticAdd() {
    int a = 5; 
    int b = 3; 
    return a + b; 
  }
  private int add(int a, int b) {
    return a + b; 
  }
}