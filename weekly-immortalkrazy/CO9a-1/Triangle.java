public class Triangle extends GeometricObjects{

  private double side1;
  private double side2;
  private double side3;

  public Triangle(){

  }
  public Triangle(double side1, double side2, double side3){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  public Triangle(double side1, double side2, double side3,
                  String color, boolean filled){
    super(color, filled);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    //setColor(color);
    //setFilled(filled);
  }
  public void setSide1(double side1){
    this.side1 = side1;
  }
  public void setSide2(double side2){
    this.side2 = side2;
  }
  public void setSide3(double side3){
    this.side3 = side3;
  }

  public double getSide1(){
    return side1;
  }
  public double getSide2(){
    return side2;
  }
  public double getSide3(){
    return side3;
  }
  public double getArea(){
    double p = getParameter() / 2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
  }
  public double getParameter(){
    return side1 + side2 + side3;
  }
  /*method to print traiangle on screen*/
  public void printTraingle(){
    System.out.println("A traigle with the sides: \nSide 1\t"+
    getSide1() +"\nSide 2\t"+ getSide2() +"\nSide 3\t"+ getSide3() +
    "\nHas  an  area of:  "+ Math.round(getArea()*100)/100.00 +
    "\nHas perimeter of:  " + Math.round(getParameter()*100)/100.00 +
    "\nThe   color   is:  " + getColor() + "\nFilled status is: " +
    isFilled());
  }
}
