public class a4{
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        for(int i = 0; i<strs.length-1; i++) {
            for(int j = 0; j<strs.length; j++) {
                if(strs[i] == strs[j]) {
                    System.out.print(strs[i].charAt(i));
                } else{
                    System.out.println("");
                }
            }
        }
    }
}