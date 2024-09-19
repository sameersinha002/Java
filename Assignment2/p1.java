// package Assignment2;

public class p1 {
    public static void main(String[] args) {
        Square s = new Square(10);
        Triangle t = new Triangle(10, 10, 10);
        Circle c = new Circle(10);

        s.draw();
        s.erase();
        t.draw();
        t.erase();
        c.draw();
        c.erase();
    }

}

abstract class Shape {

    abstract void draw();

    abstract void erase();
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Circle with Radius: " + this.radius);
    }

    void erase() {
        System.out.println("\nErased Circle");
    }
}

class Triangle extends Shape {
    int a, b, c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void draw() {
        System.out.printf("Triangle with sides: %d, %d, %d", this.a, this.b, this.c);
    }

    void erase() {
        System.out.println("\nErased Triangle");
    }
}

class Square extends Shape {
    int length;

    Square(int length) {
        this.length = length;
    }

    void draw() {
        System.out.printf("Square with length %d", this.length);
    }

    void erase() {
        System.out.println("\nErased Square");
    }

}