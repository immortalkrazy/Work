public class Panther extends Feline {

  private int age;

  public Panther(){

  }
  public Panther(String name, int age){
    super(name);
    this.age = age;
  }

  public void makeNoise(){
    System.out.println("Panther Roars");
  }
  public void pounce(){
    System.out.println("Panther Pounces");
  }

}
