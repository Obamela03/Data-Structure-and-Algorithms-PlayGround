package SEARCHING;

public class LinearSearch
{
    public static int linearSearch(int [] array, int target)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array [i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main (String[]args)
    {
        int[] numbers = {5, 12, 9, 3, 18, 7};
        int index = linearSearch(numbers, 18);
        System.out.println(index);          //Prints the index of the target value if found
    }
}
