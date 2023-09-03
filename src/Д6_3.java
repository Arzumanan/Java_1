public class Д6_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        double quotient = divide(a, b);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Деление на 0 невозможно");
        }
    }
}
