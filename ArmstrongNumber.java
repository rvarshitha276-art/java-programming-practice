public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int digits = String.valueOf(number).length();
        int remaining = number;
        int sum = 0;

        while (remaining > 0) {
            int digit = remaining % 10;
            sum += (int) Math.pow(digit, digits);
            remaining /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
