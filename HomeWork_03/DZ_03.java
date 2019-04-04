package HomeWork_03;

/*
    1.  Написать программу, которая загадывает случайное число от 0 до 9,
        и пользователю дается 3 попытки угадать это число.
        При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
        чем загаданное, или меньше.
        После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    2 * Создать массив из слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
         "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
         "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы
 */

import java.util.Random;
import java.util.Scanner;

public class DZ_03 {
    public static void main(String[] args) {


        guessNumber();

    }

    static void guessNumber (){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean playGame = true;
        boolean winGame = false;
        int secretNumb;

        System.out.println("* ИГРА: УГАДАЙ ЧИСЛО *");
        do {
            secretNumb = random.nextInt(10);
            System.out.println("Угадайте число от 0 до 10");

            for (int i = 0; i < 3; i++) {
                if(compareNubers(sc.nextInt(),secretNumb)) {
                    winGame = true;
                    break;
                }
            }
            if (!winGame) {
                System.out.println("Вы не угадали. Загаданное число : " + secretNumb);
            }
            playGame = playAgainQuestion();
        } while (playGame);
    }

    static boolean compareNubers (int playerNumber, int secretNumber){
        if (playerNumber == secretNumber) {
            System.out.println("Вы угадали загаданное число : " + secretNumber);
            return true;
        }
        if (playerNumber > secretNumber) {
            System.out.println("Указанное вами число выше загаданного");
        }
        if (playerNumber < secretNumber) {
            System.out.println("Указанное вами число ниже загаданного");
        }
        return false;
    }

    static boolean playAgainQuestion (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("!НОВАЯ ИГРА!!");
                return true;
            case 0:
                System.out.println("СПАСИБО ЗА ИГРУ :)");
                return false;
            default:
                System.out.println("Вы ввели неизвестный идентификатор");
                playAgainQuestion();
        }
        return false;
    }
}
