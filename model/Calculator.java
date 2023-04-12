package Seminar7.model;

public class Calculator implements ICalculable {
    private int firstArg;

    public void setFirstArg(int firstArg) {
        this.firstArg = firstArg;
    }

    @Override
    public void sum(int x) {
        firstArg += x;
    }

    @Override
    public void multiplier(int x) {
        firstArg *= x;
    }

    @Override
    public void subtruction(int x) {
        firstArg -= x;
    }

    @Override
    public void division(int x) {
        firstArg /= x;
    }

    @Override
    public void getResult() {
        System.out.printf("ваш результат %s\n", firstArg);
    }
}
