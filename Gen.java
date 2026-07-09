public class Gen {
    static void checkAge(int age ){
        if(age > 18){
            System.out.println("Access denied - you are not old enough! ");
        }else {
            System.out.println("Access granted - You are not Enough!");
        }
    }
    public static void main(String args[]){
        checkAge(20);
    }
}