import java.util.LinkedList;
import java.util.Scanner;
public class BrowserHistory {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        LinkedList<String> history = new LinkedList<String>();

        while (true) { 
            String current = history.peekLast();
            if (current == null) {
                current = "the home page";
            }

            int indexOfPastPage = 0;

            System.out.println("You are currently on " + current + "\n[n = new page | b = back | f = forward]");
            String operation = userInput.nextLine();

            switch (operation) {
                case "n":
                indexOfPastPage = history.lastIndexOf(current);
                System.out.println("Enter URL:");
                current = userInput.nextLine();
                history.addLast(current);
                break;

                case "b":
                System.out.println(indexOfPastPage);
                current = history.get(indexOfPastPage);
                if (indexOfPastPage == 0) {
                    current = "the home page";
                }
                break;

                case "f":
                break;

                default:
                return;
            }
        }
    }
}

/*class Node {
    int data;
    Node previous;
    Node next;

        public Node(int dataValue) {
            this.data = dataValue;
            this.previous = null;
            this.next = null;
        }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    static int findLength(Node head) {
        int count = 0;
        for (Node currentNode = head; currentNode != null; currentNode = currentNode.next)
            count++;
        return count;
    }

    public void goBack() {
        Node currentNode = tail;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.previous;
        }
    }

    public void goForward() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public void newPageAtEnd(int dataValue) {
        Node temporaryNode = new Node(dataValue);
        if (tail == null) {
            head = temporaryNode;
            tail = temporaryNode;
        }
        else {
            tail.next = temporaryNode;
            temporaryNode.previous = tail;
            tail = temporaryNode;
        }
    }

    public void deleteForwardHistory() {
        if (tail == null) {
            return;
        }
        
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temporaryNode = head;
        tail = tail.previous;
        tail.next = null;
        temporaryNode.previous = null;
    }

    public void newPageAfterBack(int dataValue) {
        Node temporaryNode = new Node(dataValue);

    }

    public void display() {
        Node temporaryNode = head;
        while (temporaryNode != null) {
            System.out.println(temporaryNode.data + " ");
            temporaryNode = temporaryNode.next;
        }
    }
}

public class BrowserHistory {
    public static void main(String[] args) {
        while (true) { 
            System.out.println("Please choose operation:\n [n = new page | b = backward | f = forward]");
            String operation = userInput.nextLine();
            switch (operation) {
                case "n":
                
                case "b":
                
                case "f":
            }
        }
    }
}*/

/*class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
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
}*/

/*class Node {
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
}*/
