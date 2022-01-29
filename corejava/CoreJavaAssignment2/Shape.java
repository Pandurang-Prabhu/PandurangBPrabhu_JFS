class Shapes{
    public static void main(String[] args) {
        Shape rectangle =new Rectangle();
        rectangle.draw();
        Shape cube = new Cube();
        cube.draw();
        Shape line = new Line();
        line.draw();

    }
}


public abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}

class Line extends Shape{
    @Override
    void draw() {
        System.out.println("Line");
    }
}


class Cube extends Shape{
    @Override
    void draw() {
        System.out.println("Cube");
    }
}


