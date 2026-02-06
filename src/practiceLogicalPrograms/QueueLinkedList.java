package practiceLogicalPrograms;

import java.util.Scanner;

class QueueLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // Enqueue operation
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {   // empty queue
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " inserted into queue");
    }

    // Dequeue operation
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(front.data + " removed from queue");
            front = front.next;

            if (front == null) { // queue becomes empty
                rear = null;
            }
        }
    }

    // Display queue
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList q = new QueueLinkedList();

        while (true) {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Display  4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

