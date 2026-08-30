// remove in LinkedList, we have to maintain head and tail in LinkedList class, not in Node class.

// removeFirst: To remove the first node from the linked list, you can update the head pointer to point 
// to the second node in the list. If the list becomes empty after removal, you should also set the tail 
// pointer to null.

// removeLast: To remove the last node from the linked list, you can traverse the list to find the 
// second-to-last node and update its next pointer to null. If the list becomes empty after removal, 
// you should also set both the head and tail pointers to null.

public class ll3 {

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

    public int removeFirst() {

        // special case: if size is 0, then return Integer.MIN_VALUE
        // special case: if size is 1, then return head.data and set head and tail to null
        // general case: if size is greater than 1, then return head.data and set head to head.next

        if(size == 0) {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i = 0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String[] args) {

        ll3 ll = new ll3();

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

        System.out.println("Removed first element: ");
        ll.removeFirst();
        ll.print();
        System.out.println("Removed last element: ");
        ll.removeLast();
        ll.print();
        System.out.println("Size of the linked list: " + ll.size);
    }
}