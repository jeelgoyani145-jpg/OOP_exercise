public class pra12 {
    static double calculateVolume(double side) {
        return side * side * side;
    }

    static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    static double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        System.out.printf("Volume of Cube (side=3): %.2f%n", calculateVolume(3));
        System.out.printf("Volume of Rectangular Cube (2x3x4): %.2f%n", calculateVolume(2, 3, 4));
        System.out.printf("Volume of Sphere (radius=5): %.2f%n", calculateVolume(5, true));
    }
}
