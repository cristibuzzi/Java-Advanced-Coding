package AdvancedCodingExercise6;

public class Point2D implements Movable {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.x = this.x + moveDirection.getX();
        this.y = this.y + moveDirection.getY();
    }

    public double distanceFrom(Point2D other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - y, 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
