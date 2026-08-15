// separate demo file just for practicing Point addition/subtraction/copy constructor
public class PointDemo {
    public static void main(String[] args) {

        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 1);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        // addition -- creates a brand new Point, p1 and p2 stay unchanged
        Point sum = p1.add(p2);
        System.out.println("p1 + p2 = " + sum);

        // subtraction
        Point diff = p1.subtract(p2);
        System.out.println("p1 - p2 = " + diff);

        // copy constructor -- p3 is a separate object with the same values as p1
        Point p3 = new Point(p1);
        System.out.println("p3 (copy of p1) = " + p3);

        // proving p3 is a separate object: changing p1 later would not affect p3
        // (we can't directly change x/y here since they're private,
        //  but this is the idea copy constructors protect against)
        System.out.println("p1 and p3 have equal values but are different objects in memory.");
    }
}
