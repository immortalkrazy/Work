import java.util.*;
import java.io.*;
public class TestFile{
  public static void main(String[]args){
    File file = new File("hello.txt");
    System.out.println("Exists? " + file.exists());
    System.out.println("Read  ? " + file.canRead());
    System.out.println("Write ? " + file.canWrite());
    System.out.println("isFile? " + file.isFile());
    System.out.println("Exists? " + new Date(file.lastModified()));
  }
}
