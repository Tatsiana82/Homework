//junit

public class Factorial {
    public static long factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");

        }
        if (n == 0) {
            return 1;

        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}