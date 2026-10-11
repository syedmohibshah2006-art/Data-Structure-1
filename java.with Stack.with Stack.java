public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Add an element to the top
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    // Remove and return the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();                          // 30 20 10

        System.out.println("Peek: " + stack.peek());   // 30
        System.out.println("Popped: " + stack.pop());  // 30
        System.out.println("Size: " + stack.size());   // 2

        stack.display();                          // 20 10
    }
}