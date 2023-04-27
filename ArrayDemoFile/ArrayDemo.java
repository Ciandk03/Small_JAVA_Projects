import java.util.Random;

public class ArrayDemo {
    public static void main(String [] args) {
        int[] arr1 = new int[20];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 97) + 4;
        }
        nextArray(arr1);
    }

    public static void nextArray(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        arr2[0] = arr1[0];
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr1[i] + arr1[i-1];
        }
        System.out.print("arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}