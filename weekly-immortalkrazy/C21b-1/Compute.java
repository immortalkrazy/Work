import java.util.Scanner;
public class Compute {
  public static void main(String[] args) {

    // take the user input
    Scanner kb = new Scanner(System.in);
    System.out.println("please eneter an integer number:");
    int number =  kb.nextInt();

    System.out.println("Your answer for " + number + " is " + m(number));
  }// end of main

  public static double m(int num) {
    //base case
    if (num == 1)
      return 1;

      //recursion
    else{
      return m(num - 1) + 1.0 / num;
    }
  }

}// end of class
