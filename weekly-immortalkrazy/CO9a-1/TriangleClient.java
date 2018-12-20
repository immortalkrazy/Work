public class TriangleClient{
  /*main method*/
  public static void main(String[]agrs){

    /*creat triangle object with three sides*/
    Triangle t1 = new Triangle(3,4,4);
    System.out.println("\nTRIANGLE WITH THREE SIDES\n");
    /*use parent methods*/
    System.out.println("A triangle " + t1.toString());
    /*change color of the object as well as filled status*/
    t1.setColor("red");
    /*print the change*/
    System.out.println("The color now is: " + t1.getColor());
    System.out.println("Is it filled now: " + t1.isFilled());
    /*print sides, area, perimeter, color, filled*/
    t1.printTraingle();

    /*Now testing EquilateralTriangle*/
    System.out.println("\nAN EQUILATERAL TRIANGLE\n");
    /*creat an EquilateralTriangle with the parameter given*/
    EquilateralTriangle et = new EquilateralTriangle(3, "green", true);
    /*use parent methods*/
    System.out.println("A triangle " + et.toString());
    /*print EquilateralTriangle with side*/
    et.printEqTriangle();

    /*test creating another object with more parameters*/
    System.out.println("\nJUST ANOTHER TEST\n");
    Triangle t2 = new Triangle(3,4,5,"orange",true);
    t2.printTraingle();
  }
}
