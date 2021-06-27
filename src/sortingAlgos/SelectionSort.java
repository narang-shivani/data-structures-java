package sortingAlgos;
import java.util.Arrays;

public class SelectionSort {
    /*
    The selection sort algorithm sorts an array by repeatedly finding the minimum element and putting it at the beginning.
    The algorithm maintains two subarrays in a given array, sorted array(on left) and unsorted array(on right).
    In every iteration of selection sort, the minimum element from the unsorted subarray is picked and moved to the sorted subarray.
     */
    public static void main(String[] args)
    {
        int input[] = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(input));
        selectionSort(input);
    }
    static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int min_index = i; //selection sort plays on index instead of value; this tells index of element with minimum value
            for (int j = i+1; j < arr.length ; j++)
            {
                if (arr[j] < arr[min_index])
                {
                    min_index = j;
                }
            }
            //swap
            int temp =  arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
            System.out.println(i + ": Sorted array: " + Arrays.toString(arr));
        }
    }
}
