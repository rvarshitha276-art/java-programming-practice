class Mobile {
    String model;
    double price;
    String colour;

    Mobile(String model, double price, String colour) {
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Colour: " + colour);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Example Phone", 15999.0, "Black");
        mobile.displayDetails();
    }
}
