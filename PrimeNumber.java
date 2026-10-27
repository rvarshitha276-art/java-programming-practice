public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = number >= 2;

        for (int divisor = 2; divisor <= number / divisor && isPrime; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
            }
        }

        System.out.println(number + (isPrime ? " is prime." : " is not prime."));
    }
}
