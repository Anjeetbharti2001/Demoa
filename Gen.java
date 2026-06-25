import java.util.*;
public class Gen{
    public static void main(String args[]){
        int[] arr = {5,3,9,1,6};
        PriorityQueue<Integer>pq = new PriorityQueue<> (Collections.reverseOrder());
       
        for(int num : arr){
            pq.add(num);
        }
        System.out.println("Largest : " + pq.peek());
    }
}