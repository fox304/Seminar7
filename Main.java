package Seminar7;

import Seminar7.model.Calculator;
import Seminar7.model.LogCalc;
import Seminar7.presentor.CalcFactory;
import Seminar7.view.IViewCalc;
import Seminar7.view.ViewConsole;

public class Main {
    public static void main(String[] args) {
        IViewCalc iViewCalc = new ViewConsole();

        // раскомментируйте 15 и закомментируйте 16 строку для простого калькулятора

//        CalcFactory calcFactory = new CalcFactory(new Calculator(),iViewCalc);//простой калкулятор
        CalcFactory calcFactory = new CalcFactory(new LogCalc(), iViewCalc); // добавлено логирование и запись в файл

        iViewCalc.start();
    }
}
