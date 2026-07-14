public class Gen{
    public static void main(String args[]){
        int [] arr = {3, 4, 3, 6, 3, 8};
        int key = 3;
        int count = 0; 
        for(int num : arr){
            if(num == key){
                count++;
            }
        }
        System.out.println(count);
    }
}