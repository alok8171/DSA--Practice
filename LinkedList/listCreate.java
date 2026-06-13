import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int size = 0;

    // Add at Begin
    void addAtBegin(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        size++;
    }

    // Add at End
    void addAtEnd(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        size++;
    }

    // Add at Position (0-based index)
    void addAtPosition(int pos, int data) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            addAtBegin(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }

    // Delete at Begin
    void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // Delete at End
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        size--;
    }

    // Delete at Position
    void deleteAtPosition(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            deleteAtBegin();
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    // Display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class listCreate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("\n1. Add at Begin");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete at Begin");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data: ");
                    list.addAtBegin(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    list.addAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter position: ");
                    int pos1 = sc.nextInt();
                    System.out.print("Enter data: ");
                    int data3 = sc.nextInt();
                    list.addAtPosition(pos1, data3);
                    break;

                case 4:
                    list.deleteAtBegin();
                    break;

                case 5:
                    list.deleteAtEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    list.deleteAtPosition(sc.nextInt());
                    break;

                case 7:
                    list.display();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}