public class Gen {
    public static void main(String args[]) {
        int score = 75;

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 70) {
            System.out.println("Good"); // This block will execute
        } else {
            System.out.println("Needs Improvement");
        }

    }
}