public class Д2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int sum = a + b;
        System.out.println(sum);
        int difference = a - b;
        System.out.println(difference);
        int multiplication = a * b;
        System.out.println(multiplication);
        int division = a / b;
        System.out.println(division);
        int remainder = a % b;
        System.out.println(remainder);

        int parity = division / 2;
            System.out.println(parity);

        // Java символы представляются с помощью типа данных char (int это числа), в кодировке Unicode.
        //Задача №3
        char smiley = '\u263A';
        System.out.println(smiley);

        //Задача №2
        int booty = 1000;
        int pirates = 5;

        int owner = booty / 2;
        System.out.println("Полагается владельцу" + owner);
        int captain = owner / 2;
        System.out.println("Полагается капитану" + captain);
        int team = (booty - owner - captain) / (pirates + 1);
        System.out.println("Полагается пирату" + team);





    }
    }
