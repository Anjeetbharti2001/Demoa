import java.util.*;
public class Gen{
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Three Numbers:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = sum1(a, b, c);
        System.out.println("sum :-" + sum);
        sc.close();
    }
    static int sum1(int x, int y, int z){
         int d = x + y + z;
         return d;
    }
   
}