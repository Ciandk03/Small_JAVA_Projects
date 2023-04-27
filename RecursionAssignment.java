import java.util.Scanner;

public class RecursionAssignment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Question 1
        System.out.println("Question 1: ");
        System.out.print("Enter first number for question 1: ");
        int start = scan.nextInt();

        System.out.print("Enter second number for question 1: ");
        int end = scan.nextInt();

        System.out.print("The sum of the even numbers in the range of " + start + " and " + end + " is = " + addEvenNumbersStartEnd(start, end));
        System.out.println();
        //Question 2
        System.out.println();
        System.out.println("Question 2: ");
        System.out.print("Enter first number to find gcd: ");
        int m = scan.nextInt();

        System.out.print("Enter second number to find gcd: ");
        int n = scan.nextInt();

        System.out.println("GCD(" + m + "," + n + ") = " + gcd(m,n));
    }
    //Question 1

    public static int addEvenNumbersStartEnd(int start, int end){
        if(start % 2 == 1) {   //checks if start is odd. If it is, it makes it even
            start += 1;
        }
        if(start == end) {
            return start;
        }
        else if(start > end) {
            return 0;
        }
        else {
            start += 2;
            return start + addEvenNumbersStartEnd(start, end) - 2;
        }
    }
    //Question 2

    public static int gcd(int m, int n){
        if(m == 0) {
            return n;
        }
        else if(n == 0) {
            return m;
        }
        else {
            return gcd(n ,n % m);
        }
    }
}

