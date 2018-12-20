//import java.util.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SortCircle {
  public static void main(String[] args) {
    ArrayList<ComparableCircle> listCircles = new ArrayList<>();

      listCircles.add(new ComparableCircle(5));
      listCircles.add(new ComparableCircle(4));
      listCircles.add(new ComparableCircle(7));
      listCircles.add(new ComparableCircle(9));

    System.out.println("Before Sorting");
    printList(listCircles);

    Collections.sort(listCircles);

    System.out.println("After Sorting");
    printList(listCircles);
  }//end of main

  public static void printList(ArrayList <ComparableCircle> listCircle){
    for (int i = 0; i < listCircle.size(); i++){
      System.out.println(listCircle.get(i)+ " ");
    }
  }

}
