public class Point {
    private double x;
    private double y;

    // normal constructor
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // copy constructor -- builds a new Point using another Point's values
    // useful so two Points don't accidentally share the same object
    Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    double getX() { return x; }
    double getY() { return y; }

    // adds this point and another point, returns a brand new Point
    // does NOT change either original point
    Point add(Point other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        return new Point(newX, newY);
    }

    // subtracts another point from this point, returns a brand new Point
    Point subtract(Point other) {
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        return new Point(newX, newY);
    }

    // distance formula between this point and another point
    double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
