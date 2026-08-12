public class Gen{
       public static void main(String args[]){
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
     
        
        if(str.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not Palindrom:-");
        }
    }
}