class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

public class CircularDoublyLinkedList {
    Node head = null;
    Node tail = null;

    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "");
            current = current.next;
        }
    }

    public void traverseBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "");
            current = current.prev;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        if (head != null) {
            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        
        System.out.println("Circular Linked List:");
        list.display();
    }
}
