package HomeWork_06;

public class DZ_06 {
    public static void main(String[] args) {

        int swim = 10;
        int run = 300;
        float jump = 1;

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println(cat1);
        System.out.println("Кот Плывет " + swim + "м: " + cat1.swim(swim));
        System.out.println("Кот Прыгает " + jump + "м: " + cat1.jump(jump));
        System.out.println("Кот Бежит " + run + "м: " + cat1.run(run));

        System.out.println("");
        System.out.println(dog1);
        System.out.println("Пес Плывет " + swim + "м: " + dog1.swim(swim));
        System.out.println("Пес Прыгает " + jump + "м: " + dog1.jump(jump));
        System.out.println("Пес Бежит " + run + "м: " + dog1.run(run));
    }



}
