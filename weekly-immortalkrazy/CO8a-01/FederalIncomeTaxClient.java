import java.util.InputMismatchException;
import java.util.Scanner;
public class FederalIncomeTaxClient {
  private static FederalIncomeTax tax = null;
  public static void main(String[]args){

    try(Scanner input = new Scanner(System.in)){

      System.out.print("Please enter your status: \n" +
                     "            Single Press 1: \n" +
                     "   Married Jointly Press 2: \n" +
                     "Married Seperately Press 3: \n" +
                     " Head of Household Press 4:   ");
      int status = input.nextInt();
      if (status == 1){
        System.out.print("  Please enter your income:   ");
        double income = input.nextDouble();
        tax = new FederalIncomeTax(status, income);
        printTax(1);
      }
      else if (status == 2){
        System.out.print("  Please enter your income:   ");
        double income = input.nextDouble();
        tax = new FederalIncomeTax(status, income);
        printTax(2);
      }
      else if (status == 3){
        System.out.print("  Please enter your income:   ");
        double income = input.nextDouble();
        tax = new FederalIncomeTax(status, income);
        printTax(3);
      }
      else if (status == 4){
        System.out.print("  Please enter your income:   ");
        double income = input.nextDouble();
        tax = new FederalIncomeTax(status, income);
        printTax(4);
      }
      else{
        System.out.println("Please enter the right choice");
      }

    }catch(InputMismatchException e){
      System.out.println("Error:  Choices should be 1, 2 , 3 or 4");
    }
    catch(Exception e){
      System.out.println(e.getMessage());
      System.exit(1);
    }
  }

  public static void printTax(int status){
    if(status == 1){
      System.out.println("You entered Status:   " + tax.getStatus());
      System.out.println("You entered income:   " + tax.getIncome());
      System.out.println("As of:(Today's Date)  " + tax.getDate());
      System.out.println("Calculated Tax is:    " + tax.getTaxAmountSingle());
    }
    else if (status == 2){
      System.out.println("You entered Status:   " + tax.getStatus());
      System.out.println("You entered income:   " + tax.getIncome());
      System.out.println("As of:(Today's Date)  " + tax.getDate());
      System.out.println("Calculated Tax is:    " + tax.getTaxAmountMarriedJoint());
    }
    else if(status == 3){
      System.out.println("You entered Status:   " + tax.getStatus());
      System.out.println("You entered income:   " + tax.getIncome());
      System.out.println("As of:(Today's Date)  " + tax.getDate());
      System.out.println("Calculated Tax is:    " + tax.getTaxAmountMarriedSeperate());
    }
    else{
      System.out.println("You entered Status:   " + tax.getStatus());
      System.out.println("You entered income:   " + tax.getIncome());
      System.out.println("As of:(Today's Date)  " + tax.getDate());
      System.out.println("Calculated Tax is:    " + tax.getTaxAmountHead());
    }
  }
}
