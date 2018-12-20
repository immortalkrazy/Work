public class RightTriangle extends Triangle{

  private double base;
  private double height;
  private double hypotenuse;

  public RightTriangle(String name, double base, double height, double hypotenuse){
    super(name);
    this.base = base;
    this.height = height;
    this.hypotenuse = hypotenuse;
  }
  public double getArea(){
    return (base * height) / 2;
  }
  public boolean isEquilateral(){
    if (base == height && height == hypotenuse){
      return true;
    }
    else return false;
  }

}
