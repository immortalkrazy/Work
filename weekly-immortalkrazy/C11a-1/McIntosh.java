public class McIntosh extends Apple{
  private String name;

  public McIntosh(){

  }
  public McIntosh(String name){
    this.name = name;
  }
  public String toString(){
    return "Class name is " + this.getClass().getName() +
           "\nValue in variable name is " + name;
  }
}
