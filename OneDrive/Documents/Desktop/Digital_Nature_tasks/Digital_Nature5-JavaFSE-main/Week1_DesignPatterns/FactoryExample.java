interface Shape {
    void draw();
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {

    public Shape getShape(String type) {

        if(type.equals("Circle"))
            return new Circle();

        return new Rectangle();
    }
}

public class FactoryExample {

    public static void main(String[] args) {

        ShapeFactory factory =
                new ShapeFactory();

        Shape s =
                factory.getShape("Circle");

        s.draw();
    }
}