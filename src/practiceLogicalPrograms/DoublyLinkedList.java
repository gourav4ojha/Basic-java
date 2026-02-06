package practiceLogicalPrograms;

import java.util.Scanner;

class DoublyLinkedList {

    // Node class
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
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
            newNode.prev = temp;
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
            if (head != null) {
                head.prev = null;
            }
        }
    }

    // Display forward
    void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            System.out.print("Forward: ");
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Display backward
    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.print("Backward: ");
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.prev;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.displayForward();
        list.displayBackward();

        list.delete();
        list.displayForward();
    }
}

