package practiceLogicalPrograms;

import java.util.Scanner;

class QueueArray {
    int queue[];
    int front, rear, size;

    QueueArray(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            queue[++rear] = data;
            System.out.println(data + " inserted into queue");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " removed from queue");
        }
    }

    // Display queue
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        QueueArray q = new QueueArray(size);

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

