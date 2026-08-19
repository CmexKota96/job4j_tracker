package ru.job4j.cast;

public class ListTransport {
    public static void main(String[] args) {
        Vehicle planeTU134 = new plane();
        Vehicle planeSU35 = new plane();
        Vehicle bus1 = new bus();
        Vehicle bus2 = new bus();
        Vehicle train1 = new train();
        Vehicle train2 = new train();

        Vehicle[] transport = new Vehicle[]{planeTU134, planeSU35, bus1, bus2, train1, train2};
        for (Vehicle object : transport) {
            object.move();
            object.area();
        }
    }
}
