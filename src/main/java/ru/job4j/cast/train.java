package ru.job4j.cast;

public class train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Поезд движется со скоростью 120км/ч");
    }

    @Override
    public void area() {
        System.out.println(getClass().getSimpleName() + " Поезд ездит по рельсам");
    }
}
