public class sb1{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kartik");
        System.out.println(sb);
        System.out.println(sb.append(" Kesarwani")); // append
        System.out.println(sb.insert(0, "Mr."));   // insert at index 0
        System.out.println(sb.replace(0, 3, "Ms."));    // replace from index 0 to 2
        System.out.println(sb.delete(0, 3));    // delete from index 0 to 2
        System.out.println(sb.reverse());   // reverse the string
        System.out.println(sb.length());    // length of string
        System.out.println(sb.charAt(4));   // character at index 4
        sb.setCharAt(4, 'V');   // set character at index 4 to V
        System.out.println(sb);
        System.out.println(sb.indexOf("a"));    // first occurrence of a
        System.out.println(sb.lastIndexOf("a"));    // last occurrence of a
        System.out.println(sb.substring(3, 7));  // substring from index 3 to 6
        System.out.println(sb.toString());  // convert to string
        System.out.println(sb.capacity());  // capacity of string builder
        
    }
}