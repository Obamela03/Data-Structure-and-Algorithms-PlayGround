package SORTING;

public class QuickSort
{

    public static void quickSort(int [] list){
        quickSort(list, 0, list.length - 1);
    }

    public static void quickSort(int[] list, int first, int last){
        if (last > first){
            int pivotIndex;
        }
    }

    //Partition the array list
    public static int partition(int[] list, int first, int last){
        int pivot = list[first];            //choose the first element as pivot
        int low = first + 1;                //Index for forward searching
        int high = last;                    //index for backward searching

        while(high > low){
            //search forward from left
            while(low <= high && list[low] <= pivot)
                low++;

            // Search backward from right
            while (low <= high && list[high] > pivot)
                high--;

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
}
