class Rectangle9 {
    double width, height;

    Rectangle9(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() { return width * height; }
    double getPerimeter() { return 2 * (width + height); }
}

public class pra9 {
    public static void main(String[] args) {
        Rectangle9 r1 = new Rectangle9(4, 40);
        Rectangle9 r2 = new Rectangle9(3.5, 35.9);
        System.out.println("Rectangle 1 -> Width: " + r1.width + ", Height: " + r1.height + ", Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());
        System.out.println("Rectangle 2 -> Width: " + r2.width + ", Height: " + r2.height + ", Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}
