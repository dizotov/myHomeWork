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

        selectGame();
    }

    static void selectGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите игру:");
        System.out.println("1. Угадай число");
        System.out.println("2. Угадай слово");
        System.out.println("0. Выход");

        switch (sc.nextInt()) {
            case 1:
                guessNumberGame();
                break;
            case 2:
                guesVegetableGame();
                break;
            case 0:
                break;
            default:
                System.out.println("Вы ввели неизвестный идентификатор");
                selectGame();
        }
    }

    static void guessNumberGame (){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean winGame = false;
        int secretNumb;

        System.out.println("* ИГРА: УГАДАЙ ЧИСЛО *");
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
        if (playAgainQuestion()){
            guessNumberGame();
        } else {
            selectGame();
        };
    }

    static boolean compareNubers (int playerNumber, int secretNumber){
        boolean compare = false;
        if (playerNumber == secretNumber) {
            System.out.println("Вы угадали загаданное число : " + secretNumber);
            compare = true;
        }
        if (playerNumber > secretNumber) {
            System.out.println("Указанное вами число выше загаданного");
        }
        if (playerNumber < secretNumber) {
            System.out.println("Указанное вами число ниже загаданного");
        }
        return compare;
    }

    static void guesVegetableGame(){
        System.out.println("* ИГРА: УГАДАЙ СЛОВО *");
        boolean gameWin = false;
        Scanner sc = new Scanner(System.in);
        String secretVege = randomVege();
        System.out.println("Введите слово на английском языке");
        do {
           if (compareString(sc.nextLine(),secretVege,15)) {
               gameWin = true;

           }
        }while (!gameWin);
        if (playAgainQuestion()){
            guesVegetableGame();
        } else {
            selectGame();
        };
    }

    //на вход передаются параметры: строка которую сравниваем, строка с которой сравниваем, длинна ширмы из хэштегов
    static boolean compareString (String userStr, String answerStr, int secretLength ) {
        boolean compare = false;
        String display = "";

        for (int i = 0; i < secretLength ; i++) {
            if (i < userStr.length() && i < answerStr.length()) {
                if (userStr.equals(answerStr)) {
                    System.out.println("Вы Угадали загаданное слово: " + userStr);
                    compare = true;
                    break;
                }
                if (userStr.charAt(i) == answerStr.charAt(i)) {
                    display += answerStr.charAt(i);
                    continue;
                }
            }
            display += "#";
        }
        System.out.println(display);
        display = "";
        return compare;
    }

    static String randomVege () {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        System.out.println("Компьютер загадал новое слово.");
        return words[random.nextInt(words.length)];

    }

    static boolean playAgainQuestion (){
        boolean playAgain = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("!НОВАЯ ИГРА!!");
                playAgain = true;
                break;
            case 0:
                System.out.println("СПАСИБО ЗА ИГРУ :)");
                System.out.println("");
                playAgain = false;
                break;
            default:
                System.out.println("Вы ввели неизвестный идентификатор");
                playAgainQuestion();
        }
        return playAgain;
    }
}
