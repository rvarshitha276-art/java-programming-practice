public class Fibonacci {
    public static void main(String[] args) {
        int terms = 10;
        int first = 0;
        int second = 1;

        for (int index = 0; index < terms; index++) {
            System.out.print(first + (index == terms - 1 ? "" : " "));
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
