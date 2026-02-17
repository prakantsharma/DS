public class ArrayStack {

    static class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        // Constructor
        Stack(int size) {
            capacity = size;
            arr = new int[capacity];
            top = -1;
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Check if stack is full
        public boolean isFull() {
            return top == capacity - 1;
        }

        // Push operation
        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = data;
        }

        // Pop operation
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }

        // Display stack elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();
    }
}
