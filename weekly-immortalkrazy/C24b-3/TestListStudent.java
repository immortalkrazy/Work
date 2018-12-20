import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class TestListStudent{
  public static void main(String []args)throws ClassCastException{
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the firstname you want to search:  ");
    String key = sc.next();

    TestListStudent test = new TestListStudent();
    //specify the size of arraylist
    final int size = 5;
    ArrayList<Student> arraylist =
      (ArrayList<Student>)test.makeRandonStudentList(new ArrayList<Student>(), size);
    LinkedList<Student> linkedlist =
      (LinkedList<Student>)test.makeRandonStudentList(new LinkedList<Student>(), size);

  //  test.binarySearch(arraylist, key);
      int index=Collections.binarySearch(arraylist,key,Collections.reverseOrder());
      System.out.println("found at index "+index);

    // print arraylist before doing anything
    test.printList(arraylist);
    // sort the array by first name
    Collections.sort(arraylist, new SortByFirstName());
    System.out.println("----------------");
    // print arraylist again after sorting by first name
    test.printList(arraylist);
    // sort the array by last lastName
    Collections.sort(arraylist, new SortByLastName());
    System.out.println("----------------");
    // print the arraylist again again after sorting
    test.printList(arraylist);

  }// end of main

  // create random arraylist or linderlist
  private List<Student> makeRandonStudentList(List<Student> list, int size){
    Random rng = new Random();
    for (int i = 0; i < size; i++){
      String firstName = String.valueOf((char)('A' + rng.nextInt(26)));
      String lastName = String.valueOf((char)('A' + rng.nextInt(26)));
      double gpa = rng.nextDouble() * 4.0;
      Student s = new Student(i, firstName, lastName, gpa);
      list.add(s);
    }
    return list;
  }
  // print List
  private void printList(List<Student> list){
    for (Student s: list){
      System.out.println(s);
    }
  }
  public static int binarySearch(List<Student> list, String key) {
    return binarySearchHelper(list, 0, list.length -1, key);
  }

  public static int binarySearchHelper(List<Student> list, int beginIndex, int endIndex, String key) {
    int midIndex = (endIndex + beginIndex) / 2;
    // base case: a) if match the middle value, we found it
    // base case: b) if the length of the subarray becomes 1, we stop
    if (endIndex - beginIndex + 1 < 1) return -1;

    if (endIndex - beginIndex + 1 == 1) {
      if (list.get(beginIndex).getLastName().equals(key)) return beginIndex;
      else return -1;
    }

    if (list.get(midIndex).getLastName().equals(key)) return midIndex;


    // two halves
    // compare key with the middle
    if (key.compareTo(list.get(midIndex).getLastName()) <= 1) {
      // 1st half: numbers: beginIndex to midIndex
      return binarySearchHelper(list, beginIndex, midIndex, key);
    } else {
      // 2nd half: numbers: midIndex + 1 to endIndex
      return binarySearchHelper(list, midIndex + 1, endIndex, key);
    }
  }


}
