package Seminar7.view.menu;

import Seminar7.view.Errors;
import Seminar7.view.commands.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuConsole {
    Scanner scanner = new Scanner(System.in);
    private final List<ListCommands> list = new ArrayList<>();

    public List<ListCommands> getList() {
        return list;
    }

    public void initCommands() {
        list.add(new Minus());
        list.add(new Plus());
        list.add(new Product());
        list.add(new Split());
        list.add((new End()));
    }

    public void optionMenu() {
        System.out.println("выберите соответствующий пункт меню:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s) %s\n", i + 1, list.get(i));
        }

    }

    public ListCommands choise() {
        int option = Errors.menuErrors(list.size());
        return list.get(option - 1);
    }
}
