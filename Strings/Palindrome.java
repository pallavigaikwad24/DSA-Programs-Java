public class Palindrome {
    public static void main(String[] args) {

        String str = "noon";

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("This is not palindrome");
                return;
            }
        }

        System.out.println("This is palindrome");
        return;
    }

}
