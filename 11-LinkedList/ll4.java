public class ll4 {
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

    public int keySearch(int key) {
        Node temp = head;
        int val = temp.data;
        int i = 0;

        while(temp != null) {
            if(val == key) {
                return i;
            } else{
                temp = temp.next;
                i++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ll4 ll = new ll4();

        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(3);
        ll.print();

        System.out.println("Key found at index: " + ll.keySearch(4));
    }
}
