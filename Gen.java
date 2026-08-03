import java.util.*;
public class Gen {
    public static void main(String args[]){
      
        List<Integer> list1 = List.of(10, 20, 30);
        List<Integer> list2 = List.of(40, 50, 60);

        List<Integer>mergedList = new ArrayList<>();

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println("Merge List : " + mergedList);
    }
}