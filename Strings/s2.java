import java.util.*;

public class s2{
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;   // concatenation
        // Various String methods
        System.out.println(fullName);
        System.out.println(fullName.toLowerCase());   // to lower case
        System.out.println(fullName.toUpperCase());   // to upper case
        System.out.println(fullName.trim());     // removes spaces at start and end
        System.out.println(fullName.substring(3));   // substring from index 3 to end
        System.out.println(fullName.substring(3, 7));   // substring from index 3 to 6
        System.out.println(fullName.replace('a', 'b'));   // replace a with b
        System.out.println(fullName.replace("ab", "xy"));   // replace ab with xy
        System.out.println(fullName.startsWith("A"));   // checks if string starts with A
        System.out.println(fullName.endsWith("z"));     // checks if string ends with z
        System.out.println(fullName.charAt(4));     // character at index 4 
        System.out.println(fullName.indexOf('a'));   // first occurrence of a
        System.out.println(fullName.lastIndexOf('a'));   // last occurrence of a
        System.out.println(fullName.indexOf("bc"));   // first occurrence of bc
        System.out.println(fullName.lastIndexOf("bc"));   // last occurrence of bc
        System.out.println(fullName.contains("abc"));   // checks if abc is present
        System.out.println(fullName.equals("abc xyz"));   // checks if fullName equals abc xyz
        System.out.println(fullName.equalsIgnoreCase("abc xyz"));   // checks if fullName equals abc xyz ignoring case
        String strArray[] = fullName.split(" ");   // splits string by space
        
        for(int i = 0; i<strArray.length; i++) {
            System.out.print(strArray[i] + ",");
        }
    }
}