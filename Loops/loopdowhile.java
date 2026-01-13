import java.util.Scanner;

public class loopdowhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i = 1;  // initialization

        do {
            System.out.println(n+"*"+i+"="+n*i);
            i++;    // updation
        } while(i <= 10);    // condition
    }
}