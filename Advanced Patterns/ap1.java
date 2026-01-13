public class ap1{
    public static void main(String[] args) {

        // int n = 4;
        // for(int i = 0; i<n; i++) {
        //     for(int j = 0; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 0; i<n; i++) {
        //     for(int j = n; j>i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 0; i<=n; i++) {
        //     for(int j = 0; j<n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j<i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 0; i<n; i++) {
            
        //     for(int j = 0; j<i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j<n-i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        int n = 4;
        // lower part
        for(int i = 1; i<=n; i++) {
            // 1st part
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // 2nd part
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // upper part
        for(int i = n; i>=1; i--) {
            // 1st part
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // 2nd part
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
     }
}