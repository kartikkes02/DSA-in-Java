import java.util.*;

public class input {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is: " +(a + b));
    }
}