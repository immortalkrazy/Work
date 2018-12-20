import java.util.Scanner;
public class TriangleClientUserInput {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter the three sides: ");

    double sideOne = input.nextDouble();
    double sideTwo = input.nextDouble();
    double sideThree = input.nextDouble();
    System.out.println("Please enter the color: ");
    String colorU = input.next();

    if (sideOne == sideTwo && sideTwo == sideThree){
      EquilateralTriangle t1 = new EquilateralTriangle (sideOne, colorU, true);
      t1.printEqTriangle();
    }
    else {
      Triangle t2 = new Triangle(sideOne, sideTwo, sideThree, colorU, true);
      t2.printTraingle();
    }
  }
}
