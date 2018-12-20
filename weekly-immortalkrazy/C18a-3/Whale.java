public class Whale extends Animal {

  private double size;
  private int age;

  public Whale(){

  }
  public Whale(String name, int age){
    super(name);
    this.age = age;
  }

  public void makeNoise(){
    System.out.println("Whale clicks");
  }

}
