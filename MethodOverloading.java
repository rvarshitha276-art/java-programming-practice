public class MethodOverloading {
    static int add(int first, int second) {
        return first + second;
    }

    static double add(double first, double second) {
        return first + second;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 7));
        System.out.println(add(2.5, 3.2));
    }
}
