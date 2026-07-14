public class Gen{
    public static void main(String args[]){
        int[]arr = {3, 5, 7, 5, 9};
        int key = 5; 
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println(i);
                break;
            }
        }
    }
}