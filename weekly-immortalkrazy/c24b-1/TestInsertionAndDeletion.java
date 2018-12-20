import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class TestInsertionAndDeletion{
  public static void main (String[]args){

    TestInsertionAndDeletion test = new TestInsertionAndDeletion();

    final int listSize = 100000;
    final int max = 500000;
    // create an ArrayList of many objects
    ArrayList<Integer> intArrayList =  new ArrayList<Integer>();
    test.populateRandomList(intArrayList, listSize, max);
    // create a LinkedList of many objects
    LinkedList<Integer> intLinkedList = new LinkedList<Integer>();
    test.populateRandomList(intLinkedList, listSize, max);

    int nTimes = 1000;

    System.out.println("\n----------INSERTIONS at Index 0----------");
    // do many insertions in ArrayList and measure the time
    test.doManyInsertionsOnList(intArrayList, nTimes);
    // do many insertions in LinkedList and measure the time
    test.doManyInsertionsOnList(intLinkedList, nTimes);

    System.out.println("\n----------INSERTIONS at Random Index----------");
    // do many insertions in ArrayList and measure the time
    test.doManyInsertionsOnListAtRandomLocation(intArrayList, nTimes);
    // do many insertions in LinkedList and measure the time
    test.doManyInsertionsOnListAtRandomLocation(intLinkedList, nTimes);


    System.out.println("\n----------DELETIONS AT Index 0----------");
    // do many deletion in arralist and measure the time
    test.doManyDeletionsOnListAt0(intArrayList, nTimes);
    // do many deletions in the LinkedList and measure the Time
    test.doManyDeletionsOnListAt0(intLinkedList, nTimes);

    System.out.println("\n----------DELETIONS AT Random Index----------");
    // do many deletion in arralist and measure the time random Index
    test.doManyDeletionsOnListAtRandom(intArrayList, nTimes);
    // do many deletions in the LinkedList and measure the Time Random index
    test.doManyDeletionsOnListAtRandom(intLinkedList, nTimes);

  }// end of main

  // populate any kind of list with random numbers
  private List<Integer> populateRandomList(List<Integer> list, int listSize, int max){
    Random rng = new Random();
    for (int i = 0; i < listSize; i++){
      Integer n = rng.nextInt(max);
      list.add(n);
    }
    return list;
  }

  // insertions on list
  private <T> void doManyInsertionsOnList(List<T> list, int nTimes){
    T t = list.get(0);
    long startTime = System.nanoTime();
    for (int i = 0; i < nTimes; i++){
      list.add(0, t);
    }
    long endTime = System.nanoTime();
    System.out.println("Time to do insertions " + nTimes + " in " + list.getClass().getName() +
                       " is " + (endTime - startTime));
  }
  // Insertin at Random Location of the List
  private <T> void doManyInsertionsOnListAtRandomLocation(List<T> list, int nTimes){
    T t = list.get(0);
    Random rng = new Random();
    long startTime = System.nanoTime();
    for (int pass = 0; pass < nTimes; pass++){
      int index = rng.nextInt(list.size());
      list.add(index, t);
    }
    long endTime = System.nanoTime();
    System.out.println("Time to do deletion " + nTimes + " in " + list.getClass().getName() +
                       " at random index is " + (endTime - startTime));
  }

  // Deletion at index 0 of the list
  private <T> void doManyDeletionsOnListAt0(List<T> list, int nTimes){
    int index = 0;
    long startTime = System.nanoTime();
    for (int i = 0; i < nTimes; i++){
      list.remove(index);
    }
    long endTime = System.nanoTime();
    System.out.println("Time to do deletion " + nTimes + " in " + list.getClass().getName() +
                       " at index " + index + " is " + (endTime - startTime));
  }
  // Deletion at Random Location of the List
  private <T> void doManyDeletionsOnListAtRandom(List<T> list, int nTimes){
    Random rng = new Random();
    long startTime = System.nanoTime();
    for (int pass = 0; pass < nTimes; pass++){
      int index = rng.nextInt(list.size());
      list.remove(index);
    }
    long endTime = System.nanoTime();
    System.out.println("Time to do deletion " + nTimes + " in " + list.getClass().getName() +
                       " at random index is " + (endTime - startTime));
  }

}// end of class

/*  Observations:
                Insertion and deletion at the specific index, which is 0 in my
                program there is a big difference in time taken by ArrayList and
                LinkedList.
                1. If the specific index is 0 LinkedList takes way too less Time
                2. I tried changing the index to 1000, still specified index but
                   the time gap was significantly low or I can say rather high
                   for LinkedList.
                3. Same thing with the deletion. Deletion at index 0, LinkedList
                   takes less time but if the index is changed to 1000 tiem gap
                   is low and if random index is chosen time gap is very low.
*/
