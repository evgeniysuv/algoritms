package other;

public class QuartApp {
    public static void main(String[] args) {
        String s = "ax2+bx+c = 0";
        double a = 1;
        double b = -8;
        double c = 15;

        Result result = solve(a, b, c);
        System.out.println(result);
    }

    private static Result solve(double a, double b, double c) {
        long result1 = 4000000010L;
        int i = 1000000005;
        result1+=i;
        System.out.println(result1);
        double D = calculateDiscr(a, b, c);
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            return new Result(x1, x2);
        }
        if (D == 0) {
            double result = -b / (2 * a);
            return new Result(result);
        }
        return new Result(false);
    }

    private static double calculateDiscr(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }
}
