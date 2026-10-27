public class PassByValue {
    static void changeValue(int number) {
        number = 100;
    }

    public static void main(String[] args) {
        int original = 10;
        changeValue(original);

        // Java passes a copy of the primitive value to the method.
        System.out.println("Original value: " + original);
    }
}
