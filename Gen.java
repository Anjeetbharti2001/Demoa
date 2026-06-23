// public class Gen{
//     public static void main(String args[]){
//        final int[] arr = {10, 20, 30};
       
//        arr[2] = 99;

//        for(int i = 0; i < arr.length; i++){
//         System.out.println(arr[i] + " ");
//        }
//     }
// }

public class Gen{
    int p = 20;
    public static void main(String args[]){
        final Gen t = new Gen();
        t.p = 30;
        System.out.println(t.p);
    }
}