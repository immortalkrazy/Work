public class Dove extends Animal{

  private double weight;

  public Dove(){

  }
  public Dove(String name, double weight){
    super(name);
    this.weight = weight;
  }

  public void makeNoise(){
    System.out.println("Dove Coos");
  }

}
