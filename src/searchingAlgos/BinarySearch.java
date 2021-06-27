package searchingAlgos;

public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 10, 40, 50};
//        int[] arr = {2};
        int elementToFind = 4;
        int index = binarySearch(arr, elementToFind, 0, arr.length-1);
        if (index == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at: " + index);
        }
    }

    static int binarySearch(int[] arr, int elementToFind, int firstIndex, int lastIndex)
    {
        if (firstIndex == lastIndex) {
            return arr[firstIndex] == elementToFind ? firstIndex : -1;
        }
        int middleIndex;
        if (lastIndex-firstIndex % 2 == 0)
        {
            middleIndex = (lastIndex-firstIndex / 2) + firstIndex;
        }
        else
        {
            middleIndex = ((lastIndex-firstIndex + 1) / 2) + firstIndex;
        }

        if (arr[middleIndex] == elementToFind)
        {
            return middleIndex;
        }
        else if (elementToFind < arr[middleIndex])
        {
            return binarySearch(arr, elementToFind, firstIndex, middleIndex-1);
        }
        else
        {
            return binarySearch(arr, elementToFind, middleIndex, lastIndex);
        }
    }
}
