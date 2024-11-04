package DesignPattern;

class Facade {
}

interface Shape {
    void draw();
}


class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class ShapeMaker {
    private Shape c;
    private Shape t;
    private Shape s;

    ShapeMaker() {
        c = new Circle();
        t = new Triangle();
        s = new Square();
    }

    void DrawCircle() {
        c.draw();
    }

    void DrawTriangle() {
        t.draw();
    }

    void DrawSquare() {
        s.draw();
    }
}

class TestFacade {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.DrawCircle();
        shapeMaker.DrawSquare();
        shapeMaker.DrawTriangle();
    }
}