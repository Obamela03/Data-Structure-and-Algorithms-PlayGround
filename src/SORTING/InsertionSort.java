package SORTING;

public class InsertionSort
{
    public static void insertionSort(int[]list)
    {
        int m = list.length;
        for (int i = 1; i < m; i++){
            int currentElement = list[i];
            int j;
            for(j = i - 1; j >= 0 && list[j] > currentElement; j--){
                list[j+1] = list[j];
            }
            list[j + 1] = currentElement;
        }
    }
}
