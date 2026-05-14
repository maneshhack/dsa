public class Stacks {

    int top = -1;
    int size = 5;

    int[] arr = new int[size];

    void push(int data) {

        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = data;
    }

    void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(arr[top] + " popped");

        top--;
    }

    void peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top Element: " + arr[top]);
    }

    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();

        s.display();
    }
}