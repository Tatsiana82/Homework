import java.util.Arrays;
public class Lesson_1 {
    public static void main(String[] args) {
        System.out.println("\nTask 1: ");
        printThreeWords();
        System.out.println("\nTask 2: ");
        checkSumSign();
        System.out.println("\nTask 3: ");
        printColor();
        System.out.println("\nTask 4: ");
        compareNumbers();
        System.out.println("\nTask 5: ");
        check(6, 4);
        System.out.println("\nTask 6: ");
        positiveNegative(-5);
        System.out.println("\nTask 7: ");
        positiveOrNegative(-3);
        System.out.println("\nTask 8: ");
        printWord("Hello", 3);
        System.out.println("\nTask 9: ");
        System.out.println(checkYear(1904));
        System.out.println("\nTask 10: ");
        invertArray();
        System.out.println("\nTask 11: ");
        fillArray(100);
        System.out.println("\nTask 12: ");
        System.out.println(Arrays.toString(
                changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        System.out.println("\nTask 13: ");
        twoDimensionalIntegerArr();
        System.out.println("\nTask 14: ");
        twoArguments(3, 5);
    }


    //Task_1
    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Task_2
    public static void checkSumSign() {

        int a = -1;
        int b = 0;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Task_3
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //Task_4
    public static void compareNumbers() {
        int a = 10;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }
    }
    //Task_5

    public static boolean check(int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Task_6
    static void positiveNegative(int a) {

        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {

            System.out.println("Число " + a + " отрицательное");
        }
    }

    //Task_7
    public static boolean positiveOrNegative(int d) {
        if (d < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Task_8
    public static void printWord(String str, int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    //Task_9
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    //Task_10
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Task_11
    public static void fillArray(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }
    //Task_12
    static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }
    //Task_13
    public static void twoDimensionalIntegerArr() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = arr[i].length - 1; j < arr[i].length; j++, k--) {
                if (i == j || i == k) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    //Task14
    public static void twoArguments(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + " " + arr[i] + " ");
        }
    }
}