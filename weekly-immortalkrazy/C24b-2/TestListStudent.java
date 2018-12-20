import java.util.Iterator;
//import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestListStudent  {
  public static void main(String[] args) {
    TestListStudent test = new TestListStudent();

    final int size = 5;

    System.out.println("\n-------ArrayList----------");
    ArrayList<Student> studentArrayList = new ArrayList<Student>();
    test.makeRandomStudentList(studentArrayList, size);
    test.printList(studentArrayList);

    test.useIterator(studentArrayList);
//    test.updateRandomStudent(studentArrayList, "John", "Doe");

    System.out.println("-----After Using Iterator--------");
    test.printList(studentArrayList);

    System.out.println("\n\n-------LinkedList----------");
    LinkedList<Student> studentLinkedList = new LinkedList<Student>();
    test.makeRandomStudentList(studentLinkedList, size);
    test.printList(studentLinkedList);

    test.useIterator(studentLinkedList);
//    test.updateRandomStudent(studentLinkedList, "John", "Doe");

    System.out.println("------After Using Iterator--------");
    test.printList(studentLinkedList);

//  test.useIterator(studentArrayList);
  }// end of main

  private void updateRandomStudent(List<Student> list, String firstName, String lastName) {
    Random rng = new Random();
    int index = rng.nextInt(list.size());
    Student s = list.get(index);

    s.setFirstName(firstName);
    s.setLastName(lastName);
  }

  private List<Student> makeRandomStudentList(List<Student> list, int size) {
    Random rng = new Random();
    for (int i=0; i<size; i++) {
      String firstName = String.valueOf((char)('A' + rng.nextInt(26)));
      String lastName = String.valueOf((char)('A' + rng.nextInt(26)));
      double gpa = rng.nextDouble() * 4.0;
      Student s = new Student(i, firstName, lastName, gpa);
      list.add(s);
    }
    return list;
  }

  private void printList(List<Student> list) {
    for(Student s: list) {
      System.out.println(s.toString());
    }
  }

  public void useIterator(List<Student> list){
    Iterator<Student> iterator = list.iterator();
    while(iterator.hasNext()) {
      Student next = iterator.next();
      if ((next.getFirstName()).equals("J")){
        changeName(next);
      }
    }
  }
  public void changeName(Student o){
    o.setFirstName("John");
  }

}
