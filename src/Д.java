public class Д {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;

        System.out.println("Среднее арифметическое всех значений массива: " + average);
        String name;
        int age;
        String city;
        city = "@аа";
        System.out.println(city);
    }
}