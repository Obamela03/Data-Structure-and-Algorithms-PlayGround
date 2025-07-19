package SORTING;

public class SelectionSort
{
    public static void selectionSort(int [] list)
    {
        int m = list.length;
        for (int i = m - 1; i > 0; i--){
            //Find the maximum value in the list
            int currentMax = list[0];
            int currentMaxIndex = 0;

            for (int j = 1; j <= i; j++){
                if (currentMax < list[j]){
                    currentMaxIndex = j;
                }
            }

            //swapping
            if (currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
