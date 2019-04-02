package HomeWork_02;

import java.util.Arrays;

/*  Урок 2. Основные конструкции
    Задачи:
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
*/

public class MainClass {
    public static void main(String[] args) {

        int[] mass = {1,0,1,1,1,0,0,1,0,0};
        int[] mass2 = new int[8];
        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        reverseBinArray(mass);
        mass2 = addEveryThird(mass2);
        mass3 = doubleIfLessSix(mass3);

        //во время решения задачи №4 выяснилось что число количества строк (столбцов) в матрице должно быть не четным
        //иначе пересечение диагональных линий задействует более одной клетки
        matrixDi(13);

        minAndMax(mass3);

    }

    public static void reverseBinArray(int[] m) {
        System.out.println("Исходный Массив  : " + Arrays.toString(m));
        for (int i = 0; i < m.length ; i++) {
            m[i] = m[i] == 1 ? 0 : 1;
        }
        System.out.println("Измененный Массив: " + Arrays.toString(m));

    }

    public static int[] addEveryThird (int[] m) {
        for (int i = 0; i < m.length ; i++) {
            m[i] = i * 3;
        }
        System.out.println("Произведено заполнение массива длиной "+ m.length + " данными : " + Arrays.toString(m));
        return m;
    }

    public static int[] doubleIfLessSix (int[] m){
        System.out.println();
        System.out.println("Умножение элементов массива со значением ниже 6 на 2");
        System.out.println("Исходный массив         : "+ Arrays.toString(m));

        for (int i = 0; i <m.length ; i++) {
            if (m[i] < 6) {
                m[i] = m[i] * 2;
            }
        }
        System.out.println("Результат работы метода : " + Arrays.toString(m));
        return m;
    }

    //Метод используемый в задании №4
    public static void matrixDi (int x) {
        //создаем массив с заданным размером
        int[][] mx = new int[x][x];
        //используем один цикл для заполнения
        for (int i = 0; i < x; i++) {
            mx[i][i] = 1;
            mx[i][(x-1)-i] = 1;
        }
        //выводим результат в консоль
        System.out.println();
        System.out.println("Двумерный массив размером " + x + "x" + x + "диагональные элементы заполнены единицами:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x ; j++) {
                System.out.print(mx[i][j]);
            }
            System.out.println();
        }
    }

    //Метод для задания №5. Находит минимальное и максимальное число массива
    public static void minAndMax (int[] m) {
        int min = m[0];
        int max = m[0];
        System.out.println();
        System.out.println("Массив : " + Arrays.toString(m));
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max) max = m[i];
            if (m[i] < min) min = m[i];
        }
        System.out.println("Минимальное : " + min);
        System.out.println("Максимальное: " + max);

    }
}
