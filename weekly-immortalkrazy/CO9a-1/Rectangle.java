public class Rectangle extends GeometricObjects{
  private double width;
  private double height;
  /*default no-arg construtor*/
  public Rectangle(){

  }
  public Rectangle (double width, double height){
    this.width = width;
    this.height = height;
  }
  public Rectangle(double width, double height, String color, boolean filled){
    this.width = width;
    this.height = height;
    setColor(color);
    setFilled(filled);
  }
  public void setWidth(double width){
    this.width = width;
  }
  public void setHeight(){
    this.height = height;
  }
  public double getWidth(){
    return width;
  }
  public double getHeight(){
    return height;
  }
  public double getArea(){
    return height * width;
  }
  public double getParameter(){
    return 2 * (width + height);
  }
  public void printRectangle(){
    /**System.out.println("Area and perimeter of a renctangle of
      height and with of: " + getHeight +" "+ getWidth +" is: "
      + getArea + " & " + getParameter);*/
  }
}
