public class TriangleClient{
  public static void main (String[]args){

    Shape s4 = new EquilateralTriangle("eQ", 10);
    System.out.println("area:  " + s4.getArea());

    Shape s2 = new RightTriangle("rt", 10,10,20);
    System.out.println("area:  " + ((Shape)s2).getArea());

  }
}
