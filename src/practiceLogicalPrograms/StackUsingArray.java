package practiceLogicalPrograms;
import java.util.*;

public class StackUsingArray {
	    int stack[];
	    int top;
	    int size;

	    StackUsingArray(int size) {
	        this.size = size;
	        stack = new int[size];
	        top = -1;
	    }

	    // Push operation
	    void push(int data) {
	        if (top == size - 1) {
	            System.out.println("Stack Overflow");
	        } else {
	            stack[++top] = data;
	            System.out.println(data + " pushed into stack");
	        }
	    }

	    // Pop operation
	    void pop() {
	        if (top == -1) {
	            System.out.println("Stack Underflow");
	        } else {
	            System.out.println(stack[top--] + " popped from stack");
	        }
	    }

	    // Peek operation
	    void peek() {
	        if (top == -1) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println("Top element: " + stack[top]);
	        }
	    }

	    // Display stack
	    void display() {
	        if (top == -1) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.print("Stack elements: ");
	            for (int i = top; i >= 0; i--) {
	                System.out.print(stack[i] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter stack size: ");
	        int size = sc.nextInt();

	        StackUsingArray s = new StackUsingArray(size);

	        while (true) {
	            System.out.println("\n1.Push  2.Pop  3.Peek  4.Display  5.Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element: ");
	                    s.push(sc.nextInt());
	                    break;
	                case 2:
	                    s.pop();
	                    break;
	                case 3:
	                    s.peek();
	                    break;
	                case 4:
	                    s.display();
	                    break;
	                case 5:
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }
}
