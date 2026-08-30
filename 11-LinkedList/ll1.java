// Linked List are linear data structures that consist of a sequence of elements, where each element 
// points to the next one. They are dynamic in size and can easily grow and shrink in size by 
// allocating and deallocating memory as needed. Linked lists are commonly used in scenarios where 
// frequent insertions and deletions are required, as they can be more efficient than arrays for these 
// operations.

// head: The first node in the linked list
// tail: The last node in the linked list
// in the node there's a only one head and tail, but in the linked list there are many nodes.
// Each node contains data and a reference (or pointer) to the next node in the sequence.
// The last node's next pointer is set to null, indicating the end of the list.

// Add in Linked List: To add a new node to the linked list, you can create a new node and update the 
// next pointer of the last node to point to the new node. If the list is empty, you can set both the 
// head and tail pointers to the new node.

// add First: To add a new node at the beginning of the linked list, you can create a new node and set 
// its next pointer to the current head. Then, update the head pointer to point to the new node.

// add Last: To add a new node at the end of the linked list, you can create a new node and update the 
// next pointer of the last node to point to the new node. If the list is empty, you can set both the head and tail pointers to the new node.

public class ll1 {
    public static class Node{
        int data;
        Node next;

        // Constructor to initialize the node with data and set the next pointer to null
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;
    }
    public static void main(String[] args) {
        ll1 ll1 = new ll1();
        ll1.head = new Node(1);
        ll1.head.next = new Node(2);
    }
}
