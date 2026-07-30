import java.util.*;

public class Gen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arrays:");
        int n = sc.nextInt();

        int []arr = new int[n];

        System.out.println("Enter " + n + "element:");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array element are :");
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}