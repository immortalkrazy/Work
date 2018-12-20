public abstract class Feline extends Animal implements FelineMotion {
    public Feline(String name, double weight) {
        super(name, weight);
    }

    public abstract void makeNoise();

    public void walk(Direction direction, double speed, double distance) {
        System.out.print(getName() + " is walking to direction " + direction.toString() + " for " + distance + " feet at " + speed
                + " miles/hour. ");
        System.out.println("Legs moving ...");
    }

    public void pounce(Animal prey) {
        System.out.println("Pouncing prey " + prey.getName());
    }
}
