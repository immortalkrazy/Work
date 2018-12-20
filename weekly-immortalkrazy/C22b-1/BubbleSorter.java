import java.util.Arrays;

public class BubbleSorter {
  public static void main(String[] args) {
    // Create an Integer array
    Integer[] intArray = {
      Integer.valueOf(9), Integer.valueOf(4),  Integer.valueOf(3),
      Integer.valueOf(8), Integer.valueOf(5),  Integer.valueOf(2)
    };

    // Create a Double array
    Double[] doubleArray = {
      Double.valueOf(3.4), Double.valueOf(1.3), Double.valueOf(-22.1),
      Double.valueOf(5.5), Double.valueOf(2.0), Double.valueOf(7.6)
    };

    // Create a Character array
    Character[] charArray = {
      Character.valueOf('a'), Character.valueOf('J'), Character.valueOf('r'),
      Character.valueOf('A'), Character.valueOf('b'), Character.valueOf('z')
    };

    // Create a String array
    String[] stringArray = {"Tom", "John", "Fred", "Adam", "Paul", "Kiwi"};

    // Sort the arrays
    // sort(intArray);
    // sort(doubleArray);
    // sort(charArray);
    // sort(stringArray);

    // bubble sort the arrays
    bSort(intArray, intArray.length);
    bSort(doubleArray, doubleArray.length);
    bSort(charArray, charArray.length);
    bSort(stringArray, stringArray.length);

    // Display the sorted arrays
    System.out.print("Sorted Integer objects: ");
    printList(intArray);
    System.out.print("Sorted Double objects: ");
    printList(doubleArray);
    System.out.print("Sorted Character objects: ");
    printList(charArray);
    System.out.print("Sorted String objects: ");
    printList(stringArray);
  }

  /** Sort an array of comparable objects using the Bubble sort algorithm */
  public static void sort(Comparable[] list) {
    Comparable currentMin;
    int currentMinIndex;

    // select subarray (the range of the array) where we bubble up the greatest in the subarray
    for (int i = 0; i < list.length - 1; i++) {
      // bubble up the greast in the subarray (in the range of the array)
      for (int j=0; j <list.length - i - 1; j++) {
        if (list[j].compareTo(list[j+1]) > 0) {
          Comparable tmp = list[j];
          list[j] = list[j+1];
          list[j+1] = tmp;
        }
      }
    }
  }

  /** Print an array of objects */
  public static void printList(Object[] list) {
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
    System.out.println();
  }
  // buuble sorte
  public static void bSort(Comparable[] list, int n){
    if (n ==1){
      return;
    }
    else{
      for(int i = 0; i < n-1; i++){
        if(list[i].compareTo(list[i+1]) > 0){
          Comparable temp = list[i];
          list[i] = list[i+1];
          list[i+1] = temp;
        }
      }
      bSort(list, n-1);
    }
  }


}// end of class
