package Seminar7.model;

public interface ICalculable {
    ICalculable sum(int x);
    ICalculable multiplier(int x);
    ICalculable subtruction(int x);
    ICalculable division(int x);
    void setFirstArg(int firstArg);
    double getResult();
}
