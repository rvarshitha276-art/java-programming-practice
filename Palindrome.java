public class Palindrome {
    public static void main(String[] args) {
        String text = "Madam";
        String normalized = text.toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();

        if (normalized.equals(reversed)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}
