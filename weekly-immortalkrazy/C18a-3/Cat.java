public class Cat extends Feline {

  private String color;
  private int age;

  public Cat(){

  }
  public Cat(String name, String color, int age){
    super(name);
    this.color = color;
    this.age = age;
  }

  public void makeNoise(){
    System.out.println("cat purrs");
  }
  public void pounce(){
    System.out.println("Cat Pounces");
  }

}
