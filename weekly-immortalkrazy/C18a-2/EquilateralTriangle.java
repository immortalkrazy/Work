public class EquilateralTriangle extends Triangle{

  private double side1;
  private double side2;
  private double side3;

  public EquilateralTriangle(String name, double side1, double side2, double side3){
    super(name);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double getArea(){
    if (side1 == side2 && side2 == side3){
      return ((Math.sqrt(3) / 4) * (side1 * side1));
    }
    else
    System.out.println("This object is not an Equilateral Traingle");
    return -1.0;
  }

  public boolean isEquilateral(){
    if (side1 == side2 && side2 == side3)
      return true;
    else return false;
  }
}
