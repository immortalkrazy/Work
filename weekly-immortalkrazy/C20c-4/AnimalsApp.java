import java.util.ArrayList;

public class AnimalsApp{



    // TODO 1: Implementing interfaces
    public static void main( String[] args ){
        ArrayList<Animal> list = new ArrayList<Animal>();
        Animal a1 = new Cat("cat", 5);
        Animal a2= new Panther("panther", 20);
        Animal a3 = new Owl("owl", 4);
        Animal a4 = new Dove("dove", 15);
        Animal a5 = new Whale("whale", 1000);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        printAnimals(list);

        Animal ginger = new Cat("Ginger", 10);
        ginger.makeNoise();

        System.out.println("My name is " + ginger.getName());
        ((Cat)ginger).walk(new Direction(36., 0.), 2., 10.);

        Animal feather = new Dove("Feather", 5);
        feather.makeNoise();
        System.out.println("My name is " + feather.getName());
        ((Dove)feather).fly(new Direction(36., 0.), 2., 10.);

        findTheHeaviest(list);
    }// end of main

    public static void findTheHeaviest(ArrayList<Animal> list){
      for (int i = 0; i < list.size(); i++){
        int heaviest = 0;
        list.sort();

      }
    }

    public static void printAnimals(ArrayList<Animal> list){
      for (int i = 0; i < list.size(); i++){
        System.out.println(list.get(i));
      }
    }


    // TODO 2: Aggregating behaviors by implementing various interfaces
    // public static void main(String[] args) {
    //     FlyingCat tuxedo = new FlyingCat("Tuxedo");
    //     tuxedo.walk(new Direction(36., 0), 2., 10.);
    //     tuxedo.fly(new Direction(36., 36.), 2., 10.);
    // }

    // TODO 3a: Use interface to write generic method
    // public static void main(String[] args) {
    //     ArrayList<FlyMotion> flyingAnimals = new ArrayList<FlyMotion>();
    //
    //     flyingAnimals.add(new Dove("Feather"));
    //     flyingAnimals.add(new Owl("Awe"));
    //     flyAll(flyingAnimals);
    // }
    //
    //  public static void flyAll(ArrayList<FlyMotion> flyingAnimals) {
    //      for(FlyMotion bird: flyingAnimals) {
    //          bird.fly(new Direction(36., 36.), 2., 10.);
    //      }
    //  }

    // TODO 3b: Use interface to write generic method
    // public static void main(String[] args) {
    //     Animal ginger = new Cat("Ginger");
    //     Animal feather = new Dove("Feather");
    //
    //     move(ginger);
    //     move(feather);
    // }
    //
    // public static void move(Animal animal) {
    //     if (animal instanceof FlyMotion) {
    //         ((FlyMotion) animal).fly(new Direction(36., 36.), 3., 8.);
    //     } else if (animal instanceof FelineMotion) {
    //         ((FelineMotion) animal).walk(new Direction(36., 36.), 3., 8.);
    //     }
    //
    //     if (animal instanceof Cat) {
    //         ((Cat)animal).tap(new Dove("feather"));
    //     }
    // }
}
