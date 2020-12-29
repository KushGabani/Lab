import java.util.*;

abstract class Shape {
    protected double area;
    abstract public void area();
}

class Triangle extends Shape {
    int base;
    int height;

    Triangle() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of the triangle : ");
        this.base = in.nextInt();
        System.out.print("Enter the height of the triangle : ");
        this.height = in.nextInt();
    }

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void area() {
        this.area = 0.5 * this.base * this.height;
        System.out.println("The area of the triangle is : " + this.area);
    }
}

class Rectangle extends Shape {
    int side_a;
    int side_b;

    Rectangle() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side a of the rectangle : ");
        this.side_a = in.nextInt();
        System.out.print("Enter the side b of the rectangle : ");
        this.side_b = in.nextInt();
    }

    Rectangle(int side_a, int side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public void area() {
        this.area = this.side_a * this.side_b;
        System.out.println("The area of the rectangle is : " + this.area);
    }
}

class Circle extends Shape {
    int radius;

    Circle() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the Circle : ");
        this.radius = in.nextInt();
    }

    Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        this.area = 3.14 * this.radius * this.radius;
        System.out.println("The area of the cirle is : " + this.area);
    }
}

public class Assignment4 {
    public static void main(String[]args) {
        Triangle t1 = new Triangle();
        t1.area();

        Rectangle r1 = new Rectangle();
        r1.area();

        Circle c1 = new Circle();
        c1.area();
    }
}
