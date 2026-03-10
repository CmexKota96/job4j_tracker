package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            result[index] = items[index];
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName() == key) {
                result[index] = items[index];
                count++;
            }
        }
        result = Arrays.copyOf(result, count);
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items[index].setName(item.getName());
            return true;
        } else {
            return false;
        }
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
    }
}