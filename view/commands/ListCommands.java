package Seminar7.view.commands;

import Seminar7.presentor.CalcFactory;

public abstract class ListCommands {
    public static CalcFactory calcFactory;


    public static void setCalcFactory(CalcFactory calcF) {
        calcFactory = calcF;
    }

    public abstract void launch(int arg);

}
