package Lesson_3_Task_2;
    public class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(7, "Green", "Red");
            Rectangle rectangle = new Rectangle(6, 8, "Grey", "Black");
            Triangle triangle = new Triangle(5, 6, 7, "Pink", "Red");

            System.out.println("Circle:");
            circle.information();
            System.out.println();

            System.out.println("Rectangle:");
            rectangle.information();
            System.out.println();

            System.out.println("Triangle:");
            triangle.information();
            System.out.println();
    }
}