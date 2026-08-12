import java.util.*;
public class Gen {
  public static void main(String args[]){
    int arr[] = {3, 1, 5, 12, 2, 11};

    int k = 3;

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for(int num : arr){
      minHeap.add(num);

      if(minHeap.size() > k){
        minHeap.poll();
      }
    }
    System.out.println("Top " + k + "Elements " + minHeap);
  }
}