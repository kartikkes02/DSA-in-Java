import java.util.*;

public class add{
    public static void addTwoNumber(int a, int b) {
        System.out.print("The sum of "+a+" and "+b+" is: "+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int c = sc.nextInt();
        System.out.print("Enter b: ");
        int d = sc.nextInt();

        addTwoNumber(c, d);
    }
}