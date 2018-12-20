public class ShowErrorsC {
  public static void main (String[]args) {
    Circle c = new Circle();
    System.out.println("What is radius " + c.getRadius());

  }
}
class Circle {
  int radius = 1;
  int getRadius(){
    return radius;
  }
}
