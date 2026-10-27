public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative integers.");
            return;
        }

        for (int value = 2; value <= number; value++) {
            factorial *= value;
        }

        System.out.println("Factorial of " + number + " = " + factorial);
    }
}
