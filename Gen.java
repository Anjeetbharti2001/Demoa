public class Gen {
    public static void main(String args[]){
        String str = "Anjeet";
        char target = 't';

        boolean found = false;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == target){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}