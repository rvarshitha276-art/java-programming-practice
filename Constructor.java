public class Constructor {
    private final String studentName;

    Constructor(String studentName) {
        this.studentName = studentName;
    }

    void display() {
        System.out.println("Student name: " + studentName);
    }

    public static void main(String[] args) {
        Constructor student = new Constructor("Ananya");
        student.display();
    }
}
