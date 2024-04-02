package Abstract;

public abstract class Vehicle {
    private Position position;

    public Vehicle(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public abstract void start();

    public abstract void move();

    public abstract void turnLeft();

    public abstract void turnRight();

    public abstract void stop();

    public void goTo(Position pos) {
        start();
        if (position.getX() > pos.getX()) {
            turnLeft();
        }
    }
}
