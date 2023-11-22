class nikk{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        // Using methods from the superclass
        circle.draw();  // Inherited from Shape
        square.draw();  // Inherited from Shape
        triangle.draw(); // Inherited from Shape

        // Using methods specific to each subclass
        circle.drawCircle();
        square.drawSquare();
        triangle.drawTriangle();
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class 1 (Subclass)
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle");
    }
}

// Child class 2 (Subclass)
class Square extends Shape {
    void drawSquare() {
        System.out.println("Drawing a square");
    }
}

// Child class 3 (Subclass)
class Triangle extends Shape {
    void drawTriangle() {
        System.out.println("Drawing a triangle");
    }
}

