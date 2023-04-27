
    public class ArrayDemo_Q2 {
        public static void main(String[] args) {
            int[] arr = {3, 4, 5, 6, 7, 8};
            System.out.print("Array before swap: ");
            for(int i1 : arr) {
                System.out.print(i1 + " ");
            }
            System.out.println();
            neighborSwap(arr);
            System.out.print("After the switch the switch: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void neighborSwap(int[] arr1) {
            for (int i = 0; i < arr1.length; i++) {
                if (i != arr1.length - 1) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i+1];
                    arr1[i+1] = temp;
                    i++;
                }
            }
        }
    }

