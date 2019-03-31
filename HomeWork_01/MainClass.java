package HomeWork_01;

/*
    Практическое задание:
    1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    Выполнил Изотов Д.И.
*/

public class MainClass {
    public static void main(String[] args) {
        byte a = 1;
        short b = 13402;
        int c = 142556;
        long d = 30000000098768760l;
        float e = 23.5f;
        double f = 24.53;
        char g = 120;
        boolean h = true;
        String str = "Some text";

        System.out.println("Результат работы метода uravnenie = " + uravnenie(2,3,4,5));
        System.out.println("Результат работы метода twonumber = " + twonumber(10,10));
        System.out.println("Результат работы метода isNegative = " + isNegative(-5));

        positiveOrNegative(-1);
        helloYou("Иван");
        leapYear(2016);


    }

    public static int uravnenie(int a,int b,int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean twonumber (int a, int b) {
        if (10 < (a + b) && (a + b) <= 20) {
            return true;
        }else {
            return false;
        }
    }

    public static void positiveOrNegative(int a) {
        System.out.println( a >= 0 ? a + " положительное число" : a + " отрицательное число");

    }

    public static boolean isNegative (int a) {
        return (a < 0 ? true : false);
    }

    public static void helloYou (String name) {
        System.out.println("Привет, "+ name +"!");

    }

    public static void leapYear(int a) {
        if (a % 4 != 0 || (a % 100 == 0 && a % 400 !=0)){
            System.out.println(a + " год не високосный");
        } else {
            System.out.println(a + " год високосный");
        }
    }
}
