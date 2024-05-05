package Abstract;

abstract class TestingAbsClass {
    public abstract int getShape();
}

class ShapeTest extends TestingAbsClass{
//    @Override
//    public abstract int getShape() { // abstract hobe na ekhane
    public int getShape() {
        return 0;
    }
}
