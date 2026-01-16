public class twosum{
    public static void main(String[] args) {
        int arr[] = {1,4,5,6};
        int target = 8;

        for(int i = 0; i<=arr.length; i++) {
            // if(arr[i] + arr[i+1] == target) {
            //     System.out.println(i+","+(i+1));
            // }
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(i+","+j);
                }
            }
        }
    }
}