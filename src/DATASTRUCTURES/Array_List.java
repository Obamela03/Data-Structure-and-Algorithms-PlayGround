package DATASTRUCTURES;

public class Array_List<E>
{
    private static int MAX_CAPACITY = 100;
    private E[] data;
    private static int size, result;

    //
    public Array_List()
    {
        data = (E[]) new Object[MAX_CAPACITY];
        size = 0;
    }

    // Add an element to the array list
    public void add(int index, E e)
    {
        // Ensure the index is within the list range
        checkIndex(index);

        // Move the elements to the right after specified index
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];

        // Insert new element to data[index] and increase size by 1
        data[index] = e;
        size++;
    }

    //check if an element exist in the list
    public boolean contains(Object e)
    {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;
        return false;
    }

    // Return an element in a specific index
    public E get(int index)
    {
        checkIndex(index);

        return data[index];
    }

    // Remove an element and close the gap
    public E remove(int index)
    {
        checkIndex(index);

        E e = data[index];
        data[size - 1] = null;
        size--;
        return e;
    }

    // Confirming if an index out is bound
    public void checkIndex(int index)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index = " + index + "; Size = " + size);
    }

    // Replace an element in a specified array
    public E set(int index, E e)
    {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    //Destroy array
    public void clear()
    {
        size = 0;
    }

    //return size of array
    public int getSize() {
        return size;
    }

    // merge two arrays
    public Array_List<E> merge(Array_List<E> param)
    {
        int i=0; //counter in calling array
        int j=0; // counter in param array
        int k=0; // counter in return array
        Array_List<E> returnArray = new Array_List<>();

        if (this.getSize() ==0) // same as if (size==0)
            return param;
        if (param.getSize()==0)
            return this;
        if ((this.getSize()+ param.getSize()) > MAX_CAPACITY)
            throw new IndexOutOfBoundsException
                    ("Combined list out of bounds");

        // traverse both list until one list is completely done
        while (i<this.getSize() && j<param.getSize())
        {
            // Compare single value from each list and copy smallest into result
            if (((Comparable)data[i]).compareTo(param.data[j]) <0)
            {
                returnArray.data[k]= this.data[i];
                k++;
                i++;
            }
            else
            {
                returnArray.data[k]=param.data[j];
                k++;
                j++;
            }
        }

        // copy remainder of the array
        if (i < this.getSize())
        {
            for (i=i;i<getSize();i++) //for starts at current position
            {
                returnArray.data[k]= this.data[i];
                k++;
            }
        }
        if (j < param.getSize())
        {
            for (j=j;j<param.getSize();j++)
            {
                returnArray.data[k]=param.data[j];
                k++;
            }
        }
        returnArray.size = k; // set size of return array
        return returnArray;
    }

    //print formating
    public String toString() {
        String result="[";
        for (int i = 0; i < size; i++) {
            result+= data[i];
            if (i < size - 1) result+=", ";
        }
        return result.toString() + "]";
    }


    //sort an array
    public boolean sortList() {
        E hold;
        for (int i = 0; i < size-1; i++)
        {
            for (int j = 0; j<size-1; j++)
            {
                if(((Comparable)data[j]).compareTo(data[j+1])>0)
                {
                    hold= data[j+1];
                    data[j+1]=data[j];
                    data[j]=hold;
                }
            }
        }
        return true;
    }

    public static void main(String [] args) {

//A concrete type is specified to replace E when creating an ArrayList object.

        Array_List<Integer> list = new Array_List<>();

        // Add elements to the list six elements
        System.out.println("\nTEST 1: Add lists of Integers");
        list.add(0,3);
        list.add(1,1);
        list.add(2,0);
        list.add(3,10);
        list.add(4,16);
        list.add(5,2);

        System.out.println(list);
        if (list.sortList())
            System.out.println(list);
        System.out.println(list.getSize());


        System.out.println("\nTEST 2: Remove List Items");
        list.remove(0);
        list.remove(1);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.getSize());


        Array_List<String> list1 = new Array_List<>();
        Array_List<String> list2 = new Array_List<>();
        Array_List<String> list3 = new Array_List<>();

// Add elements to the list six elements

        System.out.println("\nTEST 3: Add Countries Name");
        list1.add(0,new String("America"));
        list1.add(1,new String("Canada"));
        list1.add(2,new String("Russia"));
        list1.add(3,new String("France"));
        list1.add(4,new String("Germany"));
        list1.add(5,new String("Norway"));

        System.out.println("\nTEST 3: Add Province Name");
        list2.add(0,new String("Gauteng"));
        list2.add(1,new String("Limpopo"));
        list2.add(2,new String("Western Cape"));
        list2.add(3,new String("Kwazulu Nata"));
        list2.add(4,new String("Mpumalanga"));
        list2.add(5,new String("North West"));

        System.out.println(list1);
        if (list1.sortList())
            System.out.println(list1);
        System.out.println(list1.getSize());


        System.out.println(list2);
        if (list2.sortList())
            System.out.println(list2);
        System.out.println(list2.getSize());

        System.out.println("\nTEST 4: Merge list");
        list3=list1.merge(list2);

        System.out.println("list3 = " + list3);


        System.out.println("\nTEST 5: Remove Countries Name");
        list1.remove(0);
        System.out.println(list1.get(0) + "" + "is removed");
        list1.remove(1);
        System.out.println(list1.get(1) + "" + "is removed");
        System.out.println(list1);
        list1.set(0,"South Africa");
        System.out.println(list1);
        System.out.println(list1.getSize());

        list1.clear();

//System.out.println(list1);
        System.out.println(list1.getSize());


    }
}

