package assignment13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import assignment13.MergeSort;
import java.util.Random;

/**
 *
 * @author Laurens
 */
public class MergeSortTest {
    
    public static void main(String[] args) {
        int[] data = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10000);
        }
        MultiMergeSort merge = new MultiMergeSort();
        merge.multiMergeSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }        
    }
    
}
