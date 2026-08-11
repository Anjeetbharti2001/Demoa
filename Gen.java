public class Gen {
  public static void main(String args[]){
    int []arr = {5, 2, 8, 1, 9};
    

    int[] prefix = new int [arr.length];

    prefix[0] = arr[0];

    for(int i = 1; i<arr.length; i++){
      prefix [i] = prefix[i - 1] + arr[i];
    }
    System.out.println("Total sum = " + prefix[arr.length - 1]);
  }
}