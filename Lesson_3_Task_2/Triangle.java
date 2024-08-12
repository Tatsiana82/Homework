package Lesson_3_Task_2;

public class Triangle implements Form {
    private double side1;
    private double side2;
    private double side3;
    private String backgroundColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3, String backgroundColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}