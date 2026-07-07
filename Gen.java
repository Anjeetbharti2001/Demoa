// User Input and Traversal
import java.util.*;
public class Gen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Arrays:");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Arrays element :-");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrays Element:-");

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}