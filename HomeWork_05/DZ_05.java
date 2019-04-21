package HomeWork_05;

/*  * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    * Конструктор класса должен заполнять эти поля при создании объекта;
    * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    * Создать массив из 5 сотрудников

    Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
    ...
    persArray[4] = new Person(...);

    * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

public class DZ_05 {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Andrey", "Engineer", "petrov@mail.ru","89109995656", 75000,42);
        persArray[2] = new Person("Sidorova Anna", "HR", "sidorova@mail.ru","89987679898", 87000,45);
        persArray[3] = new Person("Avecene Ivan", "Doctor", "avecene@mail.ru","89109997437", 32000,24);
        persArray[4] = new Person("Pavlov Andrey", "Worker", "pavlov@mail.ru","89109538890", 60000,19);

        //Вывожу на экран информацию о сотрудниках старше 40 лет
        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() > 40){
                persArray[i].info();
                System.out.println(" - - - - - - - - - - - - - -");
            }
        }
    }
}



