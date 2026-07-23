public class Gen implements Cloneable {

    String name = "Anjeet Bharti";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Gen g1 = new Gen();
            Gen g2 = (Gen) g1.clone();

            System.out.println(g2.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}