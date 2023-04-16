public class Square extends Shape {
    private double side;

    public Square(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}
