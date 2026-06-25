import java.util.*;
public class Gen{
    public static void main(String args[]){
        int [] arr = {4, 2, 7, 1, 3};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : arr){
            pq.add(num);
        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll() + " ");
        }
    }
}