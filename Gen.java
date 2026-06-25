import java.util.*;
public class Gen {
    public static void main(String args[]){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);

        while(!pq.isEmpty()){
            pq.poll();
        }
        if(pq.isEmpty()){
            System.out.println("heap is Empty");
        }else{
            System.out.println("Heap is not Empty");
        }
    }
}