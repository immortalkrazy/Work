public class FruitClient{
  public static void main (String[]args){

    Orange orange = new Orange("healthy");
    Apple apple = new Apple("pink");
    System.out.println(orange.getOrangeJuiceRecipe());
    System.out.println(apple.getApplePieRecipe());

    System.out.println("------Inheretence/Upcasting------");
    /*Fruit g is greated and called getName method*/
    Fruit g = new Fruit("'gala'");
    System.out.println(g.getName());
    /*fruit created as apple and getName method from Fruit class*/
    Fruit t = new Apple("Tonga");
    // gives out a null value since it is getting that from fruit class
    System.out.println(t.getName());
    /*fruit created as orange and getName method from Fruit class*/
    Fruit b = new Orange("beem");
    System.out.println(b.getName());
    // m created as McIntosh is using the setName
    // method in Fruit class
    Fruit m = new McIntosh("sweet");
    m.setName("---Mike---");
    System.out.println(m.getName());

    System.out.println("\n-----Polymorphism-----");

    /*Polymirphism examples: all are created as Fruit but the
    later print statements show that f1....f5 are all different*/
    Fruit fOrg = new Orange("tiny");// upcasting is done automatic
    Fruit fApp = new Apple("green");// upcasting is done automatic
    Fruit fMci = new McIntosh("slim");// upcasting is done automatic
    Fruit fGds = new GoldenDelicious("beuty");// upcasting is done automatic
    Fruit fFrt = new Fruit("pinapple");
    /*toString methos of Object class is also implemented
    in all the to string methods to show inheretence*/
    System.out.println(fOrg.toString());//Polymorphism java knows to call to string method from orange
    System.out.println(fApp.toString());//Polymorphism java knows to call to string method from apple
    System.out.println(fMci.toString());//Polymorphism java knows to call to string method from McIntosh
    System.out.println(fGds.toString());//Polymorphism java knows to call to string method from GoldenDelicious
    System.out.println(fFrt.toString());//Polymorphism java knows to call to string method from Fruit

    System.out.println("\n-----Casting----- \n");
    printRecipe(fGds, "tang");
    printRecipe(fOrg, "malta");
    printRecipe(new Orange(), "Kinnu");
    Fruit cali = new Apple("cali");
    printRecipe(cali, "Cali");

    GoldenDelicious dcGd = new GoldenDelicious("Delicious");
    Fruit dcFt = dcGd;//upcasting to fruit
    //testing if Fruit is GoldenDelicious
    if (dcFt instanceof GoldenDelicious){
      System.out.println("It is a GoldenDelicious I can safely downcast it to GoldenDelicious");
      GoldenDelicious dc = (GoldenDelicious)dcFt;//casting
    }
    System.out.println(((GoldenDelicious)dcFt).toString());
    /* Downcasting */
    //
    Fruit ft = new GoldenDelicious("Golden");
    if (ft instanceof Apple){
      Apple tap = (Apple)ft;
      System.out.println(tap.toString());
    }
    /*This is an example of wrong casting*/
    //Fruit wrong = new Orange();
    //Apple wrong2 = (Apple)wrong;
    //System.out.println(wrong);


/*****************************************************************/

    System.out.println("");

    if (fApp instanceof Fruit){
      System.out.println(" is an Apple");
    }
    else{
      System.out.println(" is not Apple");
    }
    if (fFrt instanceof Fruit){
      System.out.println(" is an Fruit");
    }
    else{
      System.out.println(" is not Fruit");
    }
    if (fGds instanceof Apple){
      System.out.println(" is an Apple");
    }
    else{
      System.out.println(" is not Apple");
    }

    System.out.println("\n-----Dyanamic Bonding----- \n");
    /*Dynamic binding: which toString method is invoked by x is
    dependent on how the object was declared. In the print statemnet
    x refers to the particular object created not just any toString*/
    m(new Fruit("lemon"));           // new fruit object
    m(new Apple("gala"));  // new apple with specified arg
    m(new Orange("goli"));          // new Orange object
    m(new GoldenDelicious("red")); //
    m(new McIntosh("silver"));        //
  }
  // method to print referenced object
  public static void m(Fruit x){
    System.out.println(x.toString());
  }
  /*********CASTING******************/

  public static void printRecipe(Fruit rFruit, String s){
    System.out.println();

    if (rFruit instanceof Orange){
      Orange tempOrange = (Orange) rFruit;
      System.out.println(tempOrange.getOrangeJuiceRecipe() +
       " for " + s);
    }
    else if (rFruit instanceof Apple){
      Apple tempApple = (Apple) rFruit;
      System.out.println(tempApple.getApplePieRecipe() +
       " for " + s);
    }
    else{
      System.out.println("Error");
    }
  }
}
