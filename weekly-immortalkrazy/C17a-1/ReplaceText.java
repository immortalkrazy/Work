/**
 * From Chapter 12 in Liang Y Daniel, Introduction to Java Programming, 11st Edition
 */

/**
 * the ReplaceText class demonstrates reading text from a file using Scanner
 * and writing text to a text file using PrintWriter
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NullPointerException;

public class ReplaceText {
  public static void main(String[] args){
    Scanner input = null;
    PrintWriter output = null;
    // Check command line parameter usage
    try{
      if (args.length != 4) {
        System.out.println(
          "Usage: java ReplaceText sourceFile targetFile oldStr newStr");
        System.exit(1);
      }
      // Check if source file exists
      File sourceFile = new File(args[0]);
//      if (!sourceFile.exists()) {
//        System.out.println("Source file " + args[0] + " does not exist");
//        System.exit(2);
//      }
      // Check if target file exists
      File targetFile = new File(args[1]);
      if (targetFile.exists()) {
        System.out.println("Target file " + args[1] + " already exists");
        System.exit(3);
      }
      input = new Scanner(sourceFile);
      output = new PrintWriter(targetFile);

      while (input.hasNext()) {
        String s1 = input.nextLine();
        String s2 = s1.replaceAll(args[2], args[3]);
        output.println(s2);
      }
    }// end of try
      catch(NullPointerException e){
        System.out.println("Source file " + args[0] + " does not exist");
      }
      catch(InputMismatchException e){
        System.out.println(" You should be entering alphabets");
      }
      catch(Exception e){
        System.out.println(e.getStackTrace());
      }
    finally{
      if(input != null){
        input.close();
      }
      if(output != null){
        output.close();
      }
    }
  }//end of main
}//end of class
