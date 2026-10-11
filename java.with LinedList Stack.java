public class LinkedListStack {

    // Node of the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;   // head of the list = top of the stack
    private int size;

    public LinkedListStack() {
        top = null;
        size = 0;
    }

    // Add an element on top (insert at head)
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Remove and return the top element (delete head)
    public int pop() {
        if (isEmpty()) {

            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    // Return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");

        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();                                // 30 20 10

        System.out.println("Peek: " + stack.peek());         // 30
        System.out.println("Popped: " + stack.pop());        // 30
        System.out.println("Size: " + stack.size());         // 2

        stack.display();                                // 20 10
    }
}