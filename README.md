# Strategy

Duck and Shape Java Classes
This project contains Java classes for simulating the behavior of ducks and calculating the area and perimeter of various shapes.

Duck Classes
The Duck class represents a generic duck, and several specific duck classes extend it:

MallardDuck: a mallard duck that can swim and quack
RedheadDuck: a redhead duck that can swim and quack
RubberDuck: a rubber duck that can only squeak and float
DecoyDuck: a decoy duck that can only quack and sink
Each duck class takes a SwimBehavior object as a parameter in its constructor, which determines how the duck will swim.

Shape Classes
The Shape class represents a generic shape, and several specific shape classes extend it:

Circle: a circle defined by its center point and radius
Square: a square defined by its center point and side length
Rectangle: a rectangle defined by its center point, width, and height
Each shape class has methods for calculating its area and perimeter.




CLASS DIAGRAM

+---------------------+         +------------------+
|      Duck           |         |    SwimBehavior   |
+---------------------+         +------------------+
| - swimBehavior: SwimBehavior |  | <<interface>>    |
+---------------------+         |    + swim()       |
| + quack(): void     |         +------------------+
| + swim(): void      |
+---------------------+             ^
        ^                          /   \
        |                        /       \
+---------------------+    +----------------+
|     MallardDuck     |    | Swim           |
+---------------------+    +----------------+
| + quack(): void     |    | + swim(): void |
+---------------------+    +----------------+
| + swim(): void      |             ^
+---------------------+            / \
                                    |
                             +----------------+
                             |     Float      |
                             +----------------+
                             | + swim(): void |
                             +----------------+
                                    ^
                                    |
                             +----------------+
                             |     Drown      |
                             +----------------+
                             | + swim(): void |
                             +----------------+

+---------------------+         +------------------+
|      Shape          |         |                  |
+---------------------+         |     Point        |
| - center: Point     |         +------------------+
+---------------------+         | - x: double      |
| + area(): double    |         | - y: double      |
| + perimeter(): double |         +------------------+
+---------------------+ 

+---------------------+         +------------------+
|      Circle         |         |     Square       |
+---------------------+         +------------------+
| - radius: double    |         | - sideLength: double |
+---------------------+         +------------------+
| + area(): double    |         | + area(): double    |
| + perimeter(): double |         | + perimeter(): double |
+---------------------+         +------------------+

+---------------------+
|     Rectangle       |
+---------------------+
| - width: double     |
| - height: double    |
+---------------------+
| + area(): double    |
| + perimeter(): double |
+---------------------+
