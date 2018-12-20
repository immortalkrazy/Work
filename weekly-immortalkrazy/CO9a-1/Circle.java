public class Circle extends GeometricObjects{
  private double radius;

  public Circle(){

  }
  public Circle(double radius){
    this.radius = radius;
  }
  /*Circle object using alse GeometricObject methods*/
  public Circle(double radius, String color, boolean filled){
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }
  /*set radius to desired radius*/
  public void setRadius(double radius){
    this.radius = radius;
  }
  /*get radius*/
  public double getRadius(){
    return radius;
  }
  /*area of the circle*/
  public double getArea(){
    return radius * radius * Math.PI;
  }
  /*diameter of circle*/
  public double getDiameter(){
    return radius * 2;
  }
  /*parameter of circle*/
  public double getParameter(){
    return 2 * radius * Math.PI;
  }
  /*circle info on scren*/
  public void printCircle(){
    System.out.println("The Circle is created " + getDateCreated()
     + " and the radius is " + radius);
  }
}
