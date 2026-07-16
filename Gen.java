public class Gen {
    public static void moveZeros(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // Print the array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = {0, 1, 0, 3, 1, 2};
        moveZeros(arr);
    }
}