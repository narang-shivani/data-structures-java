package sortingAlgos;

import java.util.Arrays;

public class InsertionSort {
    /**Insertion sort is a sorting algorithm that works similar to the way you sort playing cards in your hands.
    The array is virtually split into a sorted and an unsorted part.
    Values from the unsorted part are picked and placed at the correct position in the sorted part.*/
    public static void main(String[] args)
    {
        int[] input = {12,11,13,5,6};
        System.out.println("Original array: " + Arrays.toString(input));
        insertionSort(input);
    }
    static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) //start picking elements from second position i.e. compare right number with left
        {
            int currentElement = arr[i];
            int j = i-1; //loop over all the elements before current element
            while (j >= 0 && currentElement < arr[j]) //keep swapping till number on right is greater than number on left
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentElement; //set current element into the right place i.e. at j+1.
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
