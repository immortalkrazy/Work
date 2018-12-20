public class Fruit{
    private String name;

    public Fruit(){
    }
    public Fruit(String name){
      this.name = name;
      //System.out.println("A new fruit added named: " + getName());
    }
    // protected final methods, specified constructor used
    // if specified fruit const. is used, name cannot be changed
    protected final void setName(String name){
      this.name = name;
    }

    public String getName(){
      return this.name;
    }

    public String toString(){
      return "Class name is " + "Fruit" +
             "\nValue in Variable name is " + name;
    }
}
