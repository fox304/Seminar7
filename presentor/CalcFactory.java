package Seminar7.presentor;

import Seminar7.model.ICalculable;
import Seminar7.view.IViewCalc;
/*
презентор
 */
public class CalcFactory {
    private final ICalculable iCalculable;
    private IViewCalc iViewCalc;

    public CalcFactory(ICalculable iCalculable, IViewCalc iViewCalc) {
        this.iCalculable = iCalculable;
        this.iViewCalc = iViewCalc;
        iViewCalc.getCalcFactory(this);
    }

    public void initFirstNumber(double first) {
        iCalculable.setFirstArg(first);
    }

    public void sum(int arg) {
        iCalculable.sum(arg);
    }

    public void multiplier(int arg) {
        iCalculable.multiplier(arg);

    }

    public void subtruction(int arg) {
        iCalculable.subtruction(arg);
    }

    public void division(int arg) {
        iCalculable.division(arg);
    }

    public void getResult() {
        iCalculable.getResult();
    }

    public boolean end() {
        return false;
    }

}
