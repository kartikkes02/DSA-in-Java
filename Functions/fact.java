import java.util.Scanner;

public class fact{
    public static int factorial(int n) {
        int fact = 1;
        for(int i = n; i >=1; i--) {
            fact*= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int m = sc.nextInt();
        System.out.print("Factorial of "+m+" is: "+factorial(m));
    }
}