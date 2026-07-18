public class Gen{
    public static void moveZeros(int [] arr){
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[i] = temp;
                j++;
            }
        }
        for(int x : arr){
         System.out.println(x + " ");
        }
    }
    public static void main(String args[]){
        int [] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
    }
}