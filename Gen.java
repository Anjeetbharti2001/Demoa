public class Gen{
    public static void main(String args[]){
        int [] arr = {5, 8, 12, 20};
        int key = 12;
        boolean found = false;

        for(int num : arr){
            if(num == key){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}