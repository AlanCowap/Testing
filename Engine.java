class Engine{
  private float capacity
  private int maxRevs;
  private int revs;
  
  Engine(float capacity, int maxRevs){
    this.capacity = capacity;
    this.maxRevs = maxRevs;
  }
  
  public void setRevs(float revs){
    if (revs >= 0 && revs <= maxRevs){
      this.revs = revs;
    }
  }
  
}
