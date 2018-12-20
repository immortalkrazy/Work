public class Circle extends GeometricObject {

  private double radius;

  public Circle() {

  }

  public Circle(double radius) {

    this.radius = radius;
  }

  public double getRadius() {

    return radius;

  }



  /** Set a new width */

  public void setradius(double radius) {

    this.radius = radius;

  }

  @Override /** Return area */

  public double getArea() {

    return Math.PI * radius * radius ;

  }

  @Override /** Return perimeter */

  public double getPerimeter() {

    return 2 * (Math.PI * radius);

  }

}
