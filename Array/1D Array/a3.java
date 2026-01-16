import java.util.*;

public class a3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();

        int arr3[] = new int[size];
        // for input
        System.out.println("Inputs are:");
        for(int i = 0; i<size; i++) {
            arr3[i] = sc.nextInt();
        }


        // for output
        System.out.println("Outputs are:");
        for(int i = 0; i<size; i++) {
            System.out.println(arr3[i]);
        }

        int x = sc.nextInt();
        
        for(int i = 0; i<size; i++) {
            if(x == arr3[i]) {
            System.out.println(x+"is found in the array"+"at index"+i);
            } else {
                System.out.println("Number not found in the array");
            }
        }
    }
}