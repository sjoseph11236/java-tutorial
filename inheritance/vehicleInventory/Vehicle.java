package vehicleInventory;

public abstract class Vehicle { 
  // Properties 
  private String name; 
  private String make;
  private String model;
  private Integer numOfWheels;
  private Float engineSize;
  private CarColors color;

  // constructors 
  // public Vehicle() {
  //   System.out.println("Trggier Constructor");
  // }
  public Vehicle() {
  }

  public Vehicle(String name, String make , String model, Integer numOfWheels, Float engineSize) {
    this.name = name;
    this.make = make; 
    this.model = model;
    this.numOfWheels = numOfWheels;
    this.engineSize = engineSize;
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