// Create a class  Rectangle and overlaod construct.

class Rectangle {
    private double length, breath;

    Rectangle() {
        this.length = 5;
        this.breath = 6;
    }

    Rectangle(Double l, Double b) {
        this.length = l;
        this.breath = b;
    }

    public double Area() {
        double AreaRectangle = length * breath;
        return AreaRectangle;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(); // Without any parameters
        System.out.println(R1.Area());
        Rectangle R2 = new Rectangle(4.2, 5.5); // with parameters
        System.out.println(R2.Area());
    }
}
