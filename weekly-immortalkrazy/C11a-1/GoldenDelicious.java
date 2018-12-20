public class GoldenDelicious extends Apple{
  private String name;

  public GoldenDelicious(){

  }
  public GoldenDelicious(String name){
    this.name = name;
  }
  public String toString(){
    return "Class name is " + this.getClass().getName() +
           "\nValue in variable name is " + name;
  }
}
