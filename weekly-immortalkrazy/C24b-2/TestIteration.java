import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Random;

public class TestIteration {
  public static void main(String[] args) {
    TestIteration test = new TestIteration();

    final int size = 5;
    final int max = 50;

    // create a very large ArrayList
    ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    test.makeRandomList(intArrayList, size, max);

    // create a very large LinkedList
    LinkedList<Integer> intLinkedList = new LinkedList<Integer>();
    test.makeRandomList(intLinkedList, size, max);

    //iterate the ArrayList
    test.iterateList(intArrayList);
  }

  private <T> void iterateList(List<T> list) {
    System.out.println ("Use for loop: ");

    // use for loop
    for (int i=0; i<list.size(); i++) {
        System.out.println("list[" + i + "] = " + list.get(i));
    }

    System.out.println ("Use the enhanced for loop: ");

    // use the enhanced for loop
    for (T t: list) {
      System.out.println(t);
    }

    System.out.println ("Use Iterator: ");
    // use Iterator
    Iterator<T> iter = list.iterator();
    while(iter.hasNext()) {
      T t = iter.next();
      System.out.println(t);
    }

    System.out.println ("Use ListIterator in reverse order: ");
    ListIterator<T> listIter = list.listIterator(list.size());
    while(listIter.hasPrevious()) {
      T t = listIter.previous();
      System.out.println(t);
    }
  }

  private List<Integer> makeRandomList(List<Integer> list, int size, int max) {
    Random rng = new Random();
    for (int i=0; i<size; i++) {
      Integer n = rng.nextInt(max); // a random integer in [0, max)
      list.add(n);
    }
    return list;
  }
}
