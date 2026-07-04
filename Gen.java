// Create a program that print the seat number in a theater row , showing both the seat number and who is sitting there
public class Gen {
    public static void main(String args[]){
        String[] seats = {"jenny", "Liam", "Angie", "Bo"};

        for(int i = 0; i<seats.length; i++){
            System.out.println("Seat number " + i + "is taken by " + seats[i]);
        }
    }
}