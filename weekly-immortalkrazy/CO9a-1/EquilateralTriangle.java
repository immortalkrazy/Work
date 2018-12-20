public class EquilateralTriangle extends Triangle{
  private double side;

  public EquilateralTriangle(){

  }
  public EquilateralTriangle(double side){
    this.side = side;
  }
  public EquilateralTriangle(double side, String color, boolean filled){
    setColor(color);
    setFilled(filled);
    this.side = side;

  }
  public void setSide(double side){
    this.side = side;
  }
  public double getSide(){
    return side;
  }
  public double getArea(){
    return Math.sqrt(3) / 4 * side * side;
  }
  public double getParameter(){
    return 3 * side;
  }
  public void printEqTriangle(){
    System.out.println("EquilateralTriangle with the side:  "+
    getSide() +"\nHas an  area of : " +
    Math.round(getArea()*100)/100.00 +
    "\nAnd perimeter of:  " + getParameter()+
    "\nThe   color   is:  " + getColor() +"\nFilled status is:  "
    +  isFilled());
  }
}
