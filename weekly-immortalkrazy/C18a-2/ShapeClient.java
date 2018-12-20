import java.util.ArrayList;

public class ShapeClient
{
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        Shape s1 = new Circle("circle", 10);
        shapeList.add(s1);
        System.out.printf("The area of %20s is: %4.2f \n",s1.getName(),s1.getArea());

        Shape s2 = new Rectangle("rectangle", 15, 15);
        shapeList.add(s2);
        System.out.printf("The area of %20s is: %4.2f \n",s2.getName(),s2.getArea());

        //  created and added my new RightTriangle object
        Shape s3 = new RightTriangle("rightTriangle", 10, 10,20);
        shapeList.add(s3);
        System.out.printf("The area of %20s is: %4.2f \n",s3.getName(),s3.getArea());

        Shape s4 = new EquilateralTriangle("equilateralTriangle",10,10,10);
        shapeList.add(s4);
        System.out.printf("The area of %20s is: %4.2f \n",s4.getName(),s4.getArea());

        // point noted: s1, s2 and s3 are created as circle and rectangle objects
        if (!s1.getClass().isInstance(s2) && !s2.getClass().isInstance(s3)
            && !s3.getClass().isInstance(s4)) {
        	System.out.println("\nActual types of s1, s2, s3 and s4 are different\n");
        }
        // call of isEquilateral method
        System.out.println(((RightTriangle)s3).isEquilateral());
        System.out.println(((EquilateralTriangle)s4).isEquilateral());

        double totalArea = sumAreasOfShapes(shapeList);
        System.out.printf("\nThe total area of the shapes is: %6.2f", + totalArea);
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
