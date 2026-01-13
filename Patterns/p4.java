public class p4{
    public static void main(String[] args) {    // int n = 3;
        for(int i = 0; i<=3; i++) {     // int i = n; i>=1; i--
            for(int j = 3; j>=i; j--) { // int j =1; j<=i; j++
                System.out.print("*");
            }
            System.out.println();
        }
    }
}