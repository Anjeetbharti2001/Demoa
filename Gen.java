public class Gen{
    public static void main(String args[]){
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev)){
            System.out.println("Palindrom");
        }else{
            System.out.println("nOT pALINDROME");
        }
    }
}