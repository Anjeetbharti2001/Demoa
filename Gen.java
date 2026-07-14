public class Gen{
    // Write a method for linear search
    static int linearSearch(int[]arr, int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int [] arr = {5, 10, 15, 20, 25};
        int result = linearSearch(arr, 20);
        if(result != -1){
            System.out.println("found at index:" + result);
        }else{
            System.out.println("not found");
        }
    }
}