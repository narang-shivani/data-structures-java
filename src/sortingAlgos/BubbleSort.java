package sortingAlgos;

/*Bubble Sort is the sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Sorting starts from right end.
Complexity: O(n)
*/

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args)
    {
        int input[] = {50, 10, 40, 10, 30};
        System.out.println("Original array: " + Arrays.toString(input));
        bubbleSort(input);
    }
    static void bubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) //subtracted i because elements on the right would start getting sorted with each iteration
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if (!swapped) //This means that no 2 items were swapped in last iteration, which indicates that array is sorted
            {
                break;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
