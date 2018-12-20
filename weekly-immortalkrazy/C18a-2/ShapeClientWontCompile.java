/**
 * This  program won't compile. Why?
 */
import java.util.ArrayList;

public class ShapeClientWontCompile
{
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        Shape s1 = new Circle("circle 1", 10);
        shapeList.add(s1);

        Shape s2 = new Rectangle("rectangle 2", 100, 100);
        shapeList.add(s2);

        Shape s3 = new RightTriangle("RightTriangle", 10, 10);
        shapeList.add(s3);

        // Compiler may not prevent this kind of error
        // I see that Shape object cannot be ctreated isInstance
        // shape is an abstract class
//        Shape s3 = new Shape("Shape 3");
//        shapeList.add(s3);
        // after commenting out the creation of shame object it complies
        // and gives me the same output
        // LESSON LEARNED: you cannot create an object of abstract class

        // I see tha method is called here to get total area
        double totalArea = sumAreasOfShapes(shapeList);
        System.out.println("The total area of the shapes are " + totalArea);
    }

    // method to compute are by adding all areas
    public static double sumAreasOfShapes(ArrayList<Shape> shapeList) {
      double sum = 0.;
      // Use the enhanced for loop
      // for (Shape shape: shapeList) {
      //   sum += shape.getArea();
      // }

      // Use the for loop
      for (int i=0; i<shapeList.size(); i++) {
        sum += shapeList.get(i).getArea();
      }
      return sum;
    }
}
