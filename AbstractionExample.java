

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape{
    void draw(){
        System.out.println("circle");
        double dist;
        double radius = 5;
        for (int i = 0; i <= 2 * radius; i++) {
            // for vertical movement
            for (int j = 0; j <= 2 * radius; j++) {
                dist = Math.sqrt(
                        (i - radius) * (i - radius) +
                        (j - radius) * (j - radius));

                // dist should be in the range (radius - 0.5)
                // and (radius + 0.5) to print stars(*)
                if (dist > radius - 0.5 && dist < radius + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
} 

class Rectangle extends Shape{
    void draw(){
        System.out.println("rectangle");
    }
} 

class Square extends Shape{
    void draw(){
        System.out.println("square");
    }
} 

class Rhombus extends Shape{
    void draw(){
        System.out.println("rhombus");
    }
}
public class AbstractionExample {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();
        Shape rhombus = new Rhombus();

        circle.draw();
        rectangle.draw();
        square.draw();
        rhombus.draw();
    }
}