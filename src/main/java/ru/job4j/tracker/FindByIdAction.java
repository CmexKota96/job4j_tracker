package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Вывод заявки по id ===");
        System.out.print("Введите id: ");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        System.out.println(item != null ? item : "Заявка с введенным id: " + id + " не найдена.");
        return true;
    }
}
