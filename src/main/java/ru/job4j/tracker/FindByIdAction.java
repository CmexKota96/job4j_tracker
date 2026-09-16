package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output output;

    public FindByIdAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Вывод заявки по id ===");
        output.println("Введите id: ");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        output.println(item != null ? item : "Заявка с введенным id: " + id + " не найдена.");
        return true;
    }
}
