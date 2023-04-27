
package CSCI1302;
import java.util.*;
    public class MyFirstJavaProgram {
        public static void main(String [] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Principal:");
            int principal = scanner.nextInt();
            System.out.print("AIR");
            float air = scanner.nextFloat();
            float mir = air / 100 / 12;
            float fin = principal * mir;
            System.out.print("Mortgage:" + fin);

        }
    }
