package Lesson_4;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"19", "--", "21", "++"}, {"13", "//", "15", "*"}};
        try {
            int sum = MyArray.sum2DArray(array);
            System.out.println("Sum of array " + sum);

        } catch (MyArraySizeException e) {
            System.out.println("Array size exception " + e.getMessage());
        } catch (MyArrayDataException e) {

            System.out.println("Data exception (" + e.getRow() + ","
                    + e.getColumn() + "): " + e.getMessage());
        }
    }
}