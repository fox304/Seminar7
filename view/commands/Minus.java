package Seminar7.view.commands;

public class Minus extends ListCommands {


    @Override
    public void launch(int arg) {
        calcFactory.subtruction(arg);

    }

    @Override
    public String toString() {
        return "вычитание";
    }
}
