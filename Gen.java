public class Gen {
    int modelYear;
    String modelName;

    public Gen(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public static void main(String args[]){
        Gen myCar = new Gen(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }
}