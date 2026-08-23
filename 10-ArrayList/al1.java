// ArrayList is a resizable array implementation of the List interface 
// in Java. It allows dynamic resizing, meaning that it can grow or 
// shrink in size as elements are added or removed. 
// ArrayList provides methods to manipulate the elements, such as adding, 
// removing, and accessing elements by index. 
// It is part of the java.util package and is widely used for storing 
// and managing collections of objects in Java programs.

import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;
public class al1 {
    public static void swap(ArrayList <Integer> List2, int idx1, int idx2) {
        int temp = List2.get(idx1);
        List2.set(idx1,List2.get(idx2));
        List2.set(idx2,temp);
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        
        // add
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("List1: "+list1);
        list1.add(2, 10); // add 10 at index 2
        System.out.println("List1 after adding 10 at index 2: "+list1);

        // get
        System.out.println("Element at index 3: " + list1.get(3));
       
        // remove
        System.out.println("Remove element: "+list1.remove(0));
        System.out.println("List updated"+list1);

        // set
        System.out.println("Update Element at index 3: " + list1.set(3, 99));
        System.out.println("List updated: " + list1);

        // size
        System.out.println("Size of list: " + list1.size());

        // contains
        System.out.println("List contains 10: " + list1.contains(10));

        for(int i = 0; i<list1.size(); i++) {
            System.out.print(list1.get(i)+ " ");
        }
        System.out.println();
        for (int j = list1.size()-1; j>=0; j--) {
            System.out.print(list1.get(j)+" ");
        }
        
        System.out.println();

        // max element
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<list1.size(); i++) {
            if(list1.get(i) > max) {
                max = list1.get(i);
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println();

        int idx1 = 1;
        int idx2 = 3;
        swap(list1, idx1, idx2);
        System.out.println("List after swapping elements at index " + idx1 + " and "+ idx2 + ": " + list1);

        Collections.sort(list1);
        System.out.println("Sorted List: " + list1);

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Reverse Sorted List: "+list1);
    }
}
