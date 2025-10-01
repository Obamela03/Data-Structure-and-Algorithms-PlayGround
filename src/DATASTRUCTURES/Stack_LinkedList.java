package DATASTRUCTURES;

public class Stack_LinkedList<T>
{
    private static class Node<T>
    {
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    // The top data point of a stack (variable)
    private Node<T> top;

    public Stack_LinkedList(){
        this.top = null;        //Stack is empty at first
    }

    //Pushing data points at the top of a stack
    public void push(T item)
    {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;     // The new node points to the current top
        top = newNode;          // New node becomes the top node of the stack
        System.out.println(item + " pushed.");
    }

    //Popping data point from the top of the stack
    public T pop() {
        if (isEmpty()){
            System.out.println("Stack is empty.");
            return null;
        }
        T item = top.data;
        top = top.next;
        System.out.println(item + "Popped.");
        return item;
    }

    //Peeking the top data point
    public T peek()
    {
        if(isEmpty()){
            System.out.println("The stack is empty.");
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return (top == null);
    }


}
