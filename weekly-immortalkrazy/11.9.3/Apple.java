public class Apple extends Fruit{
  private String name;

  public Apple(){
  }
  public Apple(String name){
    this.name = name;
  }
  public String toString(){
    return "Class name is " + this.getClass().getName() +
           "\nValue in variable name is " + name;
  }
  public String getApplePieRecipe(){
    return "This is apple pie recipe";
  }
}
