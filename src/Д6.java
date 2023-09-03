public class Д6 {
//    public static void main(String[] args) {
//        //выводит значение элемента массива arr1 на каждой итерации (все числа двумерного массива)
//        int[][] arr1 = {
//                {1, 2, 3},
//                {11, 22, 33},
//                {111, 222, 333},
//        };
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
////                System.out.println(arr1[i][j]);
////            }
////            // System.out.println( arr1[2][2]);
//
//
//        }
//    }
    //Определяется метод sum с двумя параметрами типа
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int z = sum(x,y);
        System.out.println(z);
    }
}