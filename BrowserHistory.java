class Node {
    int data;
    Node previous;
    Node next;

    Node(int dataValue) {
        data = dataValue;
        previous = null;
        next = null;
    }
}

class Methods {
    Node head = null;
    Node tail = null;
}

class DoublyLinkedList {
    class Node {
        int dataValue;
        Node previous;
        Node next;

        public Node (int dataValue) {
        this.dataValue = dataValue;
        this.previous = null;
        this.next = null;
        }

        Node headNode = null;
        Node tailNode = null;

        public void goForward() {
            Node currentNode = headNode;
            while (currentNode != null) {
                System.out.println(currentNode.dataValue)
            }
        }

        public void goBackward() {
        }

        public void addNodeAtTail() {
            Node temporary = new Node(data);
            if (tail == null) {
                head = temporary;
                tail = temporary;
            }
            else {
                tail.next = temporary;
                temporary.prev = tail;
                tail = temporary;
            }
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