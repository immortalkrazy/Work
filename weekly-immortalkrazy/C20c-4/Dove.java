public class Dove extends Animal implements FlyMotion{

    public Dove(String name, double weight) {
        super(name, weight);
    }

    public void makeNoise() {
        System.out.println("Coo ...");
    }

    public void fly(Direction direction, double speed, double distance) {
        System.out.print(getName() + " is flying to direction " + direction.toString() + " for " + distance + " feet at " + speed
                + " miles/hour. ");
        System.out.println("Wings flapping...");
    }
}
