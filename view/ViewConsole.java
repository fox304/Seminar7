package Seminar7.view;

import Seminar7.presentor.CalcFactory;
import Seminar7.view.commands.End;
import Seminar7.view.commands.ListCommands;
import Seminar7.view.menu.MenuConsole;

import java.util.Scanner;

public class ViewConsole implements IViewCalc {

    CalcFactory calcFactory;
    MenuConsole menuConsole;
    private static boolean stopProg = true;

    public static void setStopProg(boolean stopProg) {
        ViewConsole.stopProg = stopProg;
    }

    public ViewConsole() {
        this.menuConsole = new MenuConsole();

    }

    public void getCalcFactory(CalcFactory calcFactory) {
        this.calcFactory = calcFactory;
        ListCommands.setCalcFactory(calcFactory);


    }

    @Override
    public void start() {

        Scanner scanner = new Scanner(System.in);
        menuConsole.initCommands();

        System.out.println("введите первое число:");
        int first = scanner.nextInt();

        calcFactory.initFirstNumber(first);


        while (stopProg) {
            int nextArg;
            menuConsole.optionMenu();  // печать меню
            ListCommands numberOfCommand = menuConsole.choise(); // выбор команды
            if (numberOfCommand instanceof End) {
                nextArg = menuConsole.getList().indexOf(numberOfCommand);
                numberOfCommand.launch((nextArg));
            } else {
                System.out.println("введите следующий аргумент");
                nextArg = scanner.nextInt();
                numberOfCommand.launch(nextArg);
                calcFactory.getResult();
            }


        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }



}
