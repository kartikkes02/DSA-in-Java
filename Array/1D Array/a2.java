import java.util.*;

public class a2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int num[] = new int[size];

        // for input
        for(int i = 0; i<size; i++) {
            num[i] = sc.nextInt();
        }

        // for output
        System.out.println("Arrays are:");
        for(int i = 0; i<size; i++) {
            System.out.println(num[i]);
        }
    }
}