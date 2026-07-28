class Person{
    public String name = "Anjeet";
    private int age = 30;
}
public class Gen {
    public static void main(String args[]){
        Person p = new Person();//
        System.out.println(p.name);
        System.out.println(p.age);
    }
}