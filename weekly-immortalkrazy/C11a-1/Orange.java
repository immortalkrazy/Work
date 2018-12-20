public class Orange extends Fruit{
  public String name;

  public Orange(){

  }
  public Orange(String name){
    this.name = name;
  }

  public String toString(){
    return "Class name is " + this.getClass().getName() +
           "\nValue in variable name is " + name;
  }
  public String getOrangeJuiceRecipe(){
    return "This is orange juice recipe";
  }

}
