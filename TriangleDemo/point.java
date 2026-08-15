public class Point {
    private double x;
    private double y;
 //  for coordinate and distance calculations we make a point class with x and y coordinates
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
 
    double getX() { return x; }
    double getY() { return y; }
 
    // distance formula between this point and another point
    // distance formula between this point and another point
    // calculate straight line distance between two points in 2D space
    // other is another point object for which we want to calculate the distance from this point
    double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
 
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
 
