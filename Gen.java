// create a program that calculates the average of different ages
public class Gen {
    public static void main(String args[]){
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;
        // Get the length of the arrays 
        int length = ages.length;
        for(int age : ages){
            sum += age;
        }
        avg = sum / length;
        System.out.println("the average age is :-" + avg);
    }
}