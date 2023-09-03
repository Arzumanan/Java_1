public class Д6_1 {
    public static void main(String[] args){
       // 1.Задание
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int sum = 0;
//
//        for (int i = 0;i < array.length; i++) {
//            for(int j = 0; j < array[i].length; j++){
//                sum += array[i][j];
//            }
//        }
//        System.out.println(sum + " сумму элементов массива.");
        // 2.Задание необходимо вывести максимальное значение массива.
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int max = array[0][0];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                }
//            }
//        }
//        System.out.println(max);
        // 3. Задание необходимо вывести минимальное значение массива.
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int min = array[0][0];
//
//                for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] < min) {
//                    min = array[i][j];
//                }
//            }
//        }
//        System.out.println(min);
                // 4.Задание. Колличество элдементов в массиве
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count += array[i].length;
        }

        System.out.println( count);






  }
}
