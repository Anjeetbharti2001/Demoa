import java.util.*;
public class Gen{
    public static void main(String args[]){
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(5);
        ts.add(20);
        ts.add(10); // duplicate (ignored)

        System.out.println(ts);
    }
}