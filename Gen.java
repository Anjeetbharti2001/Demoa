public class Gen{
    public static void main(String args[]){
        // Traversing an Arrays in reverse
        int [] arr = {4,6,8,2,4};
        System.out.println("Reverse travesal:-");

        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}