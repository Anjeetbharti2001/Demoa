import java.util.*;

public class Gen{
  public static void main(String args[]){
    Stack<Integer> Stack = new Stack<>();
    //push 
    Stack.push(20);
    Stack.push(20);
    Stack.push(28);
    Stack.isEmpty();
    
    System.out.println(Stack);

    // peek
    // System.out.println("Top Element :-" + Stack.peek());

    // // pop
    // System.out.println("Remove :- " + Stack.pop());
    // System.out.println(Stack);

    // Size
    // System.out.println("Size : " + Stack.size());
    // System.out.println(Stack);

    // Empty

    System.out.println("IsEmpty :-" + Stack.isEmpty());
    System.out.println(Stack);
  }
}