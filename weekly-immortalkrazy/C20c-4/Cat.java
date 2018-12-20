//public class Cat extends Feline {
//
//    public Cat(String name) {
//        super(name);
//    }
//
//    public void makeNoise() {
//        System.out.println("Meow ...");
//    }
//
//}


public class Cat extends Feline implements CatMotion {

    public Cat(String name, double weight) {
        super(name, weight);
    }

    public void makeNoise() {
        System.out.println("Meow ...");
    }

    public void tap(Animal animal) {
        System.out.println(getName() + " is curiously tapping " + animal.getName());
    }
}
