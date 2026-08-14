import java.util.*;
public class Gen {
    public static void main(String args[]){
        String str = "anjeet";
        Stack<Character> Stack = new Stack<>();

        for(char ch : str.toCharArray()){
            Stack.push(ch);
        }
        while(!Stack.isEmpty()){
            System.out.println(Stack.pop());
        }
        
    }
}