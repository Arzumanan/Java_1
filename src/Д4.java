public class Д4 {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }
        //Задача 2

        int base = 5;
        int power = 1;
        int result = base;

        while (result < 10000) {
            System.out.println(base + " в степени " + power + " = " + result);
            power++;
            result = (int) Math.pow(base, power);
                }

        //Задача 3
        int start = 40;
        int end = 60;

        System.out.println("Использование конструкции if:");
        for (int i = start; i <= end; i++)
        {if (i % 4 == 0) {
            System.out.print(i + " ");
                    }
                }

        System.out.println("\nБез использования конструкции if:");
                for (int i = start; i <= end; i += 4) {
                    System.out.print(i + " ");
                }

        //Задача 4
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма всех значений массива: " + sum);
        //Задача 5
        int[] arrayу = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        //Задача 6
        int[] arrayуy = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = arrayуy[0];

        for (int i = 1; i < arrayуy.length; i++) {
            if (arrayуy[i] < min) {
                min = arrayуy[i];
            }
        }
        System.out.println("Минимальное значение массива: " + min);

        //Задача 7
        int[] arrayyyy = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double average = (double) suma / array.length;
        System.out.println("Среднее арифметическое всех значений массива: " + average);
        //Задача 8
        int[] array1 = {1, 2, -3, 4, -5, 6, -7, 8, -9};
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array1[i] > 0) {
                positiveCount++;
            } else if (array1[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);

        //Задача 9
                int n = 10;
                int[] series = new int[n];
                series[0] = 1;
                series[1] = 1;

                for (int i = 2; i < n; i++) {
                    series[i] = series[i - 1] + series[i - 2];
                }

                for (int num : series) {
                    System.out.print(num + " ");
                }
        }
}