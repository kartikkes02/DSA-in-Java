import java.util.*; // * means all classes in java.util package
public class s1{
    public static void main(String[] args) {
        // sc.close(); : Not closing Scanner to avoid closing System.in
        System.out.println("Strings are immutable i.e, Strings cannot be changed once created"); // Strings cannot be changed once created
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();    // next reads input till space

        System.out.print("Enter your full name: ");
        String names = sc.nextLine();

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("My Name is: "+name);
        System.out.println("My Name is: "+names);
        String fullName = firstName + " " + lastName;   // concatenation
        System.out.println(fullName);
        System.out.println(fullName.length());    // length of string
        for(int i = 0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));   // print each character
        }

        if(firstName.compareTo(lastName) == 0) {
            System.out.println("First name and last name are equal");
        } else {
            System.out.println("First name and last name are not equal");
        }

        // fullName.setAtChar(0, 'X'); // error: String is immutable in Java
    }
}