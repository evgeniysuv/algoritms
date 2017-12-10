package other;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        return value == 0 ? 1 : value * factorial(value - 1);
    }
}
