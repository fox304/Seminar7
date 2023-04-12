package Seminar7.model;
/*
реализует вариант подсчета с логированием
 */
public class LogCalc implements ICalculable {
    private final ConsoleLogs consoleLogs = new ConsoleLogs();
    private final StringBuffer stringBuffer = new StringBuffer();
    double res;


    @Override
    public void sum(int x) {
        stringBuffer.append(" + ");
        stringBuffer.append(x);
        res += x;
    }

    @Override
    public void multiplier(int x) {
        stringBuffer.append(" * ");
        stringBuffer.append(x);
        res *= x;
    }

    @Override
    public void subtruction(int x) {
        stringBuffer.append(" - ");
        stringBuffer.append(x);
        res -= x;
    }

    @Override
    public void division(int x) {
        stringBuffer.append(" / ");
        stringBuffer.append(x);

        res /= x;
    }

    @Override
    public void setFirstArg(double firstArg) {
        stringBuffer.append(firstArg);
        res = firstArg;
    }

    @Override
    public void getResult() {
        stringBuffer.append(" = ");
        stringBuffer.append(res);
        System.out.println(stringBuffer);
        consoleLogs.printLog(stringBuffer);
        stringBuffer.replace(0, 100, String.valueOf(res));
    }

}
