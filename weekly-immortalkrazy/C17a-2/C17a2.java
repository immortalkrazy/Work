import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.*;
import java.util.*;

public class C17a2{
  public static void main(String[]args)throws Exception{
    
    // confirm the argument length
    if (args.length != 2) {
      System.out.println("Usage: java filename name");
      System.exit(1);
    }
    File filename = null;
    Scanner input = null;
    PrintWriter pw = null;
    ArrayList <String> list;

    try{
      filename = new File(args[0]);
      if(!filename.exists()){

      }
      // create an arraylist of names as Strings
      list = new ArrayList<String>();
      input = new Scanner(filename = new File (args[0]));
      while (input.hasNext()){
        list.add(input.next());
      }
      // remove matching strings from ArrayList
      for (int i = 0; i < list.size(); i++){
        if (list.get(i).equals(args[1])){
          list.remove(i);
        }
      }
      // delete the old file
      if(filename.exists()){
        filename.delete();
      }
      // create printwriter and write a new file
      pw = new PrintWriter(filename);
      if(filename.exists()){
        for (int i = 0; i < list.size(); i++){
          pw.println(list.get(i));
        }
      }
    }//end of try
    catch(FileNotFoundException e){
      System.out.println("File " + filename + " does not exist");
      System.out.println(e.getMessage());
    }
    catch(InputMismatchException e){
      System.out.println("File " + filename + " is not in correct Format");
      System.out.println(e.getMessage());
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
    // close resources
    finally{
      if (input != null){
        input.close();
      }
      if (pw != null){
        pw.close();
      }
    }
    System.out.println("\n\tTask Completed");
  }//end of main
}//end of class
