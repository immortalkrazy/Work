import java.util.ArrayList;
public class AnimalClient {

  public static void main(String[]args){

    // call to methods
    noise();
    pounce();

  }//end of main

  // noise method
  public static void noise(){

    ArrayList<Animal> animalList = new ArrayList<Animal>();
    Animal dove = new Dove();
    animalList.add(dove);
    Animal whale = new Whale();
    animalList.add(whale);
    Animal cat = new Cat();
    animalList.add(cat);
    Animal panther = new Panther();
    animalList.add(panther);

    System.out.println("\n-----NOISE-----\n");
    for (Animal animal: animalList) {
      animal.makeNoise();
    }
  }//end of noise

  // pounce method which prints out the methods in feline
  public static void pounce(){

    ArrayList<Feline> felineList = new ArrayList<Feline>();

    Feline cat = new Cat();
    felineList.add(cat);
    Feline panther = new Panther();
    felineList.add(panther);

    System.out.println("\n-----POUNCE-----\n");
    for (Feline feline: felineList){
      feline.pounce();
    }
  }//end of pounce

}// end of class
