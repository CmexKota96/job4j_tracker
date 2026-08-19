package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Автобус движется со скростью 90км/ч");
    }

    @Override
    public void area() {
        System.out.println(getClass().getSimpleName() + " Автобус ездит по дорогам");
    }
}
