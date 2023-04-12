package Seminar7.view.commands;

public class Split extends ListCommands{
    @Override
    public void launch(int arg) {
        calcFactory.division(arg);
    }
    @Override
    public String toString() {
        return "деление";
    }
}
