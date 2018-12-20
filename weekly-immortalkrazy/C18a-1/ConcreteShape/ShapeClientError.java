import java.util.ArrayList;

public class ShapeClientError
{
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        Shape s1 = new Circle("circle 1", 10);
        shapeList.add(s1);

        Shape s2 = new Rectangle("rectangle 2", 100, 100);
        shapeList.add(s2);

        // Compiler may not prevent this kind of error

        // I see that the shape get area methos trow the UnsupportedOperationException
        // this is to prevent the programmer to accidently creat a wrong object
        // since shape itself cannot have the area
        // since we dont know at that point what shape it is going to be SO:

//        Shape s3 = new Shape("Shape 3");
//        shapeList.add(s3);

          // create my Right triangle Object s3

        Shape s3 = new RightTriangle("RightTriangle", 10, 10);
        shapeList.add(s3);

        // calling the method sumAreasOfShapes

        double totalArea = sumAreasOfShapes(shapeList);
        System.out.println("The total area of the shapes are " + totalArea);
    }

    public static double sumAreasOfShapes(ArrayList<Shape> shapeList) {
      double sum = 0.;

      // I tried using both loops and I feel like enhanced is less code

      // Use the enhanced for loop
      for (Shape shape: shapeList) {
      sum += shape.getArea();
      }

      // Use the for loop
//      for (int i=0; i<shapeList.size(); i++) {
//        sum += shapeList.get(i).getArea();
//      }
      return sum;
    }
}
