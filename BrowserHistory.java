class DoublyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;

        public Node (int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
        }

        Node head = null;
        Node tail = null;

        public void addNode() {
            Node newNode = new Node(data);
        }
    
        public void deleteNode() {
        }

        public void displayNode() {
        }
    }
}


public class BrowserHistory {
    public static void main(String[] args) {
        DoublyLinkedList list = nee DoublyLinkedList();
    }
}