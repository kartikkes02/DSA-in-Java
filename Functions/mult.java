import java.util.Scanner;
public class mult{
    public static int multiplytwonumber(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("The product of "+a+" and "+b+" is: "+multiplytwonumber(a, b));
    }
}
