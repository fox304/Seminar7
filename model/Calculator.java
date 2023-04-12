package Seminar7.model;

public class Calculator implements ICalculable{
    private int firstArg;

    public void setFirstArg(int firstArg) {
        this.firstArg = firstArg;
    }

    @Override
    public ICalculable sum(int x) {
        firstArg+=x;
        return null;
    }

    @Override
    public ICalculable multiplier(int x) {
        firstArg*=x;
        return null;
    }

    @Override
    public ICalculable subtruction(int x) {
        firstArg-=x;
        return null;
    }

    @Override
    public ICalculable division(int x) {
        firstArg/=x;
        return null;
    }

    @Override
    public double getResult() {
        System.out.printf("ваш результат %s\n",firstArg);
        return firstArg;
    }
}
