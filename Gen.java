import java.util.*;

public class Gen {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 9};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}