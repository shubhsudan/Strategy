public class Circle extends Shape {
    private double r;

    public Circle(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }

    public double perimeter() {
        return 2 * 3.14 * r;
    }
}
