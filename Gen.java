import java.util.*;
public class Gen{
    public static void main(String args[]){
        int[] a = {1, 4, 7};
        int [] b = {2, 3, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : a) pq.add(num);
        for(int num : b) pq.add(num);
        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
    }
}