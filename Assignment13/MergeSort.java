package assignment.pkg13;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Reinier Sanders  s4335422
 * @author Laurens Kubat    s4626249
 */
public class MergeSort implements Runnable{
    /**
    * sort the given array in O(N log N) time
    * The array is split in two parts of equal size. 
    * These parts are sort recursively and merged.
    * @param array 
    */
    private int[][] halves;
    private int curHalf;
    private int min = 0;
    private int max = 1000;
    
    public void randomize(int[] array){
        for(int i = 0; i < array.length; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            array[i] = randomNum;
        }
    }
    
    public void multiSort(int [] array) {
        while(!isSorted(array)){
            if (array.length < 1000) {
                sort(array);
            } else {
                /* Fix this, array(s) get out of bounds, null pointer exception
                curHalf = 0;
                halves[curHalf] = Arrays.copyOf(array, array.length / 2);
                halves[curHalf + 1] = Arrays.copyOfRange(array, array.length / 2, array.length);
                Thread t1 = new Thread();
                Thread t2 = new Thread();
                t1.start();
                curHalf++;
                t2.start();
                merge(halves[curHalf + 2], halves[curHalf + 3], array);
                */
            }
        }
    }
    
    public static void sort(int [] array) {
    if (array.length > 1) {
      int [] firstHalf = Arrays.copyOf(array, array.length / 2);
      sort(firstHalf);
      int [] secondHalf = Arrays.copyOfRange(array, array.length / 2, array.length);
      sort(secondHalf);
      merge(firstHalf, secondHalf, array);
    }
  }
  /**
   * merge two sorted arrays: O(N)
   * @param part1 a sorted array
   * @param part2 a sorted array
   * @param dest  destination, length must be >= part1.length + part2.length
   */
  public static void merge(int [] part1, int [] part2, int dest[]) {
    int part1Index = 0, part2Index = 0, destIndex = 0;
    while (part1Index < part1.length && part2Index < part2.length) {
      if (part1[part1Index] < part2[part2Index])
        dest[destIndex ++] = part1[part1Index ++];
      else
        dest[destIndex ++] = part2[part2Index ++];
    }
    // copy elements when at most one of the parts contains elements
    while (part1Index < part1.length)
      dest[destIndex ++] = part1[part1Index ++];
    while (part2Index < part2.length)
      dest[destIndex ++] = part2[part2Index ++];
  }

  /**
   * simple check to see if array is nondecreasing
   * @param array
   * @return array is sorted
   */
  public static boolean isSorted(int [] array) {
    int current = array[0];
    for (int i: array) {
      if (i < current) {
        return false;
      } else {
        current = i;
      }
    }
    System.out.println("Array sorted!");
    return true;
  }

    @Override
    public void run() {
        sort(halves[curHalf]);
    }
}
