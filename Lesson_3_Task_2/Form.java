package Lesson_3_Task_2;

public interface Form {
    double calculatePerimeter();
    double calculateArea();
    String getBackgroundColor();
    String getBorderColor();

    default void information() {
        System.out.println("Perimeter: " + calculatePerimeter());

        System.out.println("Area: " + calculateArea());

        System.out.println("BackgroundColor: " + getBackgroundColor());

        System.out.println("BorderColor: " + getBorderColor());
    }
}