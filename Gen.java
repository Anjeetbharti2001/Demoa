public class Gen {
    public static void main(String args[]){
        int [] numbers = {1, 5, 10, 25};

        int sum = 0;

        // loops through the arrays and add each element to sum 
        for(int i = 0; i< numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println("The sum is :-" + sum );
    }
}