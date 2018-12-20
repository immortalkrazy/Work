import java.util.ArrayList;
import java.util.*;

public class FruitClient{
  public static void main (String[]args){

    ArrayList<Fruit> fruitList = new ArrayList<>();
    Fruit peach = new Fruit("peach");
    Fruit mango = new Fruit("mango");
    Fruit banana = new Fruit("banana");
    Fruit navel = new Orange("navel");
    Fruit orange = new Orange("orange");
    Fruit tanger = new Orange ("tanger");
    Fruit gala = new Apple("gala");
    Fruit fuji = new Apple("fuji");
    Fruit green = new Apple("green");
    Fruit golden = new GoldenDelicious("golden");
    Fruit delicious = new GoldenDelicious("delicious");
    Fruit silver = new McIntosh("silver");
    Fruit gray = new McIntosh("gray");

    fruitList.add(peach);
    fruitList.add(mango);
    fruitList.add(banana);
    fruitList.add(navel);
    fruitList.add(orange);
    fruitList.add(tanger);
    fruitList.add(gala);
    fruitList.add(fuji);
    fruitList.add(green);
    fruitList.add(golden);
    fruitList.add(delicious);
    fruitList.add(silver);
    fruitList.add(gray);
    //System.out.println(peach.equals(mango));
    //System.out.println(banana.hashCode());
    //System.out.println(navel.hashCode());
    //System.out.println(gray.hashCode());
    //System.out.println("-------------------");

    for (int i = 0; i < fruitList.size(); i++){
      System.out.println(fruitList.get(i));
    }

    System.out.println("\n");
    Fruit randomObject1 = fruitList.get(new Random().nextInt(fruitList.size()));
    Fruit randomObject2 = fruitList.get(new Random().nextInt(fruitList.size()));
    System.out.println("Hash Code for first random object:  " + randomObject1.hashCode());
    System.out.println("Hash Code for first random object:  " + randomObject2.hashCode());
    System.out.println("First  random obeject from array: \n" + randomObject1);
    System.out.println("Second random obeject from array: \n" + randomObject2);
    //System.out.println(randomObject1.equals(randomObject1));
    System.out.println("Objects are equal ? : " + randomObject1.equals(randomObject2));
  }

}
