public class Gen {
    public static void main(String args[]){
        int [] arr = {1,4,6,8,9};
        System.out.println("Reverse Traversal:-");

        for(int i = arr.length - 1; i>= 0; i--){
            System.out.println(arr[i]);
        }
    }
}