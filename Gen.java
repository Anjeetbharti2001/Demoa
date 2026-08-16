public class Gen {
    public static void main(String args[]){
        int m = 9, n = 5;

        System.out.println("Before swapping: m = " + m
                           + ", n = " + n);

                           n = m ^ n;

                           m = m^n;

                           System.out.println("After swapping: m = " + m
                           + ", n = " + n);
    }
}