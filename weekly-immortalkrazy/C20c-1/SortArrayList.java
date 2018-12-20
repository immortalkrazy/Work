import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {
  public static void main(String[] args) {

    // Create an Integer ArrayList
    ArrayList<Integer> intList = new ArrayList<Integer>();
    intList.add(Integer.valueOf(2));
    intList.add(Integer.valueOf(4));
    intList.add(Integer.valueOf(3));
    intList.add(Integer.valueOf(7));

    // Create a Double ArrayList
    ArrayList<Double> doubleList = new ArrayList<Double>();
    doubleList.add(Double.valueOf(3.4));
    doubleList.add(Double.valueOf(1.3));
    doubleList.add(Double.valueOf(-22.1));

    // Create a Character array
    Character[] charArray = {
      Character.valueOf('a'), Character.valueOf('J'), Character.valueOf('r')
    };

    // Create a String array
    String[] stringArray = {"Tom", "John", "Fred"};

    // Sort the arrays
//    Arrays.sort(intArray);
//    Arrays.sort(doubleArray);
    // Arrays.sort(charArray);
    // Arrays.sort(stringArray);

//     // Display the sorted arrays
//     System.out.print("Sorted Integer objects: ");
// //    printList(intArray);
//     System.out.print("Sorted Double objects: ");
// //    printList(doubleArray);
//     System.out.print("Sorted Character objects: ");
//     printList(charArray);
//     System.out.print("Sorted String objects: ");
//     printList(stringArray);
    // Integer array
    System.out.print("\nSorted Integer objects: ");
    System.out.println();
    printArrayList(intList);
    Collections.sort(intList);
    System.out.println();
    printArrayList(intList);
    // Double array
    System.out.print("\nSorted Double objects: ");
    System.out.println();
    printDoubleArrayList(doubleList);
    Collections.sort(doubleList);
    System.out.println();
    printDoubleArrayList(doubleList);
  }// End of main

  /** Print an array of objects */
  public static void printList(Object[] list) {
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
    System.out.println();
  }
  public static void printArrayList(ArrayList<Integer> intList){
    for (Integer i : intList)
    System.out.print(i + " ");
  }
  public static void printDoubleArrayList(ArrayList<Double> doubleList){
    for (Double d : doubleList)
    System.out.print(d + " ");
  }
}
