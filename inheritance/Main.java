// import java.util.Arrays;
// Import the package vehicleInventory
// import vehicleInventory.Vehicle;
import vehicleInventory.Car;
import vehicleInventory.CarColors;




class Main { 
  public static void main(String[] args) {
    // System.out.println(args);
    // System.out.println(Arrays.toString(args));

    Car myCar = new Car("Big Bertha", "Honda", "Civic", 4, 2.4f, true, true, CarColors.RED);
    // Vehicle myOtherCar = new Vehicle();

    // with public access modifier
    // myOtherCar.name = "Cat";

    // myOtherCar.setName("Cat");
    // myOtherCar.getName();

    // System.out.println(myCar);
    // System.out.println(myOtherCar);
    // inherits the run method
    // myCar.run();
  }
}