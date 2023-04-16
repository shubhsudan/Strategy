public class Rectangle extends Shape {
    private double w, h;

    public Rectangle(int x, int y, double w, double h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    public double area() {
        return w * h;
    }

    public double perimeter() {
        return 2 * (w + h);
    }
}
