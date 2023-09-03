public class Д6_2 {
    public static void main(String[] args){
//        Задача №1

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                System.out.print(array[j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < array.length - i; j++) {
                System.out.print(array[j] + "  ");
            }
            System.out.println();
        }
        int[] array2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = array2.length / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j < array2.length - i; j++) {
                System.out.print(array2[j] + " ");
            }
            System.out.println();
        }



    }
}
