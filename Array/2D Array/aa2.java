import java.util.*;

public class aa2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // for input
        System.out.println("Inputs are: ");
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // for output
        System.out.println("Outputs are: ");
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter the element to be searched: ");
        int x = sc.nextInt();

        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                if(x == arr[i][j]) {
                    System.out.println(x+" is found at index "+i+","+j);
                }
            }
        }
    }
}