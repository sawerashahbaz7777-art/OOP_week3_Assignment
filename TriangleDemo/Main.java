public class Main {

    public static void main(String[] args) {

        // an array of triangles so we don't repeat the same code three times
        Triangle[] triangles = {
            new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3)),
            new Triangle(new Point(0, 0), new Point(2, 0), new Point(1, 2)),
            new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2)) // invalid: straight line
        };

        for (int i = 0; i < triangles.length; i++) {
            System.out.println("----- Triangle " + (i + 1) + " -----");
            triangles[i].describe();
            System.out.println();
        }
    }
}
