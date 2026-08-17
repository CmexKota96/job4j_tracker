package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Автобус движется со скоростью не более 70км/ч");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Кол-во пассажиров:" + count);
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 90;
    }
}
