public class Gen {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Anjeet");

        // add text
        sb.append("java");

        // Insert text
        sb.insert(6, "life");

        //Reverse string 
        sb.reverse();

        System.out.println(sb);
    }
}