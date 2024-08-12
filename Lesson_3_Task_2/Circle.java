package Lesson_3_Task_2;

public class Circle implements Form {
    private double radius;
    private String backgroundColor;
    private String borderColor;

    public Circle(double radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

     public String getBorderColor() {
        return borderColor;
    }
}