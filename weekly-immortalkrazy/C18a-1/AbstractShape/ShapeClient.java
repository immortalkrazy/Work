import java.util.ArrayList;

public class ShapeClient
{
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        Shape s1 = new Circle("circle 1", 10);
        shapeList.add(s1);

        Shape s2 = new Rectangle("rectangle 2", 100, 100);
        shapeList.add(s2);

//  created and added my new RightTriangle object
        Shape s3 = new RightTriangle("rightTriangle", 10, 10);
        shapeList.add(s3);
        
// point noted: s1, s2 and s3 are created as circle and rectangle objects
        if (!s1.getClass().isInstance(s2) && !s2.getClass().isInstance(s3)) {
        	System.out.println("\nActual types of s1, s2, and s3 are different\n");
        }

        double totalArea = sumAreasOfShapes(shapeList);
        System.out.println("The total area of the shapes are " + totalArea);
    }

    public static double sumAreasOfShapes(ArrayList<Shape> shapeList) {
      double sum = 0.;
      // Use the enhanced for loop
//      for (Shape shape: shapeList) {
//        sum += shape.getArea();
//      }

      // Use the for loop
      for (int i=0; i<shapeList.size(); i++) {
        sum += shapeList.get(i).getArea();
      }
      return sum;
    }
}
// I tried using both enhanced and regular for loop
