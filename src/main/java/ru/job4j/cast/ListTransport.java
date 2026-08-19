package ru.job4j.cast;

public class ListTransport {
    public static void main(String[] args) {
        Vehicle planeTU134 = new Plane();
        Vehicle planeSU35 = new Plane();
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();

        Vehicle[] transport = new Vehicle[]{planeTU134, planeSU35, bus1, bus2, train1, train2};
        for (Vehicle object : transport) {
            object.move();
            object.area();
        }
    }
}
