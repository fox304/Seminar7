package Seminar7.view.commands;

public class Plus extends ListCommands{

    @Override
    public String toString() {
        return "складывание";
    }

    @Override
    public void launch(int arg) {
        calcFactory.sum(arg);
    }
}
