// import java.util.Arrays;
// Import the package vehicleInventory
import vehicleInventory.Vehicle;

class Main { 
  public static void main(String[] args) {
    // System.out.println(args);
    // System.out.println(Arrays.toString(args));

    Vehicle myCar = new Vehicle("Big Bertha", "Honda", "Civic", 4, 2.4f);
    Vehicle myOtherCar = new Vehicle();

    // with public access modifier
    // myOtherCar.name = "Cat";

    myOtherCar.setName("Cat");
    myOtherCar.getName();

    System.out.println(myCar);
    System.out.println(myOtherCar);
    // inherits the run method
    // myCar.run();
  }
}