public class Gen {
    public static void main(String args[]){
        int ages[] = {20, 22, 18, 35, 48, 26, 27, 70};

        int length = ages.length;

        int lowestAge = ages[0];

        for(int age : ages){
            if(lowestAge > age){
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the arrays is :" + lowestAge);
    }
}