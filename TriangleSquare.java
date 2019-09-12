public class TriangleSquare {
    public static void main(String[] args) {
        int[] firstApex = {0, 0};
        int[] secondApex = {0, 10};
        int[] thirdApex = {5, 10};
        try {
            if ((thirdApex[0] - firstApex[0]) / (secondApex[0] - firstApex[0]) == (thirdApex[1] - firstApex[1]) / (secondApex[1] - firstApex[1])) {
                System.out.println("All the points are collinear!");
            }
        } catch (Exception e) {
            System.out.println("Division by zero! May be some apex has a equivalent coordinates or coordinates with a value of '0'");
        }
        double squareOfTriangle = getSquareOfTriangle(firstApex, secondApex, thirdApex);
        if (squareOfTriangle>0){
            System.out.println("The square of triangle is " + squareOfTriangle);
        }
        else System.out.println("Incorrect input data!");
    }

    public static double getSquareOfTriangle(int[] a, int[] b, int[] c) {
        return 0.5 * Math.abs(((b[0] - a[0]) * (c[1] - a[1]) - (c[0] - a[0]) * (b[1] - a[1])));
    }
}