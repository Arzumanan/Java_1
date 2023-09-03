public class Д3 {
    public static void main(String[] args) {
        //Задача 1
        int a = 2;
        int b = 3;
        if (a == b) {
            System.out.println("a = b");
        } else if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        }
        //Задача 3
        int sum = a + b; // Вычисляем сумму переменных
        if (sum % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");

            //Задача 2
            int c = 25;
            if (c > 10) {
                System.out.println("больше 10");
            }
            if (c < 100) {
                System.out.println("меньше 100");
            }
            if (c / 2 > 20) {
                System.out.println("результат деления на 2 больше 20");
            }
            if (c >= 5 && c <= 40) {
                System.out.println("значение переменной между 5 и 40 включительно");
            }
            if (c < 5 || c > 40) {
                System.out.println("значение переменной меньше 5 или больше 40");
            }
        }
    }
}

