package SORTING;

public class BubbleSort
{
    public static void bubblesort(String [] list)
    {
        boolean needNextPass = true;

        for (int i = 1; i < list.length; i++){
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++){
                //swapping
                String temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;

                needNextPass = true;
            }
        }
    }
}
