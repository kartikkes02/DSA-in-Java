import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = cc.nextInt();
        System.out.print("Enter b: ");
        int b = cc.nextInt();
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
    }
}