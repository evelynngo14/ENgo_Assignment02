package cis3270.assignment02.chapter09;
//(The Rectangle class) Following the example of the Circle class in Section 9.2,
//design a class named Rectangle to represent a rectangle.

public class q01 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.printf("r1: %.2f, %.2f, %.2f, %.2f\n", r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());
        System.out.printf("r2: %.2f, %.2f, %.2f, %.2f", r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
    }

     static class Rectangle {
        double width = 1;
        double height = 1;

        Rectangle() {
        }

        Rectangle(double newWidth, double newHeight) {
            width = newWidth;
            height = newHeight;
        }

        double getWidth() {
            return width;
        }

        double getHeight() {
            return height;
        }

        double getArea() {
            return width * height;
        }

        double getPerimeter() {
            return ((width * 2) + (height * 2));
        }

    }

}
