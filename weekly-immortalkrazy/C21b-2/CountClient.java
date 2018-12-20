import java.util.Scanner;
public class CountClient extends Count {
  private static String word;
  private static char ch;

  public static void main(String[] args) {
    try(Scanner kb = new Scanner(System.in))
    {
      // input from user
      System.out.print("Enter a string: ");
      word = kb.nextLine();

      System.out.print("Enter a character: ");
      ch = kb.nextLine().charAt(0);
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
    // send the variable to the method
    int times = count(word, ch);
    // print out the result
    System.out.println(ch + " appears " + times +
      (times > 1 ? " times " : " time ") + "in " + word);
  }

}
