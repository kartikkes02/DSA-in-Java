public class tc {
    public static void main(String[] args) {
        // TC: Rate at whuch the time taken increses with respect to input size.
        // Time complexity is measured in Big O because it provides an 
        // upper bound (worst-case scenario) and ignores machine-specific details 
        // (like processor speed).
        // - Worst case scenario: The maximum time taken on any input of size n.
        // Avoids constants
        // Avoid lower order terms

        // - Average case scenario: The expected time taken on a random input of size n.
        // - Best case scenario: The minimum time taken on any input of size n.

        // Space complexity is the amount of memory space required by an 
        // algorithm to run as a function of the size of the input data. 
        // It includes both the space needed for the input data and any 
        // additional space needed for the algorithm's operations.
        System.out.println("Time Complexity");
        // O(1) - Constant Time Complexity
        int a = 5;
        System.out.println(a);
        // O(n) - Linear Time Complexity
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // O(n^2) - Quadratic Time Complexity
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " " + j);
            }
        }
        // O(log n) - Logarithmic Time Complexity
        int n = 16;
        while (n > 1) {
            System.out.println(n);
            n /= 2;
        }
        // O(n log n) - Linearithmic Time Complexity
        int[] arr = {5, 2, 9, 1, 5, 6};
        java.util.Arrays.sort(arr);
        // O(2^n) - Exponential Time Complexity
    }

    static int fib(int num) {
        if (num <= 1) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }
    // O(n!) - Factorial Time Complexity
    static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, ans + ch);
        }
    }
    // O(n^3) - Cubic Time Complexity
    static void cubicExample(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
