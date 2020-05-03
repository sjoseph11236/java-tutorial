package vehicleInventory;

public final class Car extends Vehicle { 
  private Boolean hasHorn;
  private Boolean hasCruiseControl; 


  public Car() {

  }

  public Car(
    String name, 
    String make, 
    String model, 
    Integer numOfWheels, 
    Float engineSize, 
    Boolean hasHorn, 
    Boolean hasCruiseControl, 
    CarColors ca) {
      super(name, make, numOfWheels, engineSize);
      this.hasHorn = hasHorn; 
      this.hasCruiseControl = hasCruiseControl;
  }

  public Boolean getHasHorn() {
    return this.hasHorn;
  }
  public void setHasHorn(Boolean hasHorn) {
    this.hasHorn = hasHorn;
  }
  public Boolean getHasCruiseControl() {
    return this.hasCruiseControl;
  }
  public void setHasCruisControl(Boolean hasCruiseControl) {
    this.hasCruiseControl = hasCruiseControl;
  }
  
  // @override
  // public String toStrin(String name)
}