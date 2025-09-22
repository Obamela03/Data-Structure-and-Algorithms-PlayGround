package SEARCHING;

public class BinarySearch
{
    public static int binarySearch(int [] array, int target)
    {
        int low = 0;
        int high = array.length - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;          //NOT FOUND
    }

    public static void main(String[]args)
    {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int index = binarySearch(sortedArray, 8);
        System.out.println(index);              //Prints the index of the  target value if it is found.
    }
}
