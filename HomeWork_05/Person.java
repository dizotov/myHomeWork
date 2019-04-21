package HomeWork_05;

public class Person {

    private String fio;
    private String doljnost;
    private String email;
    private String phoneNumber;
    private int zp;
    private int vozrast;

    public Person (String fio, String doljnost, String email, String phoneNumber, int zp, int vozrast) {
        this.fio = fio;
        this.doljnost = doljnost;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zp = zp;
        this.vozrast = vozrast;

    }

    // метод выводит всю информацию о сотруднике
    public void info(){
        System.out.println("Сотрудник: " + this.fio);
        System.out.println("Должность: " + this.doljnost);
        System.out.println("e-mail: " + this.email);
        System.out.println("Телефон: " + this.phoneNumber);
        System.out.println("Зарплата: " + this.zp);
        System.out.println("Возраст: " + this.vozrast);
    }

    public int getAge(){
        return this.vozrast;
    }
}
