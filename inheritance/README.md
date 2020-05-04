## Access Modifiers: 

_These all deal with scope_
  - public 
  - private
  - protected
  - default

## Key Terms: 
  - **java.lang** :
  - **java.util** : Additional functionality from classes 
  - **package** : A folder with classes.  
  - **bytecode** :  a language that Java has to compile to talk the Java Virtual Machine
  - **constructors** : A method capitalize and the same name as the class.
  - **override methods** : is related to inheritance 
  - **JVM** : Java virtual Machine complies Java code to bytecode. It was introduced to make cross-platform  capabilities binary code
  binary code
  - **interpolation** : 
  - **class overloading** : 
  - **method overloading** :
  - **Abstract** : A keyword that limits class to be only inheritied from not instantiated.
  - **final** : A keyword that limits the class to only instantiated from not inherited. A concrete class.
  - **Enum** : A special class that has values or properties that are capitalized it is example of abstraction since your giving the essential elements for the user to use and limiting them from writing any string. 
  - **hashcode** : to store in memory.
  - **overloading** : Adding extra parameters to method in two class


  _.toString and .equals are on all data types because it inherited from the parent object class._


  _new triggers the constructor._

  ```
  Vehicle vehicle = new Vehicle();
  ```

## Interface 

_An interface  is an abstract class with a group of related methods with empty bodies. Interfaces use abstract method to enforce rules.  Abstract method is a method signature with no body. The abstract methods in the interface is used in the contract between a class that implements it. The abstract method signature must be use in class with the same method signature._

```
  public interface Drivable { 
    <!-- Abstract Method -->
    void drive();
  }
```