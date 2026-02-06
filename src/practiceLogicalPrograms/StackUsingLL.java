package practiceLogicalPrograms;

import java.util.Scanner;

class StackLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(top.data + " popped from stack");
            top = top.next;
        }
    }

    // Peek operation
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLinkedList s = new StackLinkedList();

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

