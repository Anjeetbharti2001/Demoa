import java.util.*;
public class Gen{
    public static boolean isAnagram(String str1, String str2){
        // Remove spaces and convert to loverCase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        //if Length is different, not anagram
        if(str1.length() != str2.length()){
            return false;
        }
        // convert string to character arrays 
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // compare arrays
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String args[]){
        String str1 = "listen";
        String str2 = "silent";

        if(isAnagram(str1, str2)){
            System.out.println("String are Anagram");
        }else{
            System.out.println("String are not Anagram ");
        }

    }
}