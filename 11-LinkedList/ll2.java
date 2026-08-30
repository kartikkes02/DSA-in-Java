// Add in Linked List: To add a new node to the linked list, you can create a new node and update the 
// next pointer of the last node to point to the new node. If the list is empty, you can set both the 
// head and tail pointers to the new node.

// add First: To add a new node at the beginning of the linked list, you can create a new node and set 
// its next pointer to the current head. Then, update the head pointer to point to the new node.

// add Last: To add a new node at the end of the linked list, you can create a new node and update the 
// next pointer of the last node to point to the new node. If the list is empty, you can set both the head and tail pointers to the new node.


public class ll2 {

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

    // add data in the middle
    public void add(int idx, int data) {
// base case: if idx is 0,and data is the same as the data to be added, then we can add the new node at the beginning of the linked list
        if(idx == data) { 
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);

        size++;

        Node temp = head;
        int i = 0;
        while(i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {

        ll2 ll = new ll2();

        System.out.println("Before adding any element: ");
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(3);
        ll.print();

        System.out.println("After adding element in the middle: ");
        ll.add(3, 34);
        ll.print();

        System.out.println("After adding element in the middle(base case): ");
        ll.add(3, 3);
        ll.print();

        System.out.println("Size of the linked list: " + ll.size);
    }
}