package ru.job4j.oop;

public class DummyDic {

    String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic women = new DummyDic();
        System.out.println(women.engToRus("Пример"));
    }
}
