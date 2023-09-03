public class Д5 {
    public static void main(String[] args) {
        // 1.Задание
//        String s = "Перестановочный алгоритм быстрого действия";
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'о') {
//                System.out.println(s.charAt(i));
//            }
//        }
        //Задача 2
//        String s = "Перевыборы выбранного президента";
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'е') {
//                count++;
//            }
//        }
//
//        System.out.println("Количество букв 'е' в строке: " + count);
        //Задание 3
//        String s = "Посмотрите как Рите нравится ритм";
//        String target = "рит";
//
//        s = s.toLowerCase(); // смог только с приведением в нижний регистр
//
//        for (int i = 0; i < s.length() - target.length() + 1; i++) {
//            if (s.substring(i, i + target.length()).equals(target)) {
//                System.out.print(i + " ");
//            }
//        }
        //Экстра
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;

        for (String[] row : array) {
            boolean containsE = false;

            for (String element : row) {
                if (element.contains("е")) {
                    containsE = true;
                    break;
                }
            }

            if (!containsE) {
                count++;
            }
        }

        System.out.println("Количество строк, не содержащих букву 'е': " + count);
    }
}
