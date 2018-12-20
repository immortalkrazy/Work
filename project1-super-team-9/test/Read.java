import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
public class Read{
  public static void main(String[]args)throws Exception{
    File file = new File("directory.txt");
    Scanner in = new Scanner(file);

    while (in.hasNext()){
      String s = in.next();
      System.out.println(s);
    }
    }
  }
