package Seminar7.view.commands;

import Seminar7.view.ViewConsole;

public class End extends ListCommands {
    @Override
    public void launch(int arg) {
        System.out.println("работа завершена");
        ViewConsole.setStopProg(false);
    }

    @Override
    public String toString() {
        return "закончить вычисления";
    }
}
