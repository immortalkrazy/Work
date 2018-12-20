public abstract class Animal {
    private String name;
    private double weight;
    protected Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void makeNoise();

    public void sleep() {
        System.out.println("Sleep ...");
    }

    public String getName() {
        return name;
    }
    public double getWeight(){
      return weight;
    }
    public void setWeight(double weight){
      this.weight = weight;
    }
    public void setName(String name){
      this.name = name;
    }
//    public abstract printAnimals();
}
