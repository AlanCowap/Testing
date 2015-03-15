classTest{
  public static void main(String... args){
    if(0 < args.length)
      new Test().sayHello(args[0]);
  }
  
  private void sayHello(String msg){
    System.out.println(msg);
  }
}
