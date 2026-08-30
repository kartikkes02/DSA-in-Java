public class rev {
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize the node with data
        // and set the next pointer to null
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail belong to LinkedList, NOT Node
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // step1: create new Node
        Node newNode = new Node(data);

        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2: newNode next = head
        newNode.next = head;

        // step3: head = newNode
        head = newNode;
    }

    public void addLast(int data) {

        // step1: create new Node
        Node newNode = new Node(data);

        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2: tail next = newNode
        tail.next = newNode;

        // step3: tail = newNode
        tail = newNode;
    }

    public void print() {

        if (head == null) {
            System.out.println("LL is empty.");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        // assignment operator operates right to left, so head is assigned to tail first, then tail is assigned to curr
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        rev ll = new rev();

        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(3);
        ll.print();
        System.out.println("Reversing the linked list...");
        ll.reverse();
        ll.print();
    }
}
