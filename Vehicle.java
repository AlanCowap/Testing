class Vehicle implements Stoppable{
  protected RegNumber reg;
  Vehicle(RegNumber reg){
    this.reg = reg;
  }
  public void stop(){
    System.out.println("Stopping");
  }
}
