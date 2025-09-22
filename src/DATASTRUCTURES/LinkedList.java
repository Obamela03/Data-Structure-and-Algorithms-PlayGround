package DATASTRUCTURES;

public class LinkedList
{
    static class Node
    {
        int data;
        Node next;

        //Constructor
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    Node head;

    // Insertion method
    public static LinkedList insert(LinkedList list, int data)
    {
        //node with new data
        Node new_node = new Node(data);

        // Make new node head if List is empty else traverse the list to the tail
        if (list.head == null)
        {
            list.head = new_node;
        }else{
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;       //Insertion at the tail
        }
        return list;
    }

    // Display the list
    public static void displayList(LinkedList list)
    {
        Node current = list.head;

        System.out.println("Linked List: ");

        while (current != null)
        {
            System.out.print(current.data + " | ");
            current = current.next;
        }
    }

    /*
    * Deletion methods
    *
    */

    // 1. Delete by key

    // 2. Delete using position

    // Main method
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        displayList(list);
    }
}