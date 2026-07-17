import java.util.*;
public class Gen{
    public static void main(String args[]){
        Set<String> ts = new TreeSet<>();

        ts.add("bharat");
        ts.add("india");
        ts.add("Nepal");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        for(String value : ts){
            System.out.println(value + " ,");
        }
        System.out.println();

    }
}