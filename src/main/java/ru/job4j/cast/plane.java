package ru.job4j.cast;

public class plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Самолёт движется со скростью 400км/ч");
    }

    @Override
    public void area() {
        System.out.println(getClass().getSimpleName() + " Самолёт летает по небу");
    }
}
