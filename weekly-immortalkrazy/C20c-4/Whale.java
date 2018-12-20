public class Whale extends Animal implements SwimMotion {

    public Whale(String name, double weight) {
        super(name, weight);
    }

    public void makeNoise() {
        System.out.println("Whistling");
    }

    public void swim(Direction direction, double speed, double distance) {
        System.out.print(getName() + " is swimming to direction " + direction.toString() + " for " + distance + " feet at " + speed
                + " miles/hour. ");
        System.out.println("Fins moving ...");
    }

}
