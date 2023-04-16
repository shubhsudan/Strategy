public class Main {
    public static void main(String[] args) {
        // Example usage of Duck classes
        MallardDuck mallard = new MallardDuck();
        RubberDuck rubber = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        mallard.quack();   // Quack Quack!
        mallard.swim();    // Swimming gracefully!

        rubber.quack();    // Squeak Squeak!
        rubber.swim();     // Just floating around...

        decoy.quack();     // Quack Quack!
        decoy.swim();      // Glub glub...

        // Example usage of Shape classes
        Circle circle = new Circle(0, 0, 5);
        Square square = new Square(0, 0, 10);
        Rectangle rectangle = new Rectangle(0, 0, 5, 10);

        System.out.println("Circle area: " + circle.area());         // Circle area: 78.5
        System.out.println("Circle perimeter: " + circle.perimeter()); // Circle perimeter: 31.400000000000002

        System.out.println("Square area: " + square.area());         // Square area: 100.0
        System.out.println("Square perimeter: " + square.perimeter()); // Square perimeter: 40.0

        System.out.println("Rectangle area: " + rectangle.area());         // Rectangle area: 50.0
        System.out.println("Rectangle perimeter: " + rectangle.perimeter()); // Rectangle perimeter: 30.0
    }
}