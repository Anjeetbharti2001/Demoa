public class Gen {

    public static void permute(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursive case
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Remove current character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            permute(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        permute("ABC", "");
    }
}