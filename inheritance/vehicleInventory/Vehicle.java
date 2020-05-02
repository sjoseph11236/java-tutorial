package vehicleInventory;

public class Vehicle { 
  // Properties 
  private Integer numOfWheels;
  private Float engineSize;
  private String name; 
  private String make;
  private String model;

  // constructors 
  // public Vehicle() {
  //   System.out.println("Trggier Constructor");
  // }

  public Vehicle(String name, String make , String model, Integer numOfWheels, Float engineSize) {
    this.name = name;
    this.make = make; 
    this.model = model;
    this.numOfWheels = numOfWheels;
    this.engineSize = engineSize;
  }

  public Vehicle() {
  }


  // getters 
  public String getName() {
    return this.name;
  }
  // setters
  public void setName(String name) {
    this.name = name;
  }
  // override methods
  @Override
  public String toString() {
    return "Name: " + name + " Make " + make;
  }
}