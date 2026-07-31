import java.util.*;

public class Gen {

    public static void generateSubset(int[] arr) {
        int n = arr.length;

        // Total subsets = 2^n
        for (int mask = 0; mask < (1 << n); mask++) {
            System.out.print("{ ");

            for (int i = 0; i < n; i++) {
                // Check if i-th bit is set
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        generateSubset(arr);
    }
}