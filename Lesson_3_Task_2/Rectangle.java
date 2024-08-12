package Lesson_3_Task_2;

public class Rectangle implements Form {
    private double width;
    private double height;
    private String backgroundColor;
    private String borderColor;

    public Rectangle(double width, double height, String backgroundColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateArea() {
        return width * height;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}