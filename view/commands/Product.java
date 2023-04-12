package Seminar7.view.commands;

public class Product extends ListCommands{
    @Override
    public void launch(int arg) {
        calcFactory.multiplier(arg);
    }
    @Override
    public String toString() {
        return "умножение";
    }
}
