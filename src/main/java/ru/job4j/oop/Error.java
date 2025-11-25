package ru.job4j.oop;

public class Error {

    private boolean flag;
    private int number;
    private String name;

    public Error() {

    }

    public Error(boolean flag, int number, String name) {
        this.flag = flag;
        this.number = number;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Наличие ошибки: " + flag);
        System.out.println("Код ошибки: " + number);
        System.out.println("Имя ошибки: " + name);
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 404, "Не найдена страница");
        error1.printInfo();
        Error error2 = new Error(false, 500, "Нет соединения с сервером");
        error2.printInfo();
        Error error3 = new Error();
        error3.printInfo();
    }
}
