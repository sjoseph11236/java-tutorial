# Java:

## Main Class: 

_In every Java application there is an entry point class usually called Main._ 

_The class must match the name of the file in the directory._ 

## Key Terms for Main Method :
  _These terms make-up the main method signature._

 - **Public** : This the access modifier to the main method. It has to be public so that Java runtime can execute this method.
 - **Static** : The main method has to static so that JVM can load the class into memory and call the main method.
 - **Void** : Java main method doesn't return anything. 
 - **String[] args** : The main method single argument of type String array. Also called the Command-Line arguments.

## Key Terms: 
  - **int** : interger
  - **javac** : VS code CLI command for ava Complier


_Java has 8 primitive and Wrapper data types
Java has server data types to represent numbers to accommodate for optimization in memory allocation:_

  - **primitive / Wrapper**
  - byte   / Byte  (8-bit)
  - short / Short   (16-bit)
  - int / Integer (32-bit)
  - long / Long    (64-bit)
  - float / Float
  - double / Double
  
_A double is used for precision of an accurate decimal value_

  - boolean / Boolean (1-bit)
  - char / Character (single quotes only)
  - String (double quotes only)

## Control Flow
  - if, else if and else
  - Switch
  - For Loop 
  - While Loop
  - Do While Loop

  - An Increment/decrement operator that is after a variable will increment/decrement after that line of code.
  - An Increment/decrement operator that is before a variable will increment/decrement on when the line of code is run. 

## Static method: 
  _A method on class that has static  keyword can only be accessed on the class._
  


  ```
    Class Main { 
      public static void main(String[] args) {
        add();
      }

      public static int staticAdd(int a, int b) {
        return a + b
      }
    }
  ```

  _A method without the static keyword can be access on the instance  of object of that class._

  ```
    Class Main { 
      public static void main(String[] args) {
        <!-- Create an instance of -->
        Main main = new Main();
        <!-- Invoke the main method on that instance -->
        main.add();
      }

      public int Add(int a, int b) {
        return a + b
      }
    }
  ```

# Sources:

- [What is the Command-Line arguments?](https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html) 