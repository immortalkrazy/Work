import java.util.Random;
import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    int[] numbers = makeRandomArray(10);
    Arrays.sort(numbers);
    printArray(numbers);


    Random rng = new Random();
    int key = rng.nextInt(10);
    System.out.println("The key to look for is " + key);

    int index = binarySearch(numbers, key);
    if (index < 0) {
      System.out.println("The key " + key + " isn't found.");
    } else {
      System.out.println("The key is at index " + index);
    }

  }

  public static int binarySearch(int[] numbers, int key) {
    return binarySearchHelper(numbers, 0, numbers.length-1, key);
  }

  public static int binarySearchHelper(int[] numbers, int beginIndex, int endIndex, int key) {
    int midIndex = (endIndex + beginIndex) / 2;
    // base case: a) if match the middle value, we found it
    // base case: b) if the length of the subarray becomes 1, we stop
    if (endIndex - beginIndex + 1 < 1) return -1;

    if (endIndex - beginIndex + 1 == 1) {
      if (numbers[beginIndex] == key) return beginIndex;
      else return -1;
    }

    if (numbers[midIndex] == key) return midIndex;


    // two halves
    // compare key with the middle
    if (key <= numbers[midIndex]) {
      // 1st half: numbers: beginIndex to midIndex
      return binarySearchHelper(numbers, beginIndex, midIndex, key);
    } else {
      // 2nd half: numbers: midIndex + 1 to endIndex
      return binarySearchHelper(numbers, midIndex + 1, endIndex, key);
    }
  }

  private static int[] makeRandomArray(int size) {
    Random rng = new Random();
    int[] numbers = new int[size];
    for (int i=0; i<size; i++) {
      numbers[i] = rng.nextInt(10);
    }
    return numbers;
  }

  private static void printArray(int[] numbers) {
    for(int i=0; i<numbers.length; i++) {
      System.out.println("numbers[" + i + "] = " + numbers[i]);
    }
  }

}
