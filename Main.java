package Seminar7;

import Seminar7.model.Calculator;
import Seminar7.presentor.CalcFactory;
import Seminar7.view.IViewCalc;
import Seminar7.view.ViewConsole;

public class Main {
    public static void main(String[] args) {
        IViewCalc iViewCalc = new ViewConsole();
        CalcFactory calcFactory = new CalcFactory(new Calculator(),iViewCalc);
        iViewCalc.start();
    }
}
