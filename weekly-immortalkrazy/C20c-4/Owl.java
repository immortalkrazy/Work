public class Owl extends Animal implements FlyMotion {

    protected Owl(String name, double weight) {
        super(name, weight);
    }

    public void fly(Direction direction, double speed, double distance) {
        System.out.print(getName() + " is flying to direction " + direction.toString() + " for " + distance + " feet at " + speed
                + " miles/hour. ");
        System.out.println("Wings flapping silently...");
    }

    public void makeNoise() {
        System.out.println("Hoot ...");
    }

}
