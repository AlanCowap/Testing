abstract class Vehicle implements Stoppable{
  private RegNumber reg;
  protected Vehicle(RegNumber reg){
    this.reg = reg;
  }
  public void stop(){
    System.out.println("Stopping");
  }
}
