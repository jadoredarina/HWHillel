package lesson0411;

public class MyMathUtils {
    public static int sum(int c1, int c2) {
        return c1 + c2;
    }

    public static int subst(int c1, int c2) {
        return c1 - c2;
    }

    public static int multiply(int c1, int c2) {
        return c1 * c2;
    }

    public static double divide(int c1, int c2) {
        if (c2 != 0) {
            return (double) c1 / c2;
        } else {
            System.out.println("Деление на ноль невозможно!");
            return Double.NaN;
        }
    }

    public static double findPercentage(int c1, int c2) {
        return (double) (c1 * 100) / c2;
    }
}




