
import java.util.Scanner;
public class StringMethodsDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        StringMethodsDemo obj = new StringMethodsDemo();

        do {

            obj.menuPrompt();
            choice = scan.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    System.out.println("The string size is:" + stringLength());
                    break;
                case 2:
                    stringCase();
                    break;
                case 3:
                    stringSubstring();
                    break;
                case 4:
                    stringEquals();
                    break;
            }
        } while (choice != 0);	//end of the do-while loop
        scan.close();


    }
    public static void menuPrompt() {
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("* 0 – Quit");
        System.out.println("* 1 – Size of a String");
        System.out.println("* 2 – String cases (uppercase or lowercase");
        System.out.println("* 3 – Create a substring from a specified String");
        System.out.println("* 4 – Compare two Strings");
        System.out.println("////////////////////////////////////////////////");
        System.out.println(" Enter choice:");
    }
    public static int stringLength(){
        Scanner scan = new Scanner(System.in);
        int StringCount = 0;

        System.out.print("Enter String:");
        String str = scan.next();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                StringCount++;
        }
        return StringCount;

    }
    public static void stringCase(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = scan.next();
        System.out.print("Enter 0 for uppercase or any other number for lowercase:");
        int c1 = scan.nextInt();
        if (c1 == 0) {
            System.out.println("The uppercase string is: " + str.toUpperCase());
        }
        else {
            System.out.println("The lowercase string is: " + str.toLowerCase());
        }
    }

    public static void stringSubstring() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = scan.next();
        System.out.println("The first half of the string: " + str.substring(0, str.length() / 2));

    }
    public static void stringEquals() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first String:");
        String str1 = scan.next();
        System.out.print("Enter your first String:");
        String str2 = scan.next();
        if (str1.equals(str2)) {
            System.out.println("The strings are equal");
        }
        else {
            System.out.println("The strings are not equal");
        }
    }
}