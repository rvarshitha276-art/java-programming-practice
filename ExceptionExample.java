public class ExceptionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            System.out.println(numerator / denominator);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
