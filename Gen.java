public class Gen {
    int x ;
    public Gen(int y){
        x = y;
    }
    public static void main(String args[]){
        Gen myObj = new Gen(5);
        System.out.println(myObj.x);

    }
}