//testng

public class Factorial {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");

        }
        if (n == 0) {
            return 1;

        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
}

public static void main(String[] args) {
    Factorial calculator = new Factorial();
    int number = 10;
    System.out.println("Factorial of " + number + " is " + calculator.factorial(number));

    }
}