package practiceLogicalPrograms;

import java.util.Scanner;

class LinkedListDemo {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(data + " inserted");
    }

    // Delete from beginning
    void delete() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println(head.data + " deleted");
            head = head.next;
        }
    }

    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            System.out.print("Linked List: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListDemo list = new LinkedListDemo();

        while (true) {
            System.out.println("\n1.Insert  2.Delete  3.Display  4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    list.insert(sc.nextInt());
                    break;
                case 2:
                    list.delete();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

