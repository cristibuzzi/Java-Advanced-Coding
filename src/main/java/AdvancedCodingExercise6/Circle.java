package AdvancedCodingExercise6;

public class Circle implements Movable, Resizable {

    private final Point2D center;
    private final Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        point.move(new MoveDirection(getRadius() * resizeFactor, getRadius() * resizeFactor));
    }

    public double getRadius() {
        return center.distanceFrom(point);
    }

    public double getPermiter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
